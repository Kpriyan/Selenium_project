package task;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robt_screenshort {

	public static void main(String[] args) throws AWTException, IOException  {

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Alert.html");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Robot rob = new Robot();
		Dimension screensize =	Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect = new Rectangle(screensize);
		BufferedImage source = rob.createScreenCapture(rect);
		File destination = new File("/Users/priyan/eclipse-workspace/Selenium/screenshort/robotimg.png");
		ImageIO.write(source, "png", destination);
		
		
		
	}

}
