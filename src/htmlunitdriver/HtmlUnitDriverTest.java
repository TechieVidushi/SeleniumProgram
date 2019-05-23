package htmlunitdriver;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class HtmlUnitDriverTest {
	
	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER);

		
		driver.get("https://www.seleniumhq.org/");
		
		
		System.out.println("Title is: " + driver.getTitle());
		
		WebClient webClient = null;
		try {
			webClient = (WebClient) get(driver, "webClient");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Browser version is :" + webClient.getBrowserVersion());
		
		System.out.println("Is browser Chrome :" + webClient.getBrowserVersion().isChrome());
		System.out.println("Is browser Firefox :" + webClient.getBrowserVersion().isFirefox());
		System.out.println("Is browser IE:" + webClient.getBrowserVersion().isIE());
		
		driver.quit();
	
	}

	private static WebClient get(HtmlUnitDriver driver, WebClient webClient) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private static Object get(Object object, String field) throws Exception {
		  Field f = object.getClass().getDeclaredField(field);
		  f.setAccessible(true);
		  return f.get(object);
		 }

}
