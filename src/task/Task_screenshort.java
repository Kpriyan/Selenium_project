package task;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_screenshort {
	
     

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "/Users/priyan/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		TakesScreenshot take = (TakesScreenshot) driver;
		File filetype  = take.getScreenshotAs(OutputType.FILE);
		File  location = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/img1.png");
		FileUtils.copyFile(filetype, location);
		
		
		
		

	}

}
