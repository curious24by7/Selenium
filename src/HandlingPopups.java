import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class HandlingPopups {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter accept or dismiss:: ");
        String response = sc.nextLine();
        switch (response){
            case "accept": SayMyName();
                break;
            case "dismiss": DontSayMyName();
                break;
            default:
                System.out.printf("You entered wrong value");
                break;
        };
    }
    public static void SayMyName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        Thread.sleep(1500);
        //SayMyNameButton
        driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
        Thread.sleep(1000);
        //EnterYourNamePopup
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //PrintPopupTitle
        System.out.println(alert.getText());
        Thread.sleep(2000);
        //PassingName
        alert.sendKeys("Soham");
        Thread.sleep(1000);
        //OKButton
        alert.accept();
        //PrintResponse
        System.out.println(alert.getText());
        Thread.sleep(3000);
        //OKButton
        alert.accept();
        Thread.sleep(3000);
        driver.quit();
    }

    public static void DontSayMyName() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\soham\\Selenium jars and drivers\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        Thread.sleep(2500);
        //SayMyNameButton
        driver.findElement(By.cssSelector("input[type=\"button\"]")).click();
        Thread.sleep(2000);
        //EnterYourNamePopup
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //PrintPopupTitle
        System.out.println(alert.getText());
        Thread.sleep(2000);
        //CancelButton
        alert.dismiss();
        //PrintResponse
        System.out.println(alert.getText());
        Thread.sleep(3000);
        //OKButton
        alert.accept();
        Thread.sleep(5000);
        driver.quit();
    }
}
