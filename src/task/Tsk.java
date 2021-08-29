package task;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsk {
	
	static int  indexofprogress , indexofmentorname;
	static String selenium = "learn locators";
	
	

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");

		List<WebElement> colums = driver.findElements(By.tagName("th"));
		int csize = colums.size();
		System.out.println(csize);

		System.out.println("............................................................");

		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rsize = rows.size();
		System.out.println(rsize);

		System.out.println("............................................................");

		WebElement percent = driver.findElement(
				By.xpath("//td[normalize-space()='Learn to interact with Elements']" + "//following::td[1]"));
		String p = percent.getText();
		System.out.println(p);

		System.out.println("............................................................");
		
		List<WebElement> allheaders = driver.findElements(
				By.xpath("//div[@class=' container table']//child::table[@id='table_id']"));
		for (int i = 0; i < allheaders.size(); i++) {
		String headerstxt =	allheaders.get(i).getText().replace("\n", ",");
			//System.out.println(headerstxt);
			
			if (headerstxt.equalsIgnoreCase("progress")) {
				indexofprogress=i;
				System.out.println("indexofprogress:" +  i);
				
			}else if (headerstxt.equalsIgnoreCase("mentorname")) {
				indexofmentorname=i;
				System.out.println("index of mentorname :" + i);
				
			}
		}
		
		List<WebElement> allrows = driver.findElements(By.xpath("//div[@class=' container table']//tr"));
		for (int i = 0; i < allrows.size(); i++) {
			List<WebElement> alldata= allrows.get(i).findElements(By.xpath("td"));
			for (int j = 0; j < alldata.size(); j++) {
				if (alldata.get(j).getText().equalsIgnoreCase("learn locators")) {
					System.out.println(" learn locators progress:" + alldata.get(indexofprogress).getText());

					System.out.println("learn locators mentor name :" + alldata.get(indexofmentorname).getText());
					System.exit(0);

					
				}
				
			}
			
		}
		
		
		
		

		
		}

	}


