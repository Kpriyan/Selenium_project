package task;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_method2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");

		WebElement open = driver.findElement(By.xpath("//div[@class='row']/div/div/h3"));
		String txt = open.getText();
		System.out.println(txt);

		String oldwindow = driver.getWindowHandle();

		WebElement nxtwindow = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		nxtwindow.click();

		Set<String> choosewindow = driver.getWindowHandles();

		for (String newwindow : choosewindow) {

			driver.switchTo().window(newwindow);

			String titles = driver.switchTo().window(newwindow).getTitle();
			System.out.println(titles);
			
			driver.switchTo().window(oldwindow);


		}
		

		}

}
