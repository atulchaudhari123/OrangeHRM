import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
	
	public static void main (String[]args) throws Exception {
	System.setProperty("webdriver.chrome.driver",
			"C://Atul//Shammi Jha//Software//chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
	Thread.sleep(3000);
    Alert alert = driver.switchTo().alert();
    String x = alert.getText();
    System.out.println(x);
    Thread.sleep(2000);
    alert.accept();
    
    driver.close();
}
}