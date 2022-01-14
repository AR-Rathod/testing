package SeleniumProgramPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandler
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Data\\Software testing\\All Automation Jars And Drivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//String parentid = driver.getWindowHandle();
		//System.out.println("Parent Id Is:-" +parentid);
	}

}
