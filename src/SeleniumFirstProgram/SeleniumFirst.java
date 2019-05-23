package SeleniumFirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class SeleniumFirst {

	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {

		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}

	//setBrowser
	//setBrowserConfig
	//runTest

	public static void setBrowser(){

	 browser = "Chrome";

	}


	public static void setBrowserConfig(){

		String projectLocation = System.getProperty("user.dir");
		
		
        if(browser.contains("Firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.24.0-win32\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		//driver = new MarionetteDriver();
        }
		
        if(browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
        }

	}

	public static void runTest(){
		
		driver.get("https://seleniumhq.org/");
		driver.quit();

	}
}

