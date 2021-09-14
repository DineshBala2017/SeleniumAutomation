package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.Utilsfunction;

public class MenuPage 
{
WebDriver driver;


Utilsfunction utr = new Utilsfunction();

String Burgers = "//h4[text()='Burgers']";
String burgerssubcategory = "//span[text()='Whataburger®']";
String nutritioninfo = "//a[text()='Show Nutrition']";
String nutrititle = "//h1[text()='Nutrition & Allergen Information']";

String close = "//button[@class='modal-close pull-right']";

String conti = "//button[text()='Continue']";

String cokeradio = "//input[@id='Coca-Cola® Classic']";


public MenuPage(WebDriver driver)
{
	this.driver = driver;
}

public void MenuBurgers(String nutriname) throws IOException 
{
		
	driver.findElement(By.xpath(Burgers)).click();
	WebDriverWait wbwait = new WebDriverWait(driver, 10);
	wbwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(burgerssubcategory)));
	driver.findElement(By.xpath(burgerssubcategory)).click();
	wbwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nutritioninfo)));
	driver.findElement(By.xpath(nutritioninfo)).click();
	wbwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(nutrititle)));
	utr.capturescreenshots(driver, nutriname+"_nutriinformation");
	
					//click
	WebElement closex = driver.findElement(By.xpath(close));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", closex);
					//scrollBy
	//jse.executeScript("window.scrollBy(0,500)");
	//WebElement contibutton = driver.findElement(By.xpath(conti));
	//jse.executeScript("arguments[0].click();",contibutton);
	
					//navigate
	jse.executeScript("window.location = 'https://whataburger.com/locations/1106/menu/categories/burgers-1/recipes/whataburger-9/customization/2'");
	utr.capturescreenshots(driver, nutriname+"_aftercontinue");
	
	//WebElement cokeoption = driver.findElement(By.xpath(cokeradio));
	//jse.executeScript("arguments[0].click();", cokeoption);
	//jse.executeScript("window.scrollBy(0,500)");
	
	
}
}
