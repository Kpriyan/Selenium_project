package selenium_automation;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day15 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sigin = driver.findElement(By.xpath("//a[@class='login']"));
		sigin.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.xpath("//div//child::input[@id='email_create']"));
		email.sendKeys("greenstech2021@gmail.com");

		WebElement create = driver.findElement(By.xpath("//span[normalize-space()='Create an account']"));
		create.click();

		WebElement errorclose = driver.findElement(By.xpath("//div[@id='create_account_error']"));
		errorclose.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement sigin1 = driver.findElement(By.xpath("//a[@class='login']"));
		sigin1.click();

		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("greenstech2021@gmail.com");

		WebElement emailpass = driver.findElement(By.id("passwd"));
		emailpass.sendKeys("greenstech");

		WebElement siginto = driver.findElement(By.xpath("//span[normalize-space()='Sign in']"));
		siginto.click();

		/*
		 * WebElement dressbutton =
		 * driver.findElement(By.xpath("//div[@id=\"block_top_menu\"]/ul/li[2]/a"));
		 * System.out.println("dressclick " + dressbutton.getText());
		 * dressbutton.click();
		 * 
		 * WebElement summerdress =
		 * driver.findElement(By.xpath("//div[@class='block_content']/ul/li[3]/a"));
		 * System.out.println("dressclick:" + summerdress.getText());
		 * summerdress.click();
		 */

		// or

		WebElement dress = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));

		WebElement summerdress = driver
				.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/ul/li[3]/a"));

		Actions ac = new Actions(driver);
		
	    ac.moveToElement(dress).build().perform();

		ac.click(summerdress).build().perform();

		WebElement printedsummerdressview = driver.findElement(
				By.xpath("//*[@href='http://automationpractice.com/index.php?id_product=6&controller=product']"));
		printedsummerdressview.click();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		
        WebElement quatity = driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]"));
		
		for (int i = 1; i < 10; i++) {
			quatity.click();

		}
		
		WebElement size = driver.findElement(By.xpath("//*[@id=\"group_1\"]"));
		
		Select select = new Select(size);
		select.selectByValue("2");
		
		WebElement color = driver.findElement(By.xpath("//*[@id=\"color_8\"]"));
		color.click();
		
		
	   
		/*WebElement quickviewclose = driver.findElement(By.xpath("/html/body/div[2]/div/div/a"));
		quickviewclose.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement printedsummerdressselect = driver
				.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a"));
		printedsummerdressselect.click();

		WebElement quickview = driver.findElement(By.xpath("//*[@id=\"thumb_18\"]"));
		quickview.click();

		WebElement viewlarger = driver.findElement(By.xpath("//a[@title='Close']"));
		viewlarger.click();*/

		
		WebElement addcart = driver.findElement(By.xpath("//span[normalize-space()='Add to cart']"));
		addcart.click();
		
        driver.switchTo().defaultContent();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,-2000);");

        Thread.sleep(2000);

		TakesScreenshot shot = (TakesScreenshot) driver;

		File source = shot.getScreenshotAs(OutputType.FILE);

		File store = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/snap5.png");

		FileUtils.copyFile(source, store);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement firstproceed = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span"));
		firstproceed.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement decressproduct = driver.findElement(By.xpath("//i[@class='icon-minus']"));
         
		for (int i = 10; i >7; i--) {
			decressproduct.click();
			
		}
        
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement summarycheckout = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		
		summarycheckout.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement message = driver.findElement(By.xpath("//div//descendant::textarea[@name='message']"));

		message.sendKeys("good sopping app");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		js.executeScript("window.scrollBy(0,-250);");

        Thread.sleep(2000);

		TakesScreenshot shot1 = (TakesScreenshot) driver;

		File source1 = shot1.getScreenshotAs(OutputType.FILE);

		File store1 = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/snap6.png");

		FileUtils.copyFile(source1, store1);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement addresscheckout = driver.findElement(By.xpath("//button[@name='processAddress']"));
		addresscheckout.click();

		WebElement agree = driver.findElement(By.xpath("//input[@type='checkbox']"));
		agree.click();

		WebElement shippingcheckout = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		shippingcheckout.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		js.executeScript("window.scrollBy(0,400);");

		Thread.sleep(2000);

		TakesScreenshot shot2 = (TakesScreenshot) driver;

		File source2 = shot2.getScreenshotAs(OutputType.FILE);

		File store2 = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/snap7.png");

		FileUtils.copyFile(source2, store2);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement paymethod = driver.findElement(By.xpath("//div//descendant::a[@class='bankwire']"));
		paymethod.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		js.executeScript("window.scrollBy(0,300);");
		Thread.sleep(2000);

		TakesScreenshot shot3 = (TakesScreenshot) driver;

		File source3 = shot3.getScreenshotAs(OutputType.FILE);

		File store3 = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/snap8.png");

		FileUtils.copyFile(source3, store3);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement logo = driver.findElement(By.xpath("//a//child::img[@alt='My Store']"));
		logo.click();

		WebElement signout = driver.findElement(By.xpath("//a[@title='Log me out']"));
		signout.click();

		driver.close();

	}

}
