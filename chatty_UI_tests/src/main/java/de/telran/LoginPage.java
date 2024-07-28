package de.telran;

import de.telran.utils.ConfigProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(className = "registration-btn")
    private WebElement loginButton;

    @FindBy(xpath = ".//*[@class=\"link\"]/a")
    private WebElement signUpTopLink;

    @FindBy(xpath = "(.//a[@href=\"/registration\"])[2]")
    private WebElement signInDownLink;

    @FindBy(xpath = "(//div/div[@class='text-error'])")
    private WebElement loginError;

    @FindBy(xpath = ".//input[@name='email']/preceding::div[1]")
    private WebElement emailError;

    @FindBy(xpath = ".//input[@name='password']/preceding::div[1]")
    private WebElement passwordError;

    public void enterEmailValue(String emailValue) {
        emailField.sendKeys(emailValue);
    }

    public void enterPasswordValue(String passwordValue) {
        passwordField.sendKeys(passwordValue);
    }

    public String loginErrorText() {
        return loginError.getText();
    }

    public String emailErrorText() {
        return emailError.getText();
    }

    public String passwordErrorText() {
        return passwordError.getText();
    }

    public LoginPage checkLoginValidation(String emailValue){
        emailField.sendKeys(emailValue);
        emailError.getText();
        return this;
    }

    public RegistrationPage clickSignUpButton() {
        signUpTopLink.click();
        return new RegistrationPage();
    }

    public UserHomePage loginAsUser() {
        loginButton.click();
        return new UserHomePage();
    }

    public AdminConsolePage loginAsAdmin() {
        loginButton.click();
        /*if (loginError.isDisplayed()) {
            //Call logger, get error text and write appropriate message to console
            driver.quit();
        }*/
        return new AdminConsolePage();
    }
}
