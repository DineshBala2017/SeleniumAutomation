package WhataburgerSampleG.WhataburgerSampleA;
import Pages.SigninPage;




import org.testng.annotations.Test;





public class SigninTest extends BaseTest
{

	
	
	@Test
	public void signinvalidate() throws InterruptedException 
	{
		report.createTest("SigninTest");		
		SigninPage  sp = new SigninPage(driver);
		sp.navigate();
		sp.signin("beansbond001@gmail.com","burger01");
		
	}
	
	
	
}
