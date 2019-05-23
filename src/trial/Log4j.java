package trial;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.FileAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4j {
	
	private static WebDriver driver;
	
	private static Logger Log = Logger.getLogger(Log4j.class.getName());

	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
		org.apache.log4j.Logger OurLogger = LogManager.getLogger("OurLogger");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		FileAppender fileAppender = new FileAppender();
	      fileAppender.setFile("logfile.txt");
	      fileAppender.setLayout(new SimpleLayout());
	      
	      Log.info("New driver instantiated");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Log.info("Implicit wait applied on the driver for 10 seconds");
			
			driver.get("https://www.google.com/");
			
			Log.info("Web application launched");
			
			driver.findElement(By.id("gb_70")).click();
			
			Log.info("Clicked on Sign In link");
			
			driver.findElement(By.id("identifierId")).sendKeys("vidushi.dubey2107@gmail.com");;
			
			Log.info("Email id entered");
			
	      
		
		OurLogger.addAppender(fileAppender);
	      fileAppender.activateOptions();
		
		
		 int x = 0;
	      while(x < 11){
	      OurLogger.debug("This is just a log that I want to print " + x);
	      x++;
	      }
	      
		driver.quit();
		

	}

}
