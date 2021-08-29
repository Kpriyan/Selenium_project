package selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day_4_Select {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/priyan/eclipse-workspace/DemoProject/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		driver.manage().window().maximize();
        // multi select method
		WebElement multi = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select multidrop = new Select(multi);
		multidrop.selectByIndex(1);
	    multidrop.selectByIndex(2);
	    multidrop.selectByIndex(3);
	       // (or)
		boolean result = multidrop.isMultiple();
		System.out.println(result);
		
System.out.println(".................................................");
		// getText /option all text get
		List<WebElement> options = multidrop.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			
		}
System.out.println(".................................................");

		// select by visible text // selected text print

		multidrop.selectByVisibleText("California");
		multidrop.selectByVisibleText("Texas");
		
System.out.println(".................................................");
         //getAllSelectedOptions();/getAllSelectedOptions();

		List<WebElement> selected = multidrop.getAllSelectedOptions();
		for (WebElement webElement : selected) {
			System.out.println(webElement.getText());
			
		}
		
System.out.println("...................................................");

		//getFirstSelectedOption();/first getAllSelectedOptions();

		WebElement first =	multidrop.getFirstSelectedOption();
		System.out.println(first.getText());
		
System.out.println(".................................................");
		
		
		multidrop.deselectAll();
		
		
		


		
	}

}
