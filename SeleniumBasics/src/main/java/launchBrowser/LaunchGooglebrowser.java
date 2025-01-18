package launchBrowser;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchGooglebrowser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--start-maximized");


		WebDriver driver = new ChromeDriver(chrome);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.navigate().to("https://letcode.in/test");
		
		String title = 	driver.getTitle();
		System.out.println(title);

		driver.quit();



	}

}
