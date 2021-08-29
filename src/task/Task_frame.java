package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_frame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");

		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);

		WebElement outerframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(outerframe);

		String frametxt = driver.findElement(By.cssSelector("html")).getText();
		System.out.println(frametxt);

		driver.switchTo().defaultContent();

		WebElement secouterframe = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(secouterframe);

		String secframetxt = driver.findElement(By.cssSelector("html")).getText();
		System.out.println(secframetxt);

		driver.close();

	}

}
