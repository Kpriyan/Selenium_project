package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_facebook {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/priyan/eclipse-workspace/DemoProject/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("vinothpriyan100@gmail.com");

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Vijaypriyan@100");

		WebElement button = driver.findElement(By.name("login"));
		button.click();

		// driver.close();
	}

}
