package de.telran;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

 /*   public RegistrationPage(WebDriver driver) {
        super(driver);
    }
*/
    @FindBy(xpath = ".//a[@href=\"/login\"]")
    private WebElement loginLink;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordField;

    @FindBy(className = "registration-btn")
    private WebElement registrationButton;

    @FindBy(xpath = ".//select")
    private WebElement userTypeSelector;



}
