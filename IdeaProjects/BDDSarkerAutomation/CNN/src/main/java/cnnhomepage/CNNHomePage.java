package cnnhomepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static cnnhomepage.CNNHomePageElements.*;

public class CNNHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementOpinionButton)
    private WebElement opinionButton;
    @FindBy(how = How.XPATH, using = webElementOpinionText)
    private WebElement opinionText;
    @FindBy(how = How.XPATH, using = webElementTravelButton)
    private WebElement travelButton;
    @FindBy(how = How.XPATH, using = webElementDestinationsButton)
    private WebElement destinationButton;
    @FindBy(how = How.XPATH, using = webElementBrazilLink)
    private WebElement brazilLink;
    @FindBy(how = How.XPATH, using = webElementBrazilText)
    private WebElement brazilText;
    @FindBy(how = How.XPATH, using = webElementTokyoLink)
    private WebElement tokyoLink;
    @FindBy(how = How.XPATH, using = webElementTokyoText)
    private WebElement tokyoText;
    @FindBy(how = How.XPATH, using = webElementAbuDhabiLink)
    private WebElement abuDhabiLink;
    @FindBy(how = How.XPATH, using = webElementLinkText)
    private WebElement abuDhabiLinkText;
    @FindBy(how = How.XPATH, using = webElementLiveTVButton)
    private WebElement liveTVButton;
    @FindBy(how = How.XPATH, using = webElementLiveTVPlayButton)
    private WebElement liveTVPlayButton;
    @FindBy(how = How.XPATH, using = webElementPopUpWindow)
    private WebElement popUpWindow;
    @FindBy(how = How.XPATH, using = webElementUserIdIcon)
    private WebElement userIdIcon;
    @FindBy(how = How.CLASS_NAME, using = webElementUserIdWindow)
    private WebElement userIdWindow;
    @FindBy(how = How.XPATH, using = webElementUserIdWindowUserEmail)
    private WebElement userIdWindowUserEmail;
    @FindBy(how = How.XPATH, using = webElementUserIdWindowUserPassword)
    private WebElement userIdWindowUserPassword;
    @FindBy(how = How.XPATH, using = webElementUserIdWindowUserPasswordEye)
    private WebElement userIdWindowUserPasswordEye;
    @FindBy(how = How.XPATH, using= webElementPhotosLink)
    public WebElement photosLink;
    @FindBy(how = How.XPATH, using= webElementEuropeLink)
    public WebElement europeLink;
 @FindBy(how = How.XPATH, using= webElementEuropeText)
    public WebElement europeText;
 @FindBy(how = How.XPATH, using= webElementAustraliaLink)
    public WebElement australiaLink;
 @FindBy(how = How.XPATH, using= webElementAustraliaText)
    public WebElement australiaText;

    public void doClickOnOpinionButton() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(opinionButton));
        opinionButton.click();
    }

    public String userWouldSeeOpinionText() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(opinionText));
        return opinionText.getText();

    }

    public void doClickOnTravelButton() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(travelButton));
        travelButton.click();
    }

    public void doClickOnDestinationButton() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(destinationButton));
        destinationButton.click();
    }

    public void doClickOnBrazilLink() {
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(brazilLink));
        brazilLink.click();
    }

    public String userWillSeeBrazilText() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(brazilText));
        return brazilText.getText();

    }

    public void doClickOnTokyoLink() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(tokyoLink));
        tokyoLink.click();
    }

    public boolean tokyoTextIsDisplayed() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(tokyoText));
        return tokyoText.isDisplayed();
    }

    public void doClickOnAbuDhabiLinks() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(abuDhabiLink));
        clickOnElement(abuDhabiLink);
    }

    public String validateAbuDhabiText() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(abuDhabiLinkText));
        return abuDhabiLinkText.getText();
    }

    public void doClickOnLiveTvButton() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(liveTVButton));
        clickOnElement(liveTVButton);

    }

    public void doClickOnLiveTvPlayButton() {
        new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(liveTVPlayButton));

        clickOnElement(liveTVPlayButton);


    }

    public boolean isPopUpWindowDisplayed() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(popUpWindow));

        return popUpWindow.isDisplayed();

    }

    public void doClickOnUserIdIcon() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(userIdIcon));
        clickOnElement(userIdIcon);
    }

    public void doUserWriteEmail() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.switchTo().window(webElementUserIdWindow);
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(userIdWindowUserEmail));

        userIdWindowUserEmail.sendKeys("smhrash@yahoo.com");
    }

    public void doUserWritePassword() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(userIdWindowUserPassword));
        // driver.switchTo().frame(userIdWindow);
        userIdWindowUserPassword.sendKeys("abcd1234");
    }

    public void doClickOnUserPasswordEye() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(userIdWindowUserPasswordEye));
        clickOnElement(userIdWindowUserPasswordEye);
    }

    public String getUserPassword() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(userIdWindowUserPassword));

        return userIdWindowUserPassword.getText();

    }
    public void doScrollDownToElement(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        JavascriptExecutor je=(JavascriptExecutor)driver;
        WebElement photos= driver.findElement(By.xpath(webElementPhotosLink));
        je.executeScript("arguments[0].scrollIntoView();",photos);
    }
    public void doClickOnPhotosLink(){
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(photosLink));
        clickOnElement(photosLink);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
    }
    public String getPageTitle(){
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        return driver.getTitle();
    }
    public void doScrollDownToEuropeLink(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        WebElement europe=driver.findElement(By.xpath(webElementEuropeLink));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",europe);

    }
    public void doClickOnEuropeLink(){
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(europeLink));
        clickOnElement(europeLink);
    }
    public String getEuropeText(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        return europeText.getText();
    }
    public void doScrollDownToAustraliaLink(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        WebElement australia=driver.findElement(By.xpath(webElementAustraliaLink));
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",australia);

    }
    public void doClickOnAustraliaLink(){
        new WebDriverWait(driver,30).until(ExpectedConditions.elementToBeClickable(australiaLink));
        clickOnElement(australiaLink);
    }
    public String getAustraliaText(){
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        return australiaText.getText();
    }
}
