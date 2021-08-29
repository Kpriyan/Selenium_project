package selenium_automation;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_Screenshort_Anothermethod {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/priyan/eclipse-workspace/DemoProject/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		takescreenshort("Facebook_loginpage");

		driver.manage().window().maximize();
	}

	public static void takescreenshort(String File) throws IOException {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/snap1.jpg"));
		

	}

}
