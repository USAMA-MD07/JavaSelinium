package Selenium_Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Facebook_login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new InternetExplorerDriver();
		
		//launching the url
		driver.get("https://www.facebook.com/login/");
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//finding the elements
		 WebElement   UserId   = driver.findElement(By.xpath("//input[@id='email']"));
		 WebElement   Password = driver.findElement(By.xpath("//input[@type='password']"));
		 WebElement   Loginbtn = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		 
		 //Operations on elements
		 UserId.sendKeys("8179561095");
		 Thread.sleep(3000);
		 Password.sendKeys("abrar");
		 Thread.sleep(3000);
		 Loginbtn.click();
		 Thread.sleep(8000);
		 driver.close();
		 
		
		
		
		
		
		
	}

	private static void Driver() {
		// TODO Auto-generated method stub
		
	}

}
