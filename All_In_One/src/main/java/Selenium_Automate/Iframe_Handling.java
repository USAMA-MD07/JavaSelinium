package Selenium_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Handling {

	public static void main(String[] args) throws InterruptedException {
		//Switch_To_Frame_By_ID();
		//Switch_To_Frame_By_Index();
		Switch_To_Frame_By_Webelement();
	}

	private static void Switch_To_Frame_By_Webelement() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		WebElement iframe_xpath = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		driver.switchTo().frame(iframe_xpath);
		
WebElement Text_box = driver.findElement(By.xpath("//input[@type='text']"));
		
		Text_box.sendKeys("Bluestone");
		Thread.sleep(5000);
		
		Text_box.clear();
		Thread.sleep(5000);
		
		driver.close();		
		
	}

	private static void Switch_To_Frame_By_Index() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		//Switching element through Index
		driver.switchTo().frame(1);
		
		
		WebElement Text_box = driver.findElement(By.xpath("//input[@type='text']"));
		
		Text_box.sendKeys("Bluestone");
		Thread.sleep(5000);
		
		Text_box.clear();
		Thread.sleep(5000);
		
		driver.close();	
		
	}

	private static void Switch_To_Frame_By_ID() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		//Switching element through Name
		driver.switchTo().frame("globalSqa");
		
		
		WebElement Text_box = driver.findElement(By.xpath("//input[@type='text']"));
		
		Text_box.sendKeys("Bluestone");
		Thread.sleep(5000);
		
		Text_box.clear();
		Thread.sleep(5000);
		
		driver.close();		
		
	}

}
