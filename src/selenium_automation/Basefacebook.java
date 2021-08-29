package selenium_automation;

import org.openqa.selenium.WebDriver;

public class Basefacebook extends BaseMethods {

	public static WebDriver  driver;

	public static void main(String[] args) {

	driver = Browserconfig("chrome");

		getURL("https://en-gb.facebook.com/");

		Baselocators obj = new Baselocators(driver);

		InputValues(obj.getEmail(), "vinothpriyan100@gmail.com");

		InputValues(obj.getPassword(), "Vijaypriyan@100");

		Clickonelement(obj.getLogin());
		
		Close();

	}

}
