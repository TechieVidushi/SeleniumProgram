package linkpartial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPartial {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Chromedriver\\chromedriver.exe");
		//String baseUrl = "http://demo.guru99.com/test/link.html";
		//String baseUrl = "http://demo.guru99.com/test/accessing-link.html";
		//String baseUrl = "http://demo.guru99.com/test/newtours/";
		String baseUrl = "http://demo.guru99.com/test/block.html";
		WebDriver driver = new ChromeDriver();
		driver.get(baseUrl);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.linkText("click here")).click();
		//driver.findElement(By.partialLinkText("here")).click();
		//String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
		//System.out.println(theLinkText);
		//theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		//System.out.println(theLinkText);
		//System.out.println("Title of the page is :" +driver.getTitle());
		
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.quit();	

	}

}
