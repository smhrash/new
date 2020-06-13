package electronicsPage;

import commonAPI.WebAPI;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElectronicsPage extends WebAPI {


    public void navigateToElectronicsPage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
       // wait.until(ExpectedConditions.elementToBeClickable(electronicsButton));
       // electronicsButton.click();

    }

    public void testScroll(){
        navigateToElectronicsPage();

    }


}
