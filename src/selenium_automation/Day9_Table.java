package selenium_automation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9_Table {

	static int indexofTotalCases, indexofTotalRecovered, indexofActiveCases;

	static String country = "India";

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.worldometers.info/coronavirus/#countries");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

		List<WebElement> allheaders = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));

		for (int i = 0; i < allheaders.size(); i++) {

			String txt = allheaders.get(i).getText();

			String headres = txt.replace("\n", "");
			//System.out.println(headres);

			if (headres.equalsIgnoreCase("TotalCases")) {
				indexofTotalCases = i;
				System.out.println("index of total cases:" + i);

			} else if (headres.equalsIgnoreCase("TotalRecovered")) {
				indexofTotalRecovered = i;
				System.out.println("index of Recovered:" + i);

			} else if (headres.equalsIgnoreCase("ActiveCases")) {
				indexofActiveCases = i;
				System.out.println("index of Active cases:" + i);

			}
		}

		List<WebElement> allrows = driver
				.findElements(By.xpath("//table[@id='main_table_countries_today']" + "/tbody/tr[@role='row']"));
		for (int i = 0; i < allrows.size(); i++) {

			List<WebElement> alldata = allrows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < alldata.size(); j++) {

				if (alldata.get(j).getText().equalsIgnoreCase("india")) {

					System.out.println("Total case in India :" + alldata.get(indexofTotalCases).getText());

					System.out.println("Total Recoverd case in India :" + alldata.get(indexofTotalRecovered).getText());

					System.out.println("Total Active case in India :" + alldata.get(indexofActiveCases).getText());

					System.exit(0);
				}

			}

		}

	}

}
