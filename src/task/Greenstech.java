package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Greenstech {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("Webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.greenstechnologys.com");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		driver.navigate().to("http://www.greenstechnologys.com/contact.php");

		WebElement name = driver.findElement(By.id("InputName"));
		name.sendKeys("vinothpriyan");

		WebElement email = driver.findElement(By.id("InputEmail1"));
		email.sendKeys("vjpriyan143@gmail.com");

		WebElement mobileno = driver.findElement(By.id("InputSubject"));
		mobileno.sendKeys("8072724593");

		WebElement course = driver.findElement(By.name("courses"));
		Select coursename = new Select(course);
		coursename.selectByIndex(5);

		WebElement branch = driver.findElement(By.name("branch"));
		Select branchname = new Select(branch);
		branchname.selectByIndex(1);

		WebElement planning = driver.findElement(By.name("time"));
		Select plantime = new Select(planning);
		plantime.selectByIndex(1);

		WebElement message = driver.findElement(By.name("comments"));
		message.sendKeys("i'm waiting");

		WebElement submit = driver.findElement(By.xpath("//span[normalize-space()='Submit Now']"));
		submit.click();

		//driver.navigate().back();
		Thread.sleep(3000);
		driver.close();

	}

}
