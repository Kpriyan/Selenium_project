package selenium_automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10_Dynamicxpath {
	//2child-1child //span[@class='product-strike']//preceding-sibling::span[@class='product-discountedPrice']
	//1child-2child //span[@class='product-discountedPrice']//following-sibling::span[@class='product-strike']
	//parent-child//span//child::span[@class='product-discountedPrice']
	//child - parent//span[@class='product-strike']//parent::span
	//G child - G parent //span[@class='product-strike']//ancestor::div[@class='product-price']
	//G parent - G child//div[@class='product-price']//descendant::span
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/shirt");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> actualprice = driver.findElements(By.xpath(
				"//span[@class='product-discountedPrice']//following-sibling::span[@class='product-strike']"));
		List<Integer> allpricelist = new ArrayList<Integer>();
		for (int i = 0; i < actualprice.size(); i++) {
			String price = actualprice.get(i).getText().replace("Rs. ", "");
			int prices = Integer.parseInt(price);
			allpricelist.add(prices);
		}

		System.out.println(allpricelist);
		int productcount = allpricelist.size();
		System.out.println("product count:" + productcount);
		System.out.println("minimum value : " + Collections.min(allpricelist));
		System.out.println("maxmimum value :" + Collections.max(allpricelist));

	}
        
}
