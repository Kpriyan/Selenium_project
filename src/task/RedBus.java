package task;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Chennai");
		WebElement fromselect = driver.findElement(By.xpath("//li[@class='selected']"));
		fromselect.click();

		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Coimbatore");
		WebElement toselect = driver.findElement(By.xpath("//li[normalize-space()='Coimbatore']"));
		toselect.click();

		WebElement calendar = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		calendar.click();
		WebElement selectmonth = driver.findElement(By.xpath("//button[normalize-space()='>']"));
		selectmonth.click();
		WebElement selectdate = driver.findElement(By.xpath("//td[normalize-space()='13']"));
		selectdate.click();

		WebElement sarch = driver.findElement(By.xpath("//button[normalize-space()='Search Buses']"));
		sarch.click();
		
		//WebElement closewaste = driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']"));
		//closewaste.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement close = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='icon icon-close c-fs']")));
		close.click();
		
		WebElement deptime = driver.findElement(By.xpath("//ul[@class='dept-time dt-time-filter']//li[2]//label[1]"));
		deptime.click();
		
		WebElement bustype = driver.findElement(By.xpath("//ul[@class='list-chkbox']//li[3]//label[1]"));
		bustype.click();
		
		WebElement arrtime = driver.findElement(By.xpath("//ul[@class='dept-time at-time-filter']//li[3]//label[1]"));
		arrtime.click();
		
		WebElement boardpoint = driver.findElement(By.xpath("//input[@placeholder='BOARDING POINT']"));
		boardpoint.click();
		
		WebElement boardpointsarach = driver.findElement(By.xpath("//input[@name='inpFilter']"));
		boardpointsarach.sendKeys("guindy");
		WebElement boardselectplace = driver.findElement(By.xpath("//div[@class='overlay']//label[1]"));
		boardselectplace.click();
		WebElement boardapply = driver.findElement(By.xpath("//div[@class='button btn-apply bp-apply']"));
		boardapply.click();
		
		//Thread.sleep(3000);
		
		try {
			WebElement droppoint = driver.findElement(By.xpath("//input[@name='inpFilter']"));
			droppoint.sendKeys("gandhipuram");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.navigate().to("https://www.redbus.in/bus-tickets/chennai-to-coimbatore?"
				+ "fromCityName=Chennai&fromCityId=123&toCityName=Coimbatore&toCityId=141&onward=13-Aug-2021"
				+ "&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
		


	}

}
