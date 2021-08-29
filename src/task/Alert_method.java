package task;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement alertbox = driver.findElement(By.xpath("//button[normalize-space()='Alert Box']"));
		alertbox.click();
		Alert alertpop = driver.switchTo().alert();
		alertpop.accept();

		WebElement confrombox = driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']"));
		confrombox.click();
		Alert confrompop = driver.switchTo().alert();
		confrompop.dismiss();

		WebElement promptbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptbox.click();
		Alert promptpop = driver.switchTo().alert();
		promptpop.sendKeys("I'M Waiting");
		promptpop.accept();

		WebElement linebreaks = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/button"));
		linebreaks.click();
		Alert linepop = driver.switchTo().alert();
		linepop.accept();

		WebElement sweetalert = driver.findElement(By.xpath("//button[normalize-space()='Sweet Alert']"));
		sweetalert.click();

		driver.close();

	}

}
