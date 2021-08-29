package selenium_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_13_javascript {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement mobile = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		
	    js.executeScript("arguments[0].click();", mobile);
		
		//scroll up
		js.executeScript("window.scrollBy(0,2000);");
		
		Thread.sleep(3000);
		//scroll down
		js.executeScript("window.scrollBy(0,-2000);");
		// exact place
		WebElement scrollIntoView = driver.findElement(By.xpath("//img[@title='Boat Offers Headphones and Speakers']"));
		
		js.executeScript("arguments[0].scrollIntoView();", scrollIntoView);
		
		String string = js.executeScript("return arguments[0].innerHTML", scrollIntoView).toString();
		System.out.println(string);
		
		
		
		
		
		
		
		

	}

}
