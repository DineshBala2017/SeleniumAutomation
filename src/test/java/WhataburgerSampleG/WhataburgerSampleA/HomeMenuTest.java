package WhataburgerSampleG.WhataburgerSampleA;

import java.io.IOException;

import org.testng.annotations.Test;



import Pages.HomePage;
import Pages.MenuPage;
import Pages.SigninPage;



public class HomeMenuTest extends BaseTest
{
	
	String nutriinfo = "nutritioninformationforwhataburgerburger";
	

@Test
public void hmsignin() throws InterruptedException, IOException 
{
	report.createTest("HomeMenuTest");
		
	SigninPage  spage = new SigninPage(driver);
	spage.navigate();
	spage.signin("beansbond001@gmail.com","burger01");
	
	HomePage hp = new HomePage(driver);
	Thread.sleep(5000);
	hp.starttoorder();
	hp.setmethod();

	MenuPage mp = new MenuPage(driver);
	Thread.sleep(5000);
	mp.MenuBurgers(nutriinfo);
	report.flush();
	System.out.println("Hello Github");
	
}
	
}
