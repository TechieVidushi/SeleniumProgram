package phantomjs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
	
	public static void main(String[] args) {
		
		System.setProperty("C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\phantomjs", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\phantomjs\\phantomjs.exe");
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://seleniumhq.org/");
		
		System.out.println("Title is :" + driver.getTitle());
		
		driver.quit();
	}

}