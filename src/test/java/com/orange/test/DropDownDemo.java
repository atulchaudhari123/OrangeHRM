import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C://Atul//Shammi Jha//Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys("Atul");
		driver.findElement(By.name("lastname")).sendKeys("Chaudhari");
		driver.findElement(By.name("reg_email__")).sendKeys("8767151095");
		driver.findElement(By.name("reg_passwd__")).sendKeys("mango123");

		WebElement d = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(d);
		s.selectByVisibleText("9");
		System.out.println(s.getAllSelectedOptions().size());
		System.out.println(s.getOptions().size());
		System.out.println(d.getText());

		WebElement m = driver.findElement(By.xpath("//select[@id='month']"));
		Select sm = new Select(m);
		sm.selectByValue("6");

		WebElement y = driver.findElement(By.xpath("//select[@id='year']"));
		Select sy = new Select(y);
		sy.selectByValue("1974");

		WebElement r = driver.findElement(By.xpath("//input[@name=\"sex\" and @value=\"1\"]"));
		if (r.isSelected() == false) {
			r.click();
		}
		
		driver.findElement(By.xpath("//button[@type=\"submit\" and @name =\"websubmit\" ]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
