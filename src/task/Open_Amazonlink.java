package task;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Open_Amazonlink {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// Implicit Wait use
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.navigate()
				.to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid."
						+ "return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid."
						+ "identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
						+ "0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid."
						+ "claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid."
						+ "ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("vinothpriyan96@gmail.com");

		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();

		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("Vijaypriyan@143");

		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles" + Keys.ENTER);

		driver.navigate().back();

		// Explicit wait use for this element

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement pay = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Amazon Pay']")));
		pay.click();

		// Without Explicit Wait

		//WebElement amazonpay = driver.findElement(By.xpath("//a[normalize-space()='Amazon Pay']"));
		//amazonpay.click();

		driver.navigate().back();

		WebElement closeicon = driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		closeicon.click();

		WebElement signout = driver.findElement(By.linkText("Sign Out"));
		signout.click();

		driver.close();

	}

}
