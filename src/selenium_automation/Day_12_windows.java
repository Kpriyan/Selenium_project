package selenium_automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_12_windows {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement mobile = driver.findElement(By.linkText("Mobiles"));

		Actions a = new Actions(driver);
		a.contextClick(mobile).perform();
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		for (int i = 0; i <= 0; i++) {
			Thread.sleep(3000);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
		}

		WebElement fashion = driver.findElement(By.xpath("//a[normalize-space()='Fashion']"));
		a.contextClick(fashion).build().perform();

		for (int i = 0; i <= 0; i++) {
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);

		}

		Thread.sleep(3000);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		WebElement pay = driver.findElement(By.linkText("Amazon Pay"));
		a.contextClick(pay).build().perform();

		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);

		Thread.sleep(3000);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);

		/*String windows = driver.getWindowHandle();
		System.out.println(windows);

		String titles = driver.switchTo().window(windows).getTitle();

		System.out.println(titles);
		
       // get window handle()/ return active window id
        
		Set<String> activewindow = driver.getWindowHandles();

		System.out.println(activewindow);

		// iterate
		for (String str : activewindow) {

			String windowtitle = driver.switchTo().window(str).getTitle();

			System.out.println(windowtitle);

		}
		
		String AmazonFashion =" Clothing, Footwear and Accessories online for Men, Women and Kids";
		
		for (String string : activewindow) {
			Thread.sleep(2000);
			if (driver.switchTo().window(string).getTitle().equalsIgnoreCase(AmazonFashion)) {
				System.out.println("sucess");
				
			}*/
		
	        String windows = driver.getWindowHandle();
			String titles = driver.switchTo().window(windows).getTitle();

			System.out.println(titles);
			Set<String> activewindow = driver.getWindowHandles();
			
		   Iterator<String> ite = activewindow.iterator();
			while (ite.hasNext()) {
				
				//String activetitle = ite.next();
				//String title2 = driver.switchTo().window(activetitle).getTitle();
				//System.out.println(title2);
			
				
			}
			
System.out.println("..........................................................");
			
			String AmazonFashion = ite.next();
			
			String title2 = driver.switchTo().window(AmazonFashion).getTitle();
			System.out.println(title2);
			

			
			
		}

	}
	



