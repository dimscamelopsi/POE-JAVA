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
}
