import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C://Atul//Shammi Jha//Software//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		String ActualText = driver.findElement(By.id("demo")).getText();
		String ExpText = "You pressed Ok";

		if (ExpText.equals(ActualText) == true) {
			System.out.println("Test is passed");
		}

		else {
			System.out.println("Test is failed");
		}
		System.out.println(ActualText);
		driver.close();

	}

}
