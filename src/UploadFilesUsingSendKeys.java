import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class UploadFilesUsingSendKeys {
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

}

