package selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Selenium_methods {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		// 1. get() get the web_link

		driver.get("http://www.amazon.in/");

		// 2.navigate.driver.manage().window().maximize();

		driver.manage().window().maximize();

		// 3. getTittle() get the title

		// String title = driver.getTitle();

		// System.out.println(title);

		System.out.println(driver.getTitle());

		// 4. get_currenturl() return current page url

		// String url = driver.getCurrentUrl();

		// System.out.println(url);

		System.out.println(driver.getCurrentUrl());

		// 5.navigate.to() navigate to url

		driver.navigate().to(
				"https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7");

		// 6.navigate.back() back to previous page

		driver.navigate().back();

		// 7.navigate.forward() to forward page

		driver.navigate().forward();

		// 8.navigate.refresh() current page

		driver.navigate().refresh();

		// 9. close it close the current tab

		driver.close();

		// 10.quit it will close the Browser

		driver.quit();

		
		
	}

}
