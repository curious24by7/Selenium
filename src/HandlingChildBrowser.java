import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class HandlingChildBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        String parentWindowID = driver.getWindowHandle();
        Thread.sleep(5000);
        System.out.println("Parent Window Id is:: "+parentWindowID);
        Thread.sleep(2500);
        driver.findElement(By.cssSelector("#newWindowBtn")).click();
        Thread.sleep(2000);
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String windowHandle : allWindowHandles) {
            driver.switchTo().window(windowHandle);
            if (!windowHandle.equals(parentWindowID)) {
                driver.switchTo().window(windowHandle);
                String title = driver.getTitle();
                //FirstName
                driver.findElement(By.cssSelector("#firstName")).sendKeys("Soham");
                //LastName
                driver.findElement(By.cssSelector("#lastName")).sendKeys("Dhamnaskar");
                //Email
                driver.findElement(By.cssSelector("#email")).sendKeys("sohamdham123@gmail.com");
                //Password
                driver.findElement(By.cssSelector("#password")).sendKeys("xyz");
                Thread.sleep(1000);
                //RegButton
                driver.findElement(By.cssSelector("#registerbtn")).click();
                Thread.sleep(2000);
                //NavigateHome
                driver.findElement(By.cssSelector("#navigateHome")).click();
                driver.close();
                System.out.println("Child Browser window with title ::" + title );
            }
        }
        Thread.sleep(1000);
        driver.quit();
    }
}
