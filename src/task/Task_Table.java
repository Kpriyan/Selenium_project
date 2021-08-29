package task;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_Table {
	static int indexofstableverision, indexofreleasedate, indexofbetaversion, indexofbetareleasedate;
	static String Language = "Ruby" , Python;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		List<WebElement> allheaders = driver.findElements(By.xpath("//table[@class='data-list']/thead/tr/th"));

		for (int i = 0; i < allheaders.size(); i++) {

			String txt = allheaders.get(i).getText();

			String headers = txt.replace("\n", "");
			//System.out.println(headers);

			if (headers.equalsIgnoreCase("Stable version")) {
				indexofstableverision = i;
				System.out.println("Index of stable version :" + i);

			} else if (headers.equalsIgnoreCase("release date")) {
				indexofreleasedate = i;
				System.out.println("Index of release date :" + i);

			} else if (headers.equalsIgnoreCase("beta version")) {
				indexofbetaversion = i;
				System.out.println("index of Beta Version :" + i);

			} else if (headers.equalsIgnoreCase("Beta release date")) {
				indexofbetareleasedate = i;
				System.out.println("Index of Beta release date :" + i);

			}

		}
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@class='data-list']/tbody/tr"));

		for (int i = 0; i < allrows.size(); i++) {

			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < alldata.size(); j++) {
				if (alldata.get(j).getText().equalsIgnoreCase("Ruby")) {
					System.out.println("Ruby stable version :" + alldata.get(indexofstableverision).getText());
					System.out.println("Ruby release date :" + alldata.get(indexofreleasedate).getText());
					System.out.println("Ruby Beta version :" + alldata.get(indexofbetaversion).getText());
					System.out.println("Ruby Beta release date :" + alldata.get(indexofbetareleasedate).getText());
System.out.println(".....................................................................................................");
				}else if (alldata.get(j).getText().equalsIgnoreCase("Python")) {
					System.out.println("Python stable version :" + alldata.get(indexofstableverision).getText());
					System.out.println("Python release date :" + alldata.get(indexofreleasedate).getText());
					System.out.println("Python Beta version :" + alldata.get(indexofbetaversion).getText());
					System.out.println("Python Beta release date :" + alldata.get(indexofbetareleasedate).getText());
					System.exit(0);
					
				}

			}

		}

	}

}
