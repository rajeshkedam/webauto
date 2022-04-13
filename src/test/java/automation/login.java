package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmyaccount.google.com%3Futm_source%3Daccount-marketing-page%26utm_medium%3Dcreate-account-button&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin");
        Thread.sleep(1500);
       
}
}