package selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/priyan/eclipse-workspace/DemoProject/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();

		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		boolean c = create.isDisplayed();
		System.out.println(c);
		create.click();

		Thread.sleep(3000);

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		boolean name = firstname.isEnabled();
		System.out.println(name);
		firstname.sendKeys("vinoth");

		WebElement surename = driver.findElement(By.name("lastname"));
		surename.sendKeys("priyan");

		WebElement mobileno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobileno.sendKeys("8072724593");

		WebElement password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		password.sendKeys("1234567876");

		WebElement Date = driver.findElement(By.id("day"));
		Select DOBdate = new Select(Date);
		DOBdate.selectByIndex(14);

		WebElement Month = driver.findElement(By.id("month"));
		Select DOBmonth = new Select(Month);
		DOBmonth.selectByIndex(1);

		WebElement Year = driver.findElement(By.id("year"));
		Select DOByear = new Select(Year);
		DOByear.selectByIndex(27);

		WebElement male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
		male.click();
		boolean sel = male.isSelected();
		System.out.println(sel);

	}

}
