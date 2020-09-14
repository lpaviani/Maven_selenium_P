package common;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import waiter.Waiter;

public class MainPageUtil {
    private WebDriver driver;
    private Waiter waiter = new Waiter();

    public MainPageUtil(WebDriver driver){
        this.driver = driver;
    }

    //Methods
    public void loadPage(String url){
        waiter.get(url, driver); //waiter method will wait for the page to fully load
    }
    public void clickLogin(){
        driver.findElement(By.id("menu-item-1317")).click();
    }
    public void checkProductsMenu(){
        driver.findElement(By.id("wp-megamenu-item-2312")).click();
        driver.findElement(By.linkText("Reviews")).isDisplayed();
        driver.findElement(By.linkText("Payments")).isDisplayed();
        driver.findElement(By.linkText("Webchat")).isDisplayed();
        driver.findElement(By.linkText("Videochat")).isDisplayed();
        driver.findElement(By.linkText("Feedback")).isDisplayed();
        driver.findElement(By.linkText("Teamchat")).isDisplayed();
        driver.findElement(By.linkText("Inbox")).isDisplayed();
    }
    public void checkSolutionsMenu(){
        driver.findElement(By.id("wp-megamenu-item-2423")).click();
        driver.findElement(By.linkText("Win More Leads")).isDisplayed();
        driver.findElement(By.linkText("Earn Repeat Customers")).isDisplayed();
        driver.findElement(By.linkText("Do More as a Team")).isDisplayed();
        driver.findElement(By.linkText("Centralize Interactions")).isDisplayed();
    }
    public void checkResourcesMenu(){
        driver.findElement(By.id("wp-megamenu-item-2428")).click();
        driver.findElement(By.linkText("COVID-19 Resources")).isDisplayed();
        driver.findElement(By.linkText("Customer Stories")).isDisplayed();
        driver.findElement(By.linkText("Ebooks")).isDisplayed();
    }
    public void checkEnterpriseMenu(){
        driver.findElement(By.id("wp-megamenu-item-2806")).isDisplayed();
    }
    public void interactWithWebChat(String name, String phone, String message){
        driver.switchTo().frame("podium-bubble");
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ContactBubble")));
        driver.findElement(By.className("ContactBubble")).click();
        driver.switchTo().parentFrame();
        driver.switchTo().frame(("podium-modal"));
        driver.findElement(By.id("Name")).sendKeys(name);
        driver.findElement(By.id("Mobile Phone")).sendKeys(phone);
        driver.findElement(By.id("Message")).sendKeys(message);
    }
    public void clickSocialMediaFacebook(String facebook){
        driver.findElement(By.id("theme-white")).sendKeys(Keys.END); //Need to find the correct element on the HTML that accepts sendKeys
        driver.findElement(By.xpath("//*[@id=\'colophon\']/section/div[1]/div[2]/div[5]/div/div[2]/a[2]")).click(); //using xpath as locator
        Assert.assertEquals(driver.getCurrentUrl(), facebook);
    }


}
