package selenium3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MakeMyTripAutomation {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		
		//navigate to MakeMyTrip.com
		driver.get("https://www.triphobo.com/tripplanner");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.get("https://www.triphobo.com/tripplanner");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//input[@placeholder='Where do you want to go?']")).sendKeys("Bangkok");
		    driver.findElement(By.xpath("//span[text()='Bangkok, Bangkok, Thailand']")).click();
		    
		    
		    driver.findElement(By.xpath("//i[@class='c-icon js_calendar_icon']")).click();
		    
		   // driver.wait(5000);
		    driver.findElement(By.xpath("//td[@data-month='5']/a[@class='ui-state-default' and text()='18']")).click();
		    
		    driver.findElement(By.xpath("//td[@data-month='6']/a[@class='ui-state-default' and text()='15']")).click();
		    
		    driver.findElement(By.xpath("//span[@class='button p-color full-width start-planning']")).click();
		    
		    driver.findElement(By.xpath("//span[text()='(Edit home city)']")).click();
		    
		    driver.findElement(By.xpath("(//div[@class='form-control search']/input[@placeholder='Enter City'])[1]")).sendKeys("Delhi");
		    		
		    driver.findElement(By.xpath("//span[text()='Delhi, Delhi, India, Asia']")).click();
		    
		    driver.findElement(By.xpath("//i[@class='icon-arrow-right next-btn-dsk']")).click();
		    
		    driver.findElement(By.xpath("(//div[normalize-space(text())='Suggest an itinerary with'])[1]")).click();
		    
		    Thread.sleep(5000);
		    		
		    driver.findElement(By.xpath("//i[@class='icon-arrow-right next-btn-dsk']")).click();
		    
		    driver.findElement(By.xpath("//div[@class='entry-point family-ep']")).click();
		    Thread.sleep(5000);
		    
		    driver.findElement(By.xpath("//div[@class='no-of-adults']//span[@class='icon-plus']")).click();
		    
		    driver.findElement(By.xpath("//div[@class='no-of-kids']//span[@class='icon-plus']")).click();
		    
		    driver.findElement(By.xpath("//span[text()='0 Year']/parent::div/following-sibling::i")).click();
		    driver.findElement(By.xpath("//span[text()='1 Year']")).click();
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//i[@class='icon-arrow-right next-btn-dsk']")).click();
		    Thread.sleep(20000);
		    driver.findElement(By.xpath("//span[text()='Editable view']")).click();
		    
		    driver.findElement(By.xpath("//span[@class='button p-color calendar-add-activity']")).click();
		    driver.findElement(By.xpath("//div[text()='Grand palace']/parent::div/preceding-sibling::div//span[@class='add-to-plan']")).click();
		    driver.findElement(By.xpath("(//div[@class='day-box']/div[@class='date' and text()='20'])[1]")).click();
		    
		    driver.findElement(By.xpath("//div[@class='done-btn']/span[text()='Done']")).click();
		    driver.findElement(By.xpath("//span[@class='button p-size p-color save-to-plan']/i")).click();
		    driver.findElement(By.xpath("//span[text()='Save as Draft']")).click();
		    
		    driver.findElement(By.xpath("//input[@placeholder='Enter Email ID']")).sendKeys("minalborhade10@gmail.com");
		    driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Minu@@10");
		    
            driver.findElement(By.xpath("//span[text()='Log In']")).click();
		    
		    //driver.quit();
		    
	}
}
		  
		 
		
		
				
		

	



