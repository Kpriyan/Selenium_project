package task;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_alert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement alertbox = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		alertbox.click();
		Thread.sleep(3000);
		Alert alertpop = driver.switchTo().alert();
		alertpop.accept();

		WebElement confrombox = driver
				.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][normalize-space()='Click me!']"));
		confrombox.click();
		Thread.sleep(3000);
		Alert confrompop = driver.switchTo().alert();
		confrompop.dismiss();

		WebElement promptbox = driver.findElement(By.xpath("//button[normalize-space()='Click for Prompt Box']"));
		promptbox.click();
		Thread.sleep(3000);
		Alert promptpop = driver.switchTo().alert();
		promptpop.sendKeys("I'M Waiting");
		promptpop.accept();
		
		//driver.close();
	}

}
