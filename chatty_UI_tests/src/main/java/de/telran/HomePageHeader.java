package de.telran;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHeader extends BasePage {
 /*   public HomePageHeader(WebDriver driver) {
        super(driver);
    }*/

    @FindBy(xpath = "//li/a[@href='/homeblog']")
    private WebElement headerBlogHomePage;

    @FindBy(xpath = "//li/a[@href='/about']")
    private WebElement headerBlogAboutPage;

    @FindBy(xpath = "//li/a[@href='/contact']")
    private WebElement getHeaderBlogContactPage;

    @FindBy(className = "header__user header__menu")
    private WebElement userAccountMenu;

    @FindBy(className = "dropdown-menu")
    private WebElement userMenuList;

    @FindBy(xpath = "//a[@href=\"/userprofile\"]")
    private WebElement userProfileMenuItem;

    @FindBy(xpath = "//a[@href=\"/draft\"]")
    private WebElement userDraftsMenuItem;

    @FindBy(xpath = "//a[@href=\"/users\"]")
    private WebElement adminPanelMenuItem;

    @FindBy(xpath = "//a[@href=\"/login\"]")
    protected WebElement accountLogoutMenuItem;

    @FindBy(xpath = "//div/a[@href='/homeblog']")
    private WebElement headerBlogLogoHomePage;

   /* public UserProfilePage goToProfilePage() {
        new Actions(driver)
                .moveToElement(userAccountMenu)
                .moveToElement(userProfileMenuItem)
                .click()
                .build().perform();
        return new UserProfilePage(driver);
    }*/

   /* public UserDraftsPage goToDraftsPage() {
        new Actions(driver)
                .moveToElement(userAccountMenu)
                .moveToElement(userDraftsMenuItem)
                .click()
                .build().perform();
        return new UserDraftsPage(driver);
    }

    public UserHomePage goToHomePageViaHeader() {
        headerBlogHomePage.click();
        return new UserHomePage(driver);
    }*/
}
