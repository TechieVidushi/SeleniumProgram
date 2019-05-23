package trial;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosingallWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(" Parent Window's Handle ->" +parentWindowHandle);
		WebElement clickElement = driver.findElement(By.id("button1")); 
		for(int i=0;i<=3;i++) {
			clickElement.click();
			Thread.sleep(3000);
		}
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		String lastWindowHandle = "";
		for(String handle : allWindowHandles) {
			System.out.println("Switching to window ->" +handle);
			System.out.println("Navigating to google.com");
			driver.switchTo().window(handle);
			driver.get("https://www.google.com/");
			lastWindowHandle = handle ;
		}
		driver.switchTo().window(parentWindowHandle);
		driver.close();
		driver.switchTo().window(lastWindowHandle);
		driver.get("https://www.toolsqa.com/");

	}

}
