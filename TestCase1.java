package assignmentSelf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase1 {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://qatechhub.com");
		
		String getTitleString = driver.getTitle();
		if (getTitleString.equals("QA Automation Tools Trainings and Tutorials | QA Tech Hub")) {
			
			System.out.println("test case pass");
		}

		else {
			System.out.println("fail");
		}
		driver.navigate().to("https://www.facebook.com");

		driver.navigate().back();
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
	}
}
