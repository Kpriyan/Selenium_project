package task;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/frame.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.xpath("//button[normalize-space()='Click Me']"));
		frame1.click();
		String txt = frame1.getText();
		System.out.println(txt);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click1"));
		frame2.click();
		String txt2 = frame2.getText();
		System.out.println(txt2);

		driver.switchTo().defaultContent();

		List<WebElement> framesize = driver.findElements(By.xpath("//*[@id=\"wrapframe\"]"));
		int size = framesize.size();
		System.out.println(size);

	}

}
