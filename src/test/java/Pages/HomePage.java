package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import Utils.Utilsfunction;




public class HomePage 
{
	WebDriver driver;
	
	String url = "https://whataburger.com/home";
	String start = "//a[text()=' START ORDERING ']";
	String pickup = "//label[@for='pickup']";
	String setpickupmethod = "//button[text()=' Set Pickup Method ']";
    
	//Utilsfunction utr = new Utilsfunction();
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver ;
		
	}
	
	
	public void starttoorder() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath(start));
		//utr.wait(driver,element);
		element.click();
		System.out.println(element.getText());
		
	}
	
	public void setmethod() throws InterruptedException
	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//Thread.sleep(10000);
		driver.findElement(By.xpath(pickup)).click();
		driver.findElement(By.xpath(setpickupmethod)).click();
		
	}
	
	
}
