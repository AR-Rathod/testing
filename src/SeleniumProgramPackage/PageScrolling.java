package SeleniumProgramPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageScrolling 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\iND\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tTP1TcwMU02T1JgNGB0YPBiS8_PT89JBQBASQXT&q=google&oq=goog&aqs=chrome.1.69i59j46i39i199i291j69i57j69i60l5.2727j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		WebElement lnk= driver.findElement(By.xpath(""));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeAsyncScript("windows.scrollBy(0, 800)");
		js.executeScript("argument[0].scrollIntoView():", lnk);

	}

}
