package WhataburgerSampleG.WhataburgerSampleA;



import org.testng.Assert;

import org.testng.annotations.Test;

import Pages.SigninPage;

public class InvalidemailTest extends BaseTest
{
	
@Test
public void wrongemail() throws InterruptedException
{
	SigninPage  abc = new SigninPage(driver);
	abc.navigate();
	
	String errorMessage = abc.invalidemail("beansbond001");
	Assert.assertEquals(errorMessage, "Invalid email address");
}



}
