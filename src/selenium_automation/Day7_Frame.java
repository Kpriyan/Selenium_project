package selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day7_Frame {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Frames.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		// frame size

		List<WebElement> totalframes = driver.findElements(By.tagName("iframe"));
		int framesize = totalframes.size();
		System.out.println(framesize);

		driver.switchTo().frame(0); // inside frame

		WebElement firstframetxt = driver.findElement(By.xpath("//input[@type='text']")); // text box

		firstframetxt.sendKeys("sucess.."); // enter text

		driver.switchTo().defaultContent();// old frame (window frame)
		
	System.out.println("...............................................................................");
	
		// second frame click
	
		WebElement secondframe = driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']"));

		secondframe.click();

		Thread.sleep(3000);

		WebElement outersecondframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outersecondframe);
        
        
		driver.switchTo().frame(0);
        WebElement secondframetxt = driver.findElement(By.xpath("//input[@type='text']"));

		secondframetxt.sendKeys("sucess...");

	}

}
