package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_google_Enter {

	public static void main(String[] args) {
		
		System.setProperty("Wedriver.chrome.driver", "chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		//driver.get("http://www.greenstechnologys.com/");
		
		//System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("GreensTechology"+Keys.ENTER);
		
	}

}
