import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class UploadFilesUsingAUTOIT {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.monsterindia.com/seeker/registration");
        Thread.sleep(5000);
        //ClickChoose
        driver.findElement(By.xpath("//span[contains(text(),'Choose CV')]")).click();
        Thread.sleep(1000);
        //RunFile
        Runtime.getRuntime().exec("C:\\Users\\soham\\Desktop\\XYZ\\SelectFileToupload.exe");
        Thread.sleep(4000);
        driver.quit();
    }
}
