package Selenium_Automate;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowa_Handling {

	public static void main(String[] args) throws InterruptedException {
		Instagram();

	}

	private static void Instagram() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement About_Link = driver.findElement(By.xpath("//a[@rel='nofollow noopener noreferrer']/following::span"));
		WebElement Help_Link  = driver.findElement(By.xpath("//a[@rel='nofollow noopener noreferrer']/following::span[4]"));
		WebElement API_Link	  = driver.findElement(By.xpath("//a[@rel='nofollow noopener noreferrer']/following::span[5]"));	
	
		Thread.sleep(5000);
		About_Link.click();
		
		Thread.sleep(5000);
		Help_Link.click();
		
		Thread.sleep(5000);
		API_Link.click();
		
		
		//Now All windows are open
		//Getting the handles of all windows
		
		Set<String> All_Handles = driver.getWindowHandles();
		Iterator<String> ite = All_Handles.iterator();
		
		while(ite.hasNext())
		{
			String childWindow = ite.next();
			Thread.sleep(5000);
			driver.switchTo().window(childWindow);
			Thread.sleep(5000);
			String current_Title = driver.getTitle();
			System.out.println(current_Title);
		}
		
		Thread.sleep(5000);
		driver.quit();
	
	
	
	}
	
	

}
