import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
        Thread.sleep(2000);
        String xp1 = "//h1[contains(text(),'Block 1')]";
        WebElement block1 = driver.findElement(By.xpath(xp1));
        String xp2 = "//h1[contains(text(),'Block 4')]";
        WebElement block3 = driver.findElement(By.xpath(xp2));
        actions.dragAndDrop(block1, block3).perform();
    }
}

