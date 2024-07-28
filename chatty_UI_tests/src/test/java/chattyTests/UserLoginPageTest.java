package chattyTests;

import core.BaseTest;
import de.telran.LoginPage;
import de.telran.utils.ConfigProvider;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserLoginPageTest extends BaseTest {
    String email = ConfigProvider.USER_EMAIL;
    String wrongValue = "someVal";
    String emailError = "Incorrect email";
    String passwordError = "Password must be 8-100 characters and include at least one letter and one digit";

    @Test
    public void wrongEmailTest() {
        LoginPage loginPage = new LoginPage();
        loginPage
                .checkLoginValidation(wrongValue);
        assertEquals(emailError, loginPage
                .emailErrorText());
    }

    @Test
    public void incorrectPasswordFormatTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterEmailValue(email);
        loginPage.enterPasswordValue(wrongValue);
        assertEquals(passwordError, loginPage.passwordErrorText());
    }
}
