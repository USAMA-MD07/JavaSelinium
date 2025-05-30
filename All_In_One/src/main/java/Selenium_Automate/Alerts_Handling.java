package Selenium_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Handling {

	public static void main(String[] args) throws Exception  {
		//Alerts_accept();
		Alerts_Dismiss();

	}

	private static void Alerts_Dismiss() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		WebElement Customer_ID = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_button = driver.findElement(By.xpath("//input[@name='submit']"));
		
		
		Customer_ID.sendKeys("8919930224");
		Submit_button.click();
		
		//Alerts switching to windows
		Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		driver.close();
	}

	private static void Alerts_accept() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		String Expected_message = "Customer Successfully Delete!";
		WebElement Customer_ID = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement Submit_button = driver.findElement(By.xpath("//input[@name='submit']"));
		
		
		Customer_ID.sendKeys("8919930224");
		Submit_button.click();
		
		//Alerts switching to windows
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		String Actual_message = driver.switchTo().alert().getText();
		
		System.out.println(Actual_message);
		
		if(Expected_message.equals(Actual_message))
		{
			System.out.println("Message is same- Test case is Pass");
		}
		else
		{
			System.out.println("Message is not same- Test case is Fail");
		}
			
	}

}
