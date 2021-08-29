package selenium_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day8_wait_concept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	    WebElement fashion = driver.findElement(By.xpath("//a[normalize-space()='Fashion']"));
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		fashion.click();
		
		WebElement mobiles = driver.findElement(By.xpath("//a[normalize-space()='Mobiles']"));
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		         wait.until(ExpectedConditions.visibilityOf(mobiles));
		         
		         mobiles.click();
		
	}

}
