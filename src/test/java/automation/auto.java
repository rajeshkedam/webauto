package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto {
public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("admin");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Admin@1234");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("Admin");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Admin");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Admin");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(1500);
        
      
        
        
        

}
}