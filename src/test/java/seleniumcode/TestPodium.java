package seleniumcode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import common.MainPageUtil;
import common.SignUpPageUtil;
import static common.ResourceData.*;

public class TestPodium {
    private WebDriver driver;
    private MainPageUtil mainPageUtil;
    private SignUpPageUtil signUpPageUtil;

    @BeforeTest
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        mainPageUtil = new MainPageUtil(driver);
        signUpPageUtil = new SignUpPageUtil(driver);
    }
    @Test //test all input fields on the SignUp page
    public void checkInputFieldsSignUpPage(){
        signUpPageUtil.loadSignUpPage(SIGNUPPAGE_URL);
        signUpPageUtil.interactWithSignUpForm(SIGNUPPAGE_FIRSTNAME,SIGNUPPAGE_LASTNAME,SIGNUPPAGE_EMAIL,SIGNUPPAGE_PHONE,SIGNUPPAGE_BNAME);
    }
    @Test  //check if maxCharacter limit of the field
    public void checkFieldsLimitSignUpPage(){
        signUpPageUtil.loadSignUpPage(SIGNUPPAGE_URL);
        signUpPageUtil.checkFieldLimit("firstName",SIGNUPPAGE_FIRSTNAME);
        signUpPageUtil.checkFieldLimit("lastName",SIGNUPPAGE_FIRSTNAME);
    }
    @Test  //check top Menu categories are displayed
    public void checkTopMenus(){
        mainPageUtil.loadPage(MAINPAGE_URL);
        mainPageUtil.checkProductsMenu();
        mainPageUtil.checkSolutionsMenu();
        mainPageUtil.checkResourcesMenu();
        mainPageUtil.checkEnterpriseMenu();
    }
    @Test   //Open Online chat and enter information on the forms, but dont submit.
    public void InteractWithWebChat(){
        mainPageUtil.loadPage(MAINPAGE_URL);
        mainPageUtil.interactWithWebChat(WEBCHAT_NAME,WEBCHAT_PHONE,WEBCHAT_MESSAGE);
    }

}
