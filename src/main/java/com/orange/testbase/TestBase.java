package com.orange.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static Properties prop = null;
	public static WebDriver driver = null;

	public TestBase() throws Exception {

		File src = new File(
				"C:\\Atul\\Silenium\\Selenium Frameworks\\OrangeHRM\\src\\main\\java\\com\\orange\\config\\config.properties");
		FileInputStream fn = new FileInputStream(src);
		prop = new Properties();
		prop.load(fn);

	}

	public void initialization() {
		String browserName = prop.getProperty("browserType");
		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("ApplicationURL"));

	}

}
