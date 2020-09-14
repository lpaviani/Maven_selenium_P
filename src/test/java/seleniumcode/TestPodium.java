package seleniumcode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
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
    @Test  //check the maxCharacter limit of the field. This scenario focus on add validation logic on specific elements, on this test, it checks if ther user was able to enter more character then the field allowed.
    public void checkFieldsLimitSignUpPage(){
        signUpPageUtil.loadSignUpPage(SIGNUPPAGE_URL);
        signUpPageUtil.checkFieldLimit("firstName",SIGNUPPAGE_FIRSTNAME, SIGNUPPAGE_FIRSTNAME_MAXCHAR);
        signUpPageUtil.checkFieldLimit("lastName",SIGNUPPAGE_FIRSTNAME, SIGNUPPAGE_LASTNAME_MAXCHAR);
        signUpPageUtil.checkFieldLimit("email",SIGNUPPAGE_EMAIL, SIGNUPPAGE_EMAIL_MAXCHAR);
        signUpPageUtil.checkFieldLimit("businessName",SIGNUPPAGE_BNAME, SIGNUPPAGE_BNAME_MAXCHAR);
    }
    @Test //test all input fields on the SignUp page. This scenario focus no the ability to interact with input fields.
    public void checkInputFieldsSignUpPage(){
        signUpPageUtil.loadSignUpPage(SIGNUPPAGE_URL);
        signUpPageUtil.interactWithSignUpForm(SIGNUPPAGE_FIRSTNAME,SIGNUPPAGE_LASTNAME,SIGNUPPAGE_EMAIL,SIGNUPPAGE_PHONE,SIGNUPPAGE_BNAME);
    }
    @Test   //Open Webchat and enter information on the forms, but dont submit. This scenario test the ability to interact with elements outside the current frame of navigation.
    public void InteractWithWebChat(){
        mainPageUtil.loadPage(MAINPAGE_URL);
        mainPageUtil.interactWithWebChat(WEBCHAT_NAME,WEBCHAT_PHONE,WEBCHAT_MESSAGE);
    }
    @Test  //check top Menu categories are displayed. This scenario focus on Menu and sub elements interaction
    public void checkTopMenus(){
        mainPageUtil.loadPage(MAINPAGE_URL);
        mainPageUtil.checkProductsMenu();
        mainPageUtil.checkSolutionsMenu();
        mainPageUtil.checkResourcesMenu();
        mainPageUtil.checkEnterpriseMenu();
    }
    @Test
    public void scrollAndClickOnSocialMedia(){ //Navigate to bottom page and click on Social Media icons.
        mainPageUtil.loadPage(MAINPAGE_URL+"/starter/"); //Added /starter/ because sites does not contain social icons on Main Page
        mainPageUtil.clickSocialMediaFacebook(MAINPAGE_SOCIAL_FACEBOOK);
    }

}
