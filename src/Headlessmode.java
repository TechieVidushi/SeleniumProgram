import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headlessmode {

	public static void main(String[] args) throws InterruptedException {
		HtmlUnitDriver unitdriver = new HtmlUnitDriver();
		
		unitdriver.get("https://www.google.com/");
		System.out.println("Title of the page is ->" +unitdriver.getTitle());
		WebElement searchBox = unitdriver.findElement(By.name("q"));
	

	}

}
