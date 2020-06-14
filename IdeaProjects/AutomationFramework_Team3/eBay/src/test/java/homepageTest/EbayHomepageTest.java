package homepageTest;
import commonAPI.WebAPI;
import homepage.EbayHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EbayHomepageTest extends WebAPI {

    static EbayHomepage ebayHomepage;

    public static void getInItElements(){
        ebayHomepage = PageFactory.initElements(driver, EbayHomepage.class);
    }

    @Test (priority = 0,enabled = false)
    public static void testHomepage(){
        getInItElements();
        ebayHomepage.getCurrentPageTitle();
        ebayHomepage.validateCurrentPage();
    }
    @Test(priority = 1,enabled = false)
    public static void testSignIn(){
        getInItElements();
        ebayHomepage.getSignInPage();
        ebayHomepage.validateSignInPage();
    }

    @Test(priority = 2,enabled = false)
    public static void testDailyDeals(){
        getInItElements();
        ebayHomepage.getDailyDeals();
        ebayHomepage.validateDailyDeals();
    }

    @Test(priority = 3,enabled = false)
    public static void testShoppingCart(){
        getInItElements();
        ebayHomepage.getShoppingCart();
        ebayHomepage.validateShoppingCart();
}

    @Test(priority = 4,enabled = false)
    public static void testSellPage(){
        getInItElements();
        ebayHomepage.getSellPage();
        ebayHomepage.validateSellPage();
}

    @Test(priority = 5,enabled = false)
    public static void testHelpAndContact(){
        getInItElements();
        ebayHomepage.getHelpAndContact();
        ebayHomepage.validateHelpAndContact();
}

    @Test(priority = 6,enabled = false)
    public static void testMotorsPage(){
        getInItElements();
        ebayHomepage.getMotorsPage();
        ebayHomepage.validateMotorsPage();
    }

    @Test(priority = 7,enabled = false)
    public static void testFashionPage(){
        getInItElements();
        ebayHomepage.getFashionPage();
        ebayHomepage.validateFashionPage();
    }

    @Test(priority = 8,enabled = false)
    public static void testElectronicsPage(){
        getInItElements();
        ebayHomepage.getElectronicsPage();
        ebayHomepage.validateElectronicsPage();
    }

    @Test(priority = 9,enabled = false)
    public static void testCollectiblesAndArt(){
        getInItElements();
        ebayHomepage.getCollectiblesAndArtPage();
        ebayHomepage.validateCollectiblesAndArtPage();
    }

    @Test(priority = 10,enabled = false)
    public static void testSearchCategoryDropdownList(){
        getInItElements();
        ebayHomepage.getSearchCategoryDropDownNum();
        ebayHomepage.validateSearchCategoryDropDownNum();
        ebayHomepage.getSearchByCategoryText();
        ebayHomepage.validateSearchCategoryText();
    }

    @Test(priority = 11,enabled = false)
    public static void testShopByCategory(){
        getInItElements();
        ebayHomepage.validateShopByCategoryListNum();
        ebayHomepage.getShopByCategoryListText();
        ebayHomepage.validateShopByCategoryListText();
    }

    @Test(priority = 12,enabled = false)
    public static void testCarouselSlideRight(){
        getInItElements();
        ebayHomepage.validateClickCarouselRight();

    }
    @Test(priority = 13,enabled = false)
    public static void testCarouselSlideLeft(){
        getInItElements();
        ebayHomepage.validateCarouselLeft();
    }

    @Test(priority = 14,enabled = false)
    public static void testEbaySitesList(){
        getInItElements();
        ebayHomepage.validateEbaySitesListNum();
        ebayHomepage.getEbaySitesList();
        ebayHomepage.validateEbaySitesList();
    }

    @Test(priority = 15,enabled = false)
    public static void testAboutEbayList(){
        getInItElements();
        ebayHomepage.validateAboutEbayListNum();
        ebayHomepage.getAboutEbayList();
        ebayHomepage.validateAboutEbayList();
    }

    @Test(priority = 16,enabled = false)
    public static void testSearchBox(){
        getInItElements();
        ebayHomepage.getSearchItem();

    }

    @Test(priority = 17,enabled = false)
    public static void testAddItemToCart(){
        getInItElements();
        ebayHomepage.addItemToCart();
    }

    @Test(priority = 18,enabled = false)
    public static void testDeleteItemMiniCart(){
        getInItElements();
        ebayHomepage.deleteItemMiniCart();


    }
    @Test(priority = 19,enabled = false)
    public static void testFAQButton(){
        getInItElements();
        ebayHomepage.getHelpButton();
    }

    }
