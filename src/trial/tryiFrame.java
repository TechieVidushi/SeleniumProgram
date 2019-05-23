package trial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tryiFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		List<WebElement> iElements = driver.findElements(By.tagName("iframe"));
		System.out.println("Total number of iFrames ->" +iElements.size());
		
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		driver.quit();

	}

}
