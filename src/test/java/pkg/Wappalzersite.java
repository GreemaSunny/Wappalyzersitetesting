package pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wappalzersite {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com");
		driver.manage().window().maximize();
	}
	
	@ Test
	public void test() throws Exception {
		driver.findElement(By.xpath("//div[@class='d-none d-md-block flex-grow-1 flex-shrink-0 text-right col']/button[2]/span")).click();
		driver.findElement(By.xpath("//a[@href='/technologies/']/div/div[1]")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@href='/technologies/ecommerce/shopify/']/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//a[@class='mt-2 v-btn v-btn--has-bg v-btn--router theme--light v-size--large primary']/span")).click();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@placeholder='Find a technology']")).click();;
        driver.findElement(By.xpath("//input[@placeholder='E.g. ecommerce or Shopify']")).sendKeys("java",Keys.ENTER);
	}
}
