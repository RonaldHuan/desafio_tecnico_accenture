package br.com.sampleapp.core.webdriver.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	private static WebDriver driver;
	
	private static WebDriver setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver getDriver() {
		if(driver != null) {
			return driver;
		}
		
		WebDriver driver = setUp();
		return driver;
	}
	
	public static void tearDown() {
		getScreenShot();
		driver.quit();
		driver = null;
	}
	
	public static void getScreenShot() {
		File screenShot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenShot, new File("./evidencias/sample_app.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
