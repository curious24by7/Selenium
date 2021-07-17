import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class UploadFiles {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\soham\\Downloads\\1626086716912_System Testing Combine All Scenerios New-pages-deleted.pdf");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
        Thread.sleep(3000);
        driver.close();
    }
    /*public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        Robot r = new Robot();
        driver.manage().window().maximize();
        driver.get("https://www.monsterindia.com/seeker/registration");
        Thread.sleep(5000);
        //SelectFile
        driver.findElement(By.xpath("//span[contains(text(),'Choose CV')]")).sendKeys("\"C:\\Users\\soham\\Downloads\\1626086716912_System Testing Combine All Scenerios New-pages-deleted.pdf\"");
        Thread.sleep(1000);
    }*/
}

