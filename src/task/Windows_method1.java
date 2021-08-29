package task;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_method1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");// parent window

		WebElement childnextwindow = driver.findElement(By.xpath("//a[normalize-space()='Click Here']"));
		childnextwindow.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iter = windows.iterator();

		String parentwindow = iter.next();
		String childwindow = iter.next();

		driver.switchTo().window(childwindow);

		System.out.println(driver.getTitle());

		//driver.close();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().window(parentwindow);

		//System.out.println(driver.getTitle());

		WebElement open = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3"));
		String txt = open.getText();
		System.out.println(txt);
        driver.close();

	}

}
