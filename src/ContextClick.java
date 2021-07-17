import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ContextClick {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        Robot r = new Robot();
        driver.manage().window().maximize();
        driver.get("https://outlook.live.com/");
        Thread.sleep(1000);
        //signIn
        driver.findElement(By.cssSelector("header.masthead:nth-child(3) div.masthead-shell aside.static-strip div.bound nav.auxiliary-actions ul:nth-child(1) li:nth-child(2) > a.internal.sign-in-link")).click();
        Thread.sleep(1000);
        //Id
        driver.findElement(By.cssSelector("#i0116")).sendKeys("nothingisavailablesowhat@outlook.com");
        //next
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        Thread.sleep(2000);
        //password
        driver.findElement(By.cssSelector("#i0118")).sendKeys("demoforselenium65");
        //Login
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
        Thread.sleep(5000);
        //NewMessageButton
        driver.findElement(By.cssSelector("span[id=\"id__7\"]")).click();
        Thread.sleep(10000);
        //To
        driver.findElement(By.cssSelector("input[autocapitalize=\"off\"]")).sendKeys("sohamdrive123@gmail.com");
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //Subject
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Automated Mail");
        Thread.sleep(2000);
        //Message
        driver.findElement(By.cssSelector("div[role=\"textbox\"]")).click();
        Thread.sleep(600);
        driver.findElement(By.cssSelector("div[role=\"textbox\"]")).sendKeys("Message Sent using Selenium");
        Thread.sleep(2000);
        //AttachFile
       /* driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/div[1]/div[1]/img[1]")).click();
        Thread.sleep(600);
        driver.findElement(By.xpath("//span[contains(text(),'Browse this computer')]")).sendKeys("\"C:\\Users\\soham\\Downloads\\1626086716912_System Testing Combine All Scenerios New-pages-deleted.pdf\"");
        Thread.sleep(3000);*/
        //SendButton
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]/button[1]/span[1]")).click();
        //SentItemsButton
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span[1]")).click();
        //SentMails
        Thread.sleep(2000);
        String xp = "/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]";
        WebElement mail = driver.findElement(By.xpath(xp));
        System.out.println(mail.getText());
        actions.contextClick(mail).perform();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/button[1]/div[1]/span[1]")).click();
    }
}
