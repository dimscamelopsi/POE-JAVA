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
}
