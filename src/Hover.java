import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Hover {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions action = new Actions(driver);
        driver.manage().window().maximize();
        driver.get("http://www.actimind.com/");
        WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE')]"));
        //action.moveToElement(AreaOfExpertise).perform();
        Thread.sleep(2000);
        WebElement cloudApp = driver.findElement(By.xpath("//a[contains(text(),'Cloud Applications')]"));
        //action.moveToElement(cloudApp).click().perform();
        action.moveToElement(AreaOfExpertise).moveToElement(cloudApp).click().build().perform();
    }
}
