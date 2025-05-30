package Selenium_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student_form {

	public static void main(String[] args) throws InterruptedException {
		Student_Form();

	}

	private static void Student_Form() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		WebElement Name	   	= driver.findElement(By.xpath("//input[@name='name']"));
		WebElement Email   	= driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Gender   = driver.findElement(By.xpath("//input[@id='gender']"));
		WebElement Mobile   = driver.findElement(By.xpath("//input[@id='mobile']"));
		WebElement DOB   	= driver.findElement(By.xpath("//input[@id='dob']"));
		WebElement Subjects = driver.findElement(By.xpath("//input[@id='subjects']"));
		WebElement Sports = driver.findElement(By.xpath("//input[@id='hobbies']"));
		WebElement Reading = driver.findElement(By.xpath("//input[@type='checkbox']/following::input"));
		WebElement Music = driver.findElement(By.xpath("//input[@type='checkbox']/following::input[2]"));
		
		
		Name.sendKeys("Md.Usama");
		Thread.sleep(5000);
		
		Email.sendKeys("Shaikusama456@gmail.com");
		Thread.sleep(5000);
		
		Gender.click();
		Thread.sleep(5000);
		
		Mobile.sendKeys("8919930224");
		Thread.sleep(5000);
		
		DOB.sendKeys("09-10-2000");
		Thread.sleep(5000);
		
		Subjects.sendKeys("maths, science, social, EVS");
		Thread.sleep(5000);
		
		Sports.click();
		Thread.sleep(3000);
		
		Reading.click();
		Thread.sleep(3000);
		
		Music.click();
		Thread.sleep(10000);
		
		driver.close();
		
	}

}
