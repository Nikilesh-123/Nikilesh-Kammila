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
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("ramulu");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("ramulu");
		
		WebElement text = driver.findElement(By.name("reg_email__"));
		text.sendKeys("ramulu@gmail.com");
		
		WebElement input = driver.findElement(By.name("reg_email_confirmation__"));
		input.sendKeys("ramulu@gmail.coom");
		
		WebElement password = driver.findElement(By.name("reg_passwd__"));
		password.sendKeys("14bk1a0555");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
	    day.sendKeys("29");
	    day.click();
		
	    WebElement month = driver.findElement(By.id("month"));
	    month.click();
	    month.sendKeys("sept");
	    month.click();
	    
	    WebElement year = driver.findElement(By.id("year"));
	    year.click();
	    year.sendKeys("1996");
	    year.click();
	    
	    WebElement radio = driver.findElement(By.id("u_0_7"));
	    radio.click();
		//WebElement submit = driver.findElement(By.id("u_0_b"));
		//submit.click();

		
		
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
