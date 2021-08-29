package selenium_automation;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_Screenshort {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/priyan/eclipse-workspace/DemoProject/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.google.com");

		driver.navigate().to("http://www.greenstechnologys.com/selenium-training-in-chennai.html");

		TakesScreenshot shot = (TakesScreenshot) driver;

		File source = shot.getScreenshotAs(OutputType.FILE);

		File store = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/snap2.png");

		FileUtils.copyFile(source, store);

		driver.navigate().back();

		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File pic = ts.getScreenshotAs(OutputType.FILE);

		File stores = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/snap3.png");

		FileUtils.copyFile(pic, stores);


	}

}
