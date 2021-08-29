package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyan/eclipse-workspace/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().to("https://www.flipkart.com/");
		WebElement emailElement = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailElement.sendKeys("9787738776");
		WebElement passwordElement = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		passwordElement.sendKeys("Vijaypriyan@143");
		WebElement loginElement = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
        loginElement.click();
        Thread.sleep(3000);
        WebElement drop = driver.findElement(By.className("zZ3yfL"));
        drop.click();		

	}

}
