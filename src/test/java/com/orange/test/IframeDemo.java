import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C://Atul//Shammi Jha//Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SwitchTo")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Frames']")).click();
		
		driver.switchTo().frame("SingleFrame");
	}

}
