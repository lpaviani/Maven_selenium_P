package common;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import waiter.Waiter;
import static common.ResourceData.*;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class SignUpPageUtil {
    private WebDriver driver;
    private Waiter waiter = new Waiter();

    public SignUpPageUtil(WebDriver driver){
        this.driver = driver;
    }
    //Methods
    public void loadSignUpPage(String urlSignUp){
        waiter.get(urlSignUp, driver);
    }
    public void signUpForm(String firstName,String lastName,String email,String phone,String bName){
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("phone")).sendKeys(phone);
        driver.findElement(By.id("businessName")).sendKeys(bName);
    }
    public void interactWithSignUpForm(String firstName, String lastName, String email, String phone, String bName){
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("phone")).sendKeys(phone);
        driver.findElement(By.id("businessName")).sendKeys(bName);
    }
    public void checkFieldLimit(String field,String longString){
        WebElement field1 = driver.findElement(By.id(field));
        field1.sendKeys(longString);
        int result = field1.getAttribute("value").length();
        Assert.assertTrue(result <= SIGNUPPAGE_FIRSTNAME_MAXCHAR);
        System.out.println(result);
    }
}
