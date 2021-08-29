package selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Baselocators {

	public static WebDriver driver;

	public Baselocators(WebDriver driver2) {

		Baselocators.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	@FindBy(id = "email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id = "pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

}
