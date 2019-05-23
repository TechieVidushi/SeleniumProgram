package trial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		String srow="1"; String scol="2" ;
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\workspace\\LearnJava\\SeleniumFirstProgram\\lib\\Mozilladriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		String sValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+srow+"]/td["+scol+"]")).getText();
		System.out.println(sValue);
		//driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]")).click();
		//System.out.println("Link clicked else exception");
		String target ="Clock Tower Hotel";
		for(int i =1; i<=5; i++) {
			 
			String sFind = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ i +"]/th")).getText();
			if(sFind.equalsIgnoreCase(target)) {
				
				for(int j=1;j<=5;j++) {
					String sColValue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ i +"]/th["+ j +"]")).getText();
					System.out.println(sColValue);
					
				} 
				
			break; 
			}
			
		}
		driver.close();
	
		
	}

}
