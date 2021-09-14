package Utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;

public class Utilsfunction
{
//WebDriver driver;


public void capturescreenshots(WebDriver driver,String scenario) throws IOException
{
	TakesScreenshot scrShot =((TakesScreenshot)driver);
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	
	File DestFile=new File("C:\\Workspace\\Screenshots\\"+scenario+".png");

    //Copy file at destination

    FileUtils.copyFile(SrcFile, DestFile);
}


public void wait(WebDriver driver, WebElement element)
{
	WebDriverWait wbwait = new WebDriverWait(driver, 10);
	wbwait.until(ExpectedConditions.elementToBeClickable(element));
}
}