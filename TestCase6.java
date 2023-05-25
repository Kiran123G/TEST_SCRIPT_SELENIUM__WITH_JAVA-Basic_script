package assignmentSelf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase6 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://automationexercise.com/");
		WebElement contactUsElement = driver.findElement(By.xpath("//a[contains(text(),' Contact us')]"));
		contactUsElement.click();
		WebElement name = driver.findElement(By.xpath("//input[contains(@name,'name')]"));
		name.sendKeys("kiran");

		WebElement emailElement = driver
				.findElement(By.xpath("//input[contains(@type,'email')]"));
		emailElement.sendKeys("kiranghuge76@gmail.com");
		
		WebElement subjectElement = driver.findElement(By.xpath("//input[@placeholder='Subject']"));
		subjectElement.sendKeys("xyz");
		
		WebElement msgElement = driver.findElement(By.cssSelector("textarea[placeholder*='Your']"));
		msgElement.sendKeys("jbchsfewofedepdfpecfpfcphcfp");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
