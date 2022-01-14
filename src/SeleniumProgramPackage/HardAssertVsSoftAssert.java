package SeleniumProgramPackage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import jdk.javadoc.doclet.Reporter;
public class HardAssertVsSoftAssert 
{			
			@Test
			public void testAssertFunctions() 
			{
			System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.browserstack.com/");
			String ActualTitle = driver.getTitle();
			String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
			SoftAssert softassert = new SoftAssert();
			softassert.assertEquals(ActualTitle, ExpectedTitle);
			System.out.println("Wrong URl");
			softassert.assertAll();
			}
}

@Test
public void testAssertFunctions() 
{
System.setProperty("webdriver.chrome.driver", "C:\\I2EWebsiteTest\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.browserstack.com/");
String ActualTitle = driver.getTitle();
String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
Assert. assertEquals(ActualTitle, ExpectedTitle);
System.out.println("Wrong URl");


//		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Software testing\\All Automation Jars And Drivers\\chromedriver.exe");		
//		WebDriver driver = new ChromeDriver();	
//		driver.navigate().to("https://www.browserstack.com/");
//		String ActualTitle = driver.getTitle();
//		String ExpectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
//		Boolean verifyTitleIsPresent=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
//		Boolean verifyTitleIsChanged=driver.getTitle().equalsIgnoreCase("Testing Platform | BrowserStack");
//		assertEquals(ExpectedTitle, ActualTitle);
//		assertNotEquals(ExpectedTitle, "browserstack");
//		assertTrue(verifyTitleIsPresent);
//		assertFalse(verifyTitleIsChanged);
//		assertNotNull(verifyTitleIsPresent);
		}	
	}


