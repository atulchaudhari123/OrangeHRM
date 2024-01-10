import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDynamic {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://Atul//Shammi Jha//Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://money.rediff.com/gainers");

		Thread.sleep(2000);
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(rows.size());

		Thread.sleep(2000);
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[2]/td"));
		System.out.println(col.size());

		System.out.println(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[15]/td[3]")).getText());

		driver.close();

	}
}
