package trial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindAllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.toolsqa.com/");
		//java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		//System.out.println(links.size());
		//for(int i=1; i<links.size();i++) {
			//System.out.println(links.get(i).getText());
		//}
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
	//java.util.List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	//System.out.println(checkboxes.size());
		
		//java.util.List<WebElement> dropdown = driver.findElements(By.tagName("select"));
		//System.out.println(dropdown.size());
		
		java.util.List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']")); 
		System.out.println(textboxes.size());
	
	}

}
