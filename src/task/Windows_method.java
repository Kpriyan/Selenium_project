package task;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_method {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Window.html");// parent window
		
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Set<String> choosewindows =	driver.getWindowHandles();
		Iterator<String> iter = choosewindows.iterator();
		
		String parentwindow = iter.next();
		String childwindow = iter.next();
		
		driver.switchTo().window(childwindow);
		
		
		
		//driver.close();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().window(parentwindow);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
