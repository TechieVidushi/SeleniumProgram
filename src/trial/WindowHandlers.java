 package trial;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlers {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent Window's Handle ->" +parentWindowHandle );
		WebElement clickElement = driver.findElement(By.id("button1"));
		
		for(int i=0;i<=3;i++) {
			clickElement.click();
			Thread.sleep(1000);	
		}
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for(String handle : allWindowHandles)
		{
			System.out.println("Window handle ->" + handle);
		}
		 
	
		
	

	}

}
