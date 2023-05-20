package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	private static Object object;

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("kiran");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"))
				.sendKeys("kiranghuge76@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		WebElement button = driver.findElement(By.cssSelector("input[type='radio']"));
		button.click();
		WebElement password1 = driver.findElement(By.id("password"));
		password1.sendKeys("123456");

		WebElement dropDownDays = driver.findElement(By.cssSelector("select[id='days']"));
		dropDownDays.click();

		driver.findElement(By.cssSelector("option[value='13']")).click();

		WebElement dropDownMonths = driver.findElement(By.cssSelector("select[id='months']"));
		dropDownMonths.click();
		driver.findElement(By.xpath("//*[@id=\"months\"]/option[3]")).click();

		WebElement dropDownYears = driver.findElement(By.cssSelector("select[data-qa='years']"));
		dropDownYears.click();
		dropDownYears.findElement(By.cssSelector("option[value='2000']")).click();
		WebElement checkBoxElement = driver.findElement(By.cssSelector("label[for='newsletter']"));
		checkBoxElement.click();
		Thread.sleep(1000);

		checkBoxElement.click();

		WebElement checkbox2 = driver.findElement(By.cssSelector("label[for='optin']"));
		checkbox2.click();
		Thread.sleep(1000);
		checkbox2.click();

		WebElement firstnamElement = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
		firstnamElement.sendKeys("kiran_1");

		WebElement lastNamElement = driver.findElement(By.cssSelector("input[id*=las]"));
		lastNamElement.sendKeys("ghuge");

		WebElement companyElement = driver.findElement(By.cssSelector("input[data-qa*=com]"));
		companyElement.sendKeys("xyz");

		WebElement address1 = driver.findElement(By.cssSelector("input[data-qa='address']"));
		address1.sendKeys("b-5 dashmesh akurdi");

		WebElement address2 = driver.findElement(By.cssSelector("input[id*=address2]"));
		address2.sendKeys("behind the clean xpert laundry");

		WebElement state = driver.findElement(By.cssSelector("input[id='state']"));
		state.sendKeys("Maharastra");

		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("PUNE");

		driver.findElement(By.id("zipcode")).sendKeys("411035");
		driver.findElement(By.id("mobile_number")).sendKeys("7620692915");

		WebElement sumbitButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button"));
		sumbitButton.click();
		driver.navigate().refresh();
		System.out.println("account created");
		
		WebElement deletElement =  driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
		deletElement.click();
		
		System.out.println("account deleted ");
		
		
	}

}
