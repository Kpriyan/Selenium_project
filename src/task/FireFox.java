package task;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		
System.setProperty("Wedriver.gecko.driver", "geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");

	}

}
