package task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseMethods {

	static WebDriver driver;

	// 1.click
	public static void Clickonelement(WebElement element) {

		element.click();

	}

	// 2. send_keys
	public static void InputValues(WebElement element, String value) {

		element.sendKeys(value);

	}

	// 3. get text
	public static void getvalues(WebElement element) {

		System.out.println(element.getText());

	}

	// 4.get title
	public static void getTitle(String Title) {
		String title2 = driver.getTitle();
		System.out.println(title2);

	}

	// 5. get url
	public static void getURL(String url) {

		driver.get(url);

	}

	// 6. get current url
	public static void getCurrentUrl(String Url) {

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);

	}

	// 7. quite
	public static void Quite() {

		driver.quit();
	}

	// 8. close
	public static void Close() {

		driver.close();
	}

	// 9. checkBox
	public static void checkBox(WebElement element) {
		element.click();

	}

	// WEB ELEMENT METHODS
	// 10.is enabled
	public static void isEnbaled(WebElement element) {

		boolean enabled = element.isEnabled();

		System.out.println(enabled);

	}

	// 11.is displayed
	protected void isDisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();

		System.out.println(displayed);

	}

	// 12.is selected
	public static void isSelected(WebElement element) {

		boolean selected = element.isSelected();

		System.out.println("isSelected:" + selected);

	}

	// 13. get attribute (value)
	public static void getAttribut(WebElement element, String option, String value) {

		if (option.equalsIgnoreCase("value")) {

			String attribute = element.getAttribute(value);

			System.out.println("passed Value: " + attribute);

		} else if (option.equalsIgnoreCase("name")) {

			String attribute2 = element.getAttribute(value);

			System.out.println("Attbribute value:" + attribute2);
		}

	}

	// 14.clear
	public static void clear(WebElement element) {

		element.clear();

	}

	// 15. navigation methods
	public static void navigateTo(String Url) {

		driver.navigate().to(Url);

	}

	// 16. move back
	public static void navigateBack(String Url) {

		driver.navigate().back();

	}

	// 17. navigate
	public static void navigateForward() {

		driver.navigate().forward();

	}

	// 18. refresh
	public static void navigateRefresh() {

		driver.navigate().refresh();

	}

	// 19.implicit_wait
	public static void ImplicitWaitMethod(int unit) {

		driver.manage().timeouts().implicitlyWait(unit, TimeUnit.SECONDS);

	}

	// 20. Explicit_wait
	public static void ExplicitWaitMethod(int unit, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, unit);

		wait.until(ExpectedConditions.visibilityOf(element));

	}

	// 21. Scree_short
	public static void ScreenShort(String location) throws Throwable {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File filetype = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(location);

		FileUtils.copyFile(filetype, destination);

	}

	// 22. Drag_Drop
	public static void DropDownSelect(WebElement element, String value, int index, String Select) {

		if (Select.equalsIgnoreCase("value")) {

			Select s = new Select(element);

			s.selectByValue(value);

		} else if (Select.equalsIgnoreCase("index")) {

			Select s = new Select(element);

			s.selectByIndex(index);

		} else if (Select.equalsIgnoreCase("visible")) {

			Select s = new Select(element);

			s.selectByVisibleText(value);

		}

	}

	// 23. multidropdown
	public static List<WebElement> getAllOptions(WebElement element, String size) {

		Select s = new Select(element);

		List<WebElement> options = s.getOptions();

		for (WebElement geto : options) {

			String text = geto.getText();

			System.out.println(text);
		}

		int size1 = options.size();

		System.out.println(size1);

		return options;
	}

	// 24. get all selected option

	public static void getAllSelected(WebElement element, String options, String value) {

		Select s = new Select(element);

		if (options.equalsIgnoreCase("index")) {

			int parseInt = Integer.parseInt(value);

			s.selectByIndex(parseInt);
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();

		for (WebElement selected : allSelectedOptions) {

			String text1 = selected.getText();

			System.out.println(text1);
		}
	}

	// 25. get first selected
	public static void getFirstSelected(WebElement element) {

		Select s = new Select(element);

		WebElement firstSelectedOption = s.getFirstSelectedOption();

		System.out.println(firstSelectedOption.getText());

	}

	// 26. Actions
	public static void Actions(WebElement element, String options) {

		if (options.equalsIgnoreCase("move")) {

			Actions act = new Actions(driver);

			act.moveToElement(element).build().perform();

		} else if (options.equalsIgnoreCase("click")) {

			Actions act = new Actions(driver);

			act.click(element).build().perform();

		} else if (options.equalsIgnoreCase("doubleclick")) {

			Actions act = new Actions(driver);

			act.doubleClick(element).build().perform();

		} else if (options.equalsIgnoreCase("rightclick")) {

			Actions act = new Actions(driver);

			act.contextClick(element).build().perform();

		}

	}

	// 27. Robot Actions
	public static void robotAction(WebElement element, String option) throws AWTException {

		Robot r = new Robot();

		if (option.equalsIgnoreCase("down")) {

			r.keyPress(KeyEvent.VK_DOWN);

			r.keyRelease(KeyEvent.VK_DOWN);

		} else if (option.equalsIgnoreCase("up")) {

			r.keyPress(KeyEvent.VK_UP);

			r.keyRelease(KeyEvent.VK_UP);
		}

		else if (option.equalsIgnoreCase("enter")) {

			r.keyPress(KeyEvent.VK_ENTER);

			r.keyRelease(KeyEvent.VK_ENTER);
		}

	}

	// 28.scroll up and down
	public static void scrollup(WebElement element, String option) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (option.equalsIgnoreCase("view")) {

			js.executeScript("arguments[0].scrollIntoView()", element);
		} else if (option.equalsIgnoreCase("pixel1")) {

			js.executeScript("window.scrollBy(0,-2000)");

		} else if (option.equalsIgnoreCase("pixel2")) {

			js.executeScript("window.scrollBy(0,-250)");

		} else if (option.equalsIgnoreCase("pixel3")) {

			js.executeScript("window.scrollBy(0,400)");

		} else if (option.equalsIgnoreCase("pixel4")) {

			js.executeScript("window.scrollBy(0,400)");
		}

	}

	// 29. frames
	public static void frames(WebElement element) {

		driver.switchTo().frame(element);
	}

	// mainframe
	public static void mainFrame() {

		driver.switchTo().defaultContent();
	}
	
	 //single frame
    public static void singleframe (int a) {
    	
    	driver.switchTo().frame(0);
    	
    }

	// 30. windowsHandle
	public static void windowsHandles(String type, String destination) {

		if (type.equalsIgnoreCase("singlewindow")) {

			String windowHandle = driver.getWindowHandle();

			System.out.println(windowHandle);

		} else if (type.equalsIgnoreCase("multiplewindows")) {

			Set<String> windowHandles = driver.getWindowHandles();

			for (String all : windowHandles) {

				System.out.println(all);

				String title1 = driver.switchTo().window(all).getTitle();

				System.out.println(title1);
			}
			String actualTitle = destination;

			for (String all : windowHandles) {

				if (driver.switchTo().window(all).getTitle().equals(actualTitle)) {

					break;
				}
			}

		}
	}

	// 31. Browser
	public static WebDriver Browserconfig(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "chromedriver");

			driver = new ChromeDriver();

		} else if (browsername.equalsIgnoreCase("Firefox")) {

			System.setProperty("webdriver.gecko.driver", "geckodriver");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		return driver;

	}

}
