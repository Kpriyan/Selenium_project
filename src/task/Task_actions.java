package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_actions {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		
		WebElement account = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(bank).moveToElement(account).release().build().perform();
		
		WebElement rs = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		
		WebElement amount = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		
		Actions acts = new Actions(driver);
		acts.clickAndHold(rs).moveToElement(amount).release().build().perform();
		
		WebElement sales = driver.findElement(By.xpath("//a[normalize-space()='SALES']"));
		
		WebElement caccount = driver.findElement(By.xpath("//ol[@id='loan']"));
		
		Actions ac = new Actions(driver);
		ac.clickAndHold(sales).moveToElement(caccount).release().build().perform();
		
		WebElement Rs = driver.findElement(By.xpath("//section[@id='g-container-main']//li[4]//a[1]"));
		
		WebElement camount = driver.findElement(By.xpath("//ol[@id='amt8']//li[@class='placeholder']"));
		
		Actions a = new Actions(driver);
		a.clickAndHold(Rs).moveToElement(camount).release().build().perform();
		
		WebElement perfect = driver.findElement(By.xpath("//a[normalize-space()='Perfect!']"));
		perfect.click();
		
		
		
		
		
		
		
	}

}
