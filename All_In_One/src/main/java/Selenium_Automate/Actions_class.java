package Selenium_Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) throws InterruptedException {
		//Right_click();
		//double_click();
		//hover_mouse();
		Drag_move();

	}

	private static void Drag_move() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement 	First_box  = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement  Second_box = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Actions Class---Drag and Drop Action Using
		Actions ac = new Actions(driver);
		ac.dragAndDrop(First_box, Second_box).build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
	}

	private static void hover_mouse() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		WebElement First_Image = driver.findElement(By.xpath("//img[@alt='User Avatar']"));
		Thread.sleep(5000);
		
		//Using Actions class
		Actions ac =  new Actions(driver);
		ac.moveToElement(First_Image).build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

	private static void double_click() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mouse-test.com/");
		driver.manage().window().maximize();
		WebElement Double_click = driver.findElement(By.xpath("//div[@id='clickMe']"));
		Thread.sleep(5000);
		
		//Actions class
		Actions ac=new Actions(driver);
		ac.doubleClick(Double_click).build().perform();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

	private static void Right_click() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		driver.manage().window().maximize();
		
		WebElement Right_click = driver.findElement(By.xpath("//div[@id='hot-spot']"));
		Thread.sleep(5000);
		
		//Action class
		Actions ac = new Actions(driver);
		ac.contextClick(Right_click).build().perform();
		Thread.sleep(5000);
		
		
		//to accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
