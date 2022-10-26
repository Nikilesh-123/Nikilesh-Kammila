package booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flightbooking {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ysidi\\Downloads\\chromedriver1\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		
		
		//handling static dropdowns , dynamic dropdown, checkboxes, radio buttons, text button, alert-jaca popups, webdriver form methods
		driver.get("https://www.booking.com/flights/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[contains(text(),'One-way')]")).click();
		driver.findElement(By.cssSelector(".Text-module__root--variant-body_2___-3fYM.css-lilgi0")).click();
		driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M13.31 12l')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("DFW");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='css-qqvbcw']//span[@class='Icon-module__root___DweoM Icon-module__root--size-small___nolwT']//*[name()='svg']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='css-1tl2oa1']")).sendKeys("ORD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='ORD']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-1g86yah']//span[@class='Icon-module__root___DweoM Icon-module__root--size-medium___NsiEM Icon-module__root--color-neutral_alt___hZ7Jw']//*[name()='svg']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[data-date-cell='2022-11-26']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='css-ya5gr9 wide']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@aria-controls='CHEAPEST']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@id='flightcard-0']//div[@class='css-209ldq']//div//div[@class='Box-module__root___WETys Box-module__root--padding-none___aca5c Box-module__root--background-color-elevation_one___VVJRu Box-module__root--border-color-neutral_alt___MAzpK Box-module__root--border-width-100___8VTOa Box-module__root--border-radius-200___ciGYH Box-module__root--overflow-hidden___ezYc+']//div[@class='css-4o3ibe']//div[@class='css-1ltp57x']//div//button[@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Select']")).click();
		Thread.sleep(10000);
		driver.close();
		
	}

}
