package WhataburgerSampleG.WhataburgerSampleA;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class BaseTest 
{
	//public static WebDriver driver=null;
	WebDriver driver;
	ExtentReports report;
	

    @BeforeTest
	public void setuptest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\chromedriver.exe");	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	
	//Extent reporting

	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter sparkreport = new ExtentSparkReporter(path);
		sparkreport.config().setReportName("FirstReport");
	report =new ExtentReports();
	report.attachReporter(sparkreport);
	
	
	
	
	}
    
@AfterTest
     public void quit()
    {
    	driver.quit();
    	
   }
}
