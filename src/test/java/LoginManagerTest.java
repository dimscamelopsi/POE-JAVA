import fr.aelion.models.Student;
import fr.aelion.repositories.StudentRepository;
import fr.aelion.user.LoginManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginManagerTest {
    LoginManager loginManager;
    @BeforeEach
    public void setup() {
        loginManager = new LoginManager("toutou","youtou");
    }
    @Test
    @DisplayName("Login and password should be 'toutou' and 'youtou'")
    public void haveCredentials() {
        assertAll("Credentials",
                () -> assertEquals("toutou", this.loginManager.getLogin()),
                () -> assertEquals("youtou", this.loginManager.getPassword())
                );
    }

    @Test
    @DisplayName("Should return 200 if credentials are good")
    public void goodCredentials() {
        assertEquals("200 OK", this.loginManager.login());
    }

    @Test
    @DisplayName("Should return 404 if wrong")
    public void badCredentials() {
        LoginManager loginManager = new LoginManager("touou","youou");
        assertEquals("404 Not Found", loginManager.login());
    }

    @Test
    @DisplayName("Student should be logged in")
    public void studentLogin() {
        StudentRepository studentRepository = this.loginManager.getStudentRepository();
        Student student = studentRepository.findByLoginAndPassword("toutou","youtou");

        assertEquals(false, student.isLoggedIn());

        this.loginManager.login();

        assertEquals(true, student.isLoggedIn());
    }

    @Test
    @DisplayName("Student is logged out")
    public void studentLogout() {
        StudentRepository studentRepository = this.loginManager.getStudentRepository();
        Student student = studentRepository.findByLoginAndPassword("toutou","youtou");

        assertEquals(true, student.isLoggedIn());

        this.loginManager.logout();

        assertEquals(false, student.isLoggedIn());
    }
}
