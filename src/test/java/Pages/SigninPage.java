package Pages;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;

import Utils.Utilsfunction;

public class SigninPage 
{
WebDriver driver;
String clickonsignin = "//span[text()='Sign In']";
String email = "username";
String password = "password";

String forgotpasswordinvalidemailerrormessage = "//span[text()=' Forgot Password? ']";
String forgotpasswordemail = "//input[@id='email']";
String forgotpassworderrormessage = "//span[text()='Invalid email address']";
String signin = "//button[text()=' Sign In ']";


Utilsfunction utf = new Utilsfunction();

public SigninPage(WebDriver driver)
{
	this.driver= driver;
}

public void navigate()
{
	driver.get("https://whataburger.com/home");
	driver.manage().window().maximize();
}
 public void signin(String eaddress, String pword) throws InterruptedException  
 {  /*String mainwindow = driver.getWindowHandle();
 	System.out.println(mainwindow);
 	Set<String> l = new HashSet<String>();
 l = driver.getWindowHandles();
 System.out.println(l);
 */
	 driver.findElement(By.xpath(clickonsignin)).click();
	 driver.findElement(By.id(email)).sendKeys(eaddress);
	 driver.findElement(By.id(password)).sendKeys(pword);
	 Thread.sleep(2000);
	 driver.findElement(By.xpath(signin)).click();
	
 }
 
 public String invalidemail(String invalidemail)
 {
	 driver.findElement(By.xpath(clickonsignin)).click();
	 driver.findElement(By.id(email)).sendKeys(invalidemail);
	 driver.findElement(By.id(email)).sendKeys(Keys.TAB);
	String invalidEmailErrorMessage = driver.findElement(By.xpath(forgotpassworderrormessage)).getText();
	 return invalidEmailErrorMessage;
	 
 }
 
 public String Forgotpassworderrormessage(String invalid_email, String fpscenario) throws InterruptedException, IOException
 {
	 driver.findElement(By.xpath(clickonsignin)).click();
	 driver.findElement(By.xpath(forgotpasswordinvalidemailerrormessage)).click();
	 Thread.sleep(5000);
	 driver.findElement(By.xpath(forgotpasswordemail)).sendKeys(invalid_email);
	 driver.findElement(By.xpath(forgotpasswordemail)).sendKeys(Keys.TAB);
	 String ForgorpasswordErrmsg = driver.findElement(By.xpath(forgotpassworderrormessage)).getText();
	 
	
	 utf.capturescreenshots(driver,fpscenario);
	 
	 return ForgorpasswordErrmsg;
	 
	 
 }

}