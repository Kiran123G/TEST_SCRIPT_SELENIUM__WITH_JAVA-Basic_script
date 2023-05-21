package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

	public static void main(String[] args) {
		WebDriver driver  =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		WebElement email =  driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("kiranghuge76@gmail.com");
		
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		password.sendKeys("123456");
		
		WebElement login_button = driver.findElement(By.cssSelector("button[data-qa='login-button']"));
		login_button.click();
		
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		
		//driver.quit();
	}

}
