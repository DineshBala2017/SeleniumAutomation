package WhataburgerSampleG.WhataburgerSampleA;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;

import org.testng.annotations.Test;

import Pages.SigninPage;

public class ForgotpasswordErrormessageTest extends BaseTest
{
	

String scenarioname = "validatepwderrmsg";


	@Test
	public void Forgotpasswordemail() throws InterruptedException, IOException
	{
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String s = sdf.format(d);
		report.createTest(scenarioname+s);
		SigninPage  sp = new SigninPage(driver);
		sp.navigate();
		String fpem = sp.Forgotpassworderrormessage("beansbond@g",scenarioname);
		Assert.assertEquals(fpem, "Invalid email address" );
		report.flush();

	}

}
