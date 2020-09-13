package seleniumcode;

import common.MainPageUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPodium {
    private WebDriver driver;
    private MainPageUtil mainPageUtil;

    @BeforeTest
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPageUtil = new MainPageUtil(driver);
    }
    @Test  //check Login Page
    public void checkLogin(){
        mainPageUtil.loadPage("https://www.podium.com");
        mainPageUtil.clickLogin();
    }
    @Test  //check top Menu categories are displayed
    public void checkTopMenus(){
        mainPageUtil.loadPage("https://www.podium.com");
        mainPageUtil.checkProductsMenu();
        mainPageUtil.checkSolutionsMenu();
        mainPageUtil.checkResourcesMenu();
        mainPageUtil.checkEnterpriseMenu();
    }
    @Test   //Open Online chat and enter information on the forms, but dont submit.
    public void InteractWithWebChat(){
        mainPageUtil.loadPage("https://www.podium.com");
        mainPageUtil.interactWithWebChat("Luciano Paviani", "5551912345678","Hi, My name is Luciano Paviani. You can find more about me at www.linkedin.com/in/lucianopaviani");
    }

}
