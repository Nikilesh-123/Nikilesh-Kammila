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
		String url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_=nav_em_hd_clc_signin";
		driver.get(url);
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("xyz@gmail.com");
		
		WebElement submit = driver.findElement(By.id("continue"));
		submit.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("xyz");
		WebElement submit1 = driver.findElement(By.id("signInSubmit"));
		submit1.click();

		
		
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
