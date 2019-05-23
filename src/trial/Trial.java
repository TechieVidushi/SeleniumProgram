package trial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/automation-practice-form");
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		oSelect.selectByIndex(0);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oSelect.deselectByIndex(0);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oSelect.deselectByVisibleText("Navigation Commands");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oSelect.deselectByVisibleText("Navigation Commands");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> oList = oSelect.getOptions();
		int oSize = oList.size();
		
		for(int i=0;i<oSize;i++) {
			
			String sValue = oList.get(i).getText();
			System.out.println(sValue);
			
			oSelect.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		oSelect.deselectAll();
		
		driver.close();

	}

}
