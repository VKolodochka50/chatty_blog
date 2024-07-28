package de.telran;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminConsolePage extends BasePage {

 /*   public AdminConsolePage(WebDriver driver) {
        super(driver);
    }
*/
    @FindBy(xpath = "//*[@class='search-email']/input")
    private WebElement userSearchField;

    @FindBy(className = "email-btn")
    private WebElement searchButton;

    @FindBy(className = "admin-btn")
    private WebElement loadMoreButton;

    @FindBy(xpath = "//tr[@data-test='userRow']")
    private WebElement userTableRows;

    //@FindBy(xpath = "(//td[contains(text(),'"+ email +"')]/..)")
    //This was an experiment - attempt to define a specific row in the grid with user-record that can be
    //used for modify or delete specific user record. Unfortunately it's not easy to make that within usage of @FindBy
    //annotation

    @FindBy(xpath = "email")
    private WebElement userRowByEmail;

}
