package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement element = driver.findElement(By.xpath(".//*[@class=\"_3zdbog _3Ed3Ub\"]/ul/li[4]/span"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		action.click();
		//WebElement subelement = driver.findElement(By.linkText("Flats"));  
		WebElement subelement = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li[4]/ul/li/ul/li[3]/ul/li[1]/a"));
		action.moveToElement(subelement);
		action.click();
		action.perform();
			

	}

}
