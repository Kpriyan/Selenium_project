package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_NestedFrames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");

		WebElement outerframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(outerframe);

		String frametxt = driver.findElement(By.cssSelector("html")).getText();
		System.out.println(frametxt);

		WebElement innerframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(innerframe);

		String innerframetxt = driver.findElement(By.cssSelector("html")).getText();
		System.out.println(innerframetxt);
		
		driver.switchTo().defaultContent();
		
		driver.close();

	}

}
