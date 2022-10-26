package sampletest.SampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	
	public static void main(String[] args) {
		System.out.println("starting sampletest");
		
		System.getProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		//sleep for 3 seconds
        sleep();
		
		driver.manage().window().maximize();
		String url ="https://www.facebook.com";
		driver.get(url);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("");
		WebElement submit = driver.findElement(By.id("u_0_b"));
		submit.click();

		
		
		System.out.println("page is open");
		

	}

	private static void sleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	}
