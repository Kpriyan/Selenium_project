package selenium_automation;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_Alert {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement alertbox = driver.findElement(By.id("alertButton"));
		alertbox.click();
		Thread.sleep(3000);
		Alert alertpop = driver.switchTo().alert();
		alertpop.accept();
		
		/*WebElement alertbox5sec = driver.findElement(By.id("timerAlertButton"));
		Thread.sleep(3000);
		alertbox5sec.click();
		Alert alertsecpop = driver.switchTo().alert();
		alertsecpop.accept();*/
		
		
		WebElement confrombox = driver.findElement(By.id("confirmButton"));
		confrombox.click();
		Thread.sleep(3000);
		Alert confrompop = driver.switchTo().alert();
		confrompop.dismiss();
		
		WebElement promptbox = driver.findElement(By.id("promtButton"));
		promptbox.click();
		Thread.sleep(3000);
		Alert promptpop = driver.switchTo().alert();
		promptpop.sendKeys("I'M Waiting");
		promptpop.accept();
	}

}
