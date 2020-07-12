package step_definitions;

import cnnhomepage.CNNHomePage;
import common.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.IOException;

public class MyStepdefs extends WebAPI {

    static CNNHomePage cnnHomePage;
    public static void getInItElement(){

        cnnHomePage= PageFactory.initElements(driver, CNNHomePage.class);
    }
    @Before
    public void setUp() throws IOException {

getInItElement();
        // setUp(false, "browserstack", "windows", "10", "chrome", "83", "https://www.tripadvisor.com/");
        setUp(false, "browserstack", "OS X", "Catalina", "chrome", "83",
                "https://www.cnn.com/" +
                        "");
    }


    @Given("user is in home page")
    public void userIsInHomePage() {
        getInItElement();



    }

    @When("user clicks on Opinion button")
    public void userClicksOnOpinionButton() {


        getInItElement();
        cnnHomePage.doClickOnOpinionButton();
    }


    @Then("user will see Opinion text")
    public void userWillSeeOpinionText() {
        getInItElement();
        String actualText=cnnHomePage.userWouldSeeOpinionText();
        String expectedText="Opinion";
        Assert.assertEquals(actualText,expectedText);
    }


    @Then("user clicks on Travel button")
    public void userClicksOnTravelButton() {
        getInItElement();
        cnnHomePage.doClickOnTravelButton();
    }

    @And("user clicks on Destination button")
    public void userClicksOnDestinationButton() {
        getInItElement();
        cnnHomePage.doClickOnDestinationButton();
    }

    @When("user clicks on Brazil Button")
    public void userClicksOnBrazilButton() {
        getInItElement();
        cnnHomePage.doClickOnBrazilLink();
    }

    @Then("user will see the Brazil text")
    public void userWillSeeTheBrazilText() {
        getInItElement();
        String actualText= cnnHomePage.userWillSeeBrazilText();
        String expectedText="Brazil";
        Assert.assertEquals(actualText,expectedText);
    }



    @When("user clicks on Tokyo Link")
    public void userClicksOnTokyoLink() {

        getInItElement();
        cnnHomePage.doClickOnTokyoLink();
    }

    @Then("user will see Tokyo text")
    public void userWillSeeTokyoText() {
        getInItElement();
        boolean actualStatus=cnnHomePage.tokyoTextIsDisplayed();
        Assert.assertEquals(actualStatus,true);
    }
    @When("user clicks on Abu Dhabi Link")
    public void userClicksOnAbuDhabiLink() {
        getInItElement();
        cnnHomePage.doClickOnAbuDhabiLinks();
    }

    @Then("user will see Abu Dhabi text")
    public void userWillSeeAbuDhabiText() {
        getInItElement();
        String actualText = cnnHomePage.validateAbuDhabiText();
        String expectedText = "Abu Dhabi";
        Assert.assertEquals(actualText,expectedText);
    }



    @Then("user click on live Tv Button")
    public void userClickOnLiveTvButton() {
        getInItElement();
        cnnHomePage.doClickOnLiveTvButton();
    }

    @When("user click on live Tv play Button")
    public void userClickOnLiveTvPlayButton() {

        getInItElement();
        cnnHomePage.doClickOnLiveTvPlayButton();
    }

    @Then("user would see pop up window")
    public void userWouldSeePopUpWindow() {
        getInItElement();
      boolean popUpWindowDisplayed = cnnHomePage.isPopUpWindowDisplayed();
      Assert.assertEquals(popUpWindowDisplayed,true);
    }

    @Then("click on user id Icon")
    public void clickOnUserIdIcon() {
        getInItElement();
        cnnHomePage.doClickOnUserIdIcon();


    }

    @And("user write user email")
    public void userWriteUserEmail() {
        getInItElement();
        cnnHomePage.doUserWriteEmail();
    }

    @And("user write user password")
    public void userWriteUserPassword() {
        getInItElement();
        cnnHomePage.doUserWritePassword();
    }

    @When("user click on password Eye button")
    public void userClickOnPasswordEyeButton() {
        getInItElement();
        cnnHomePage.doClickOnUserPasswordEye();
    }

    @Then("user see the password")
    public void userSeeThePassword() {
        getInItElement();
        String actualText=cnnHomePage.getUserPassword();
        String expectedText="abcd1234";
        Assert.assertEquals(actualText,expectedText);

    }

    @Then("user scroll down to photos link")
    public void userScrollDownToPhotosLink() {
        getInItElement();
        cnnHomePage.doScrollDownToElement();
    }

    @When("user click on photos link")
    public void userClickOnPhotosLink() {

        getInItElement();
        cnnHomePage.doClickOnPhotosLink();
    }

    @Then("user see photos page")
    public void userSeePhotosPage() {
        getInItElement();
        String actualTittle=cnnHomePage.getPageTitle();
        String expectedTitle="CNN Photos - CNN";
        Assert.assertEquals(actualTittle,expectedTitle);

    }


    @Then("user scroll down to Europe link")
    public void userScrollDownToEuropeLink() {
        getInItElement();
        cnnHomePage.doScrollDownToEuropeLink();
    }

    @When("user click on europe link")
    public void userClickOnEuropeLink() {
        getInItElement();
        cnnHomePage.doClickOnEuropeLink();
    }

    @Then("user see Europe Text")
    public void userSeeEuropeText() {
        getInItElement();
       String actualText= cnnHomePage.getEuropeText();
       String expectedText= "Europe";
       Assert.assertEquals(actualText,expectedText, "Expected text not found");

    }


    @Then("user scroll down to Australia link")
    public void userScrollDownToAustraliaLink() {
        getInItElement();
        cnnHomePage.doScrollDownToAustraliaLink();
    }

    @When("user click on Australia link")
    public void userClickOnAustraliaLink() {
        getInItElement();
        cnnHomePage.doClickOnAustraliaLink();
    }

    @Then("user see Australia Text")
    public void userSeeAustraliaText() {
        getInItElement();
        String actualText= cnnHomePage.getAustraliaText();
        String expectedText="Australia";
        Assert.assertEquals(actualText, expectedText,"Expected text not found");
    }
    @After
    public static void cleanUp() {
        // driver.close();
        driver.quit();
    }
}
