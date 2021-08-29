package task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edite_method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Edit.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vinothpriyan123@gmail.com");

		WebElement append = driver.findElement(By.xpath("//input[contains(@value,'Append')]"));
		//append.clear();
		append.sendKeys("text");

		WebElement defaluttext = driver.findElement(By.name("username"));
		String txt = defaluttext.getText();
		System.out.println(txt);

		WebElement clear = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		clear.clear();

		WebElement able = driver.findElement(By.tagName("input"));
		boolean enable = able.isEnabled();
		System.out.println(enable);

	}

}
