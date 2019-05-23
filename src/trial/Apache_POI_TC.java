package trial;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import appModules.SignInAction;

public class Apache_POI_TC {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws IOException {
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet1");
		
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(Constant.URL);
		
		SignInAction.Execute(driver);
		System.out.println("Login successfully");
		Home_Page.lnk_LogOut(driver).click();
		driver.quit();
		ExcelUtils.setCellData("Pass", 1, 3);
		
		

	}

}
