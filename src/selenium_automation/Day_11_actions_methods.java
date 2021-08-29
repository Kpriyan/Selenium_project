package selenium_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_11_actions_methods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement singleclick = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
         //single click
		Actions ac = new Actions(driver);
		ac.click(singleclick).build().perform();
         //double click
		WebElement doubleclick = driver.findElement(By.xpath("//button[normalize-space()='Double Click Me']"));
		ac.doubleClick(doubleclick).build().perform();
        // right click
		WebElement rightclick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		ac.contextClick(rightclick).build().perform();

	}

}
