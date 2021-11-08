package repositories;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class metalBookingMasters {
	 WebDriver driver;
  @Test
  public void f() throws Exception {
	 
	  
	  
		//to click on username
		  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[1]/input")).sendKeys("admin@crudbooster.com");
		  Thread.sleep(3000);
		  
		  //to click on password
		  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/input")).sendKeys("123456");
		  Thread.sleep(6000);
		  
		  //to click on sign in button
		  driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
		  Thread.sleep(3000);
		  
//		  //to click on metal master
//		  driver.findElement(By.xpath("//*[@id=\"app\"]/aside/section/div[2]/ul/li[5]/a/span")).click();
//		 Thread.sleep(3000);
//		  
//		  //to click on add data
//		 driver.findElement(By.xpath("//*[@id=\"btn_add_new_data\"]")).click();
//		 Thread.sleep(3000);
//		 
//		 //to click on metal name
//		 driver.findElement(By.name("metal_nm")).sendKeys("gold");
//		 Thread.sleep(3000);
//		 
//		 //to click on short name
//		 driver.findElement(By.name("metal_short_nm")).sendKeys("goldie");
//		 Thread.sleep(3000);
//		 
//		 //to click on enter rate in gm
//		 driver.findElement(By.id("enter_rate_gm")).sendKeys("50");
//		 Thread.sleep(3000);
//		 
//		 //to click on display rate in gm
//		 driver.findElement(By.name("display_rate_gm")).sendKeys("40");
//		 Thread.sleep(3000);
//		 
//		 //to click on min buy qtyin gm
//		 driver.findElement(By.id("min_qty_buy")).sendKeys("20");
//		 Thread.sleep(3000);
//		 
//		//to click on min sell qtyin gm
//		 driver.findElement(By.name("min_qty_sell")).sendKeys("10");
//		 Thread.sleep(3000);
//		 
//		 //to click on multiple buy qty
//		 driver.findElement(By.name("mult_buy_qty")).sendKeys("10");
//		 Thread.sleep(3000);
//		 
//		//to click on multiple sell qty
//		 driver.findElement(By.name("mult_sell_qty")).sendKeys("10");
//		 Thread.sleep(3000);
//		 
//		 //to click on purity
//		 driver.findElement(By.name("purity")).sendKeys("24bullion");
//		 Thread.sleep(3000);
//		 
//		 //to click on rate input
//		 driver.findElement(By.name("rate_input")).sendKeys("10");
//		 Thread.sleep(3000);
//		 
//		 //to click on rate source
//		 driver.findElement(By.id("rate_source")).sendKeys(" ");
//		 Thread.sleep(3000);
//		 
//		 
//		 //to click on remark
//		 driver.findElement(By.id("remark")).sendKeys("MetalBooking");
//		 Thread.sleep(3000);
//		 
//		 //to click on active status
////		 driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/form/div[1]/div[13]/div/div[1]/label/input")).click();
////		 Thread.sleep(3000);
//		 
//		 
//		 //to click on save button
//		 driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/form/div[2]/div/div/input[2]")).click();
//		 Thread.sleep(3000);
//		 
		 //To click on customer master
		 driver.findElement(By.xpath("//*[@id=\"app\"]/aside/section/div[2]/ul/li[6]/a/span")).click();
		 Thread.sleep(3000);
		 
		 //to click on add data
		 driver.findElement(By.xpath("//*[@id=\"btn_add_new_data\"]")).click();
		 Thread.sleep(3000);
		 
		 //to click on customer Type
		WebElement custType = driver.findElement(By.xpath("//*[@id=\"form-group-id\"]/div/span/span[1]/span/span[2]"));
		custType.click();
		Thread.sleep(3000);
		custType.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[2]")).click();
		Thread.sleep(3000);
		
		//to click on customer name
		 driver.findElement(By.name("customer_nm")).sendKeys("xyz",Keys.ENTER);
		 Thread.sleep(3000);
		 
		 //to click on primary email-id
		 driver.findElement(By.id("primary_email_id")).sendKeys("priyadup@gmail.com",Keys.ENTER);
		 Thread.sleep(3000);
	 
		 //to click on contact no
		 WebElement contact = driver.findElement(By.xpath("//*[@id=\"contact_no\"]"));
		 Actions as=new Actions(driver);
		 as.click(contact).sendKeys("9856326369").build().perform();
//		 contact.clear();
//		 contact.sendKeys("9856326369");
		 Thread.sleep(5000);
		
		 //to click on whatsapp no.
		 driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[2]/form/div[1]/div[5]/div/input")).sendKeys("9890890069",Keys.ENTER);
		 Thread.sleep(5000);
		 
		 //to click on contact person name
		 driver.findElement(By.name("contact_person_nm")).sendKeys("xyz",Keys.ENTER);
		 Thread.sleep(3000);
		 
		 //to click on address-1
		 driver.findElement(By.id("address1")).sendKeys("pune",Keys.ENTER);
		 Thread.sleep(3000);
		 
		//to click on address-2
		 driver.findElement(By.id("address2")).sendKeys("mumbai",Keys.ENTER);
		 Thread.sleep(3000);
		 
		
		 //to click on country
		 driver.findElement(By.id("/html/body/div[1]/div/section[2]/div/div/div[2]/form/div[1]/div[9]/div/span/span[1]/span/span[2]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"select2-country_id-result-pwbu-1\"]")).click();
		 Thread.sleep(3000);
		 
		 //to click on state
		 driver.findElement(By.xpath("//*[@id=\"form-group-state_id\"]/div/span/span[1]/span/span[2]/b")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id=\"select2-state_id-result-fhpu-1\"]")).click();
		 Thread.sleep(3000);
		 
		 //to click on city
		 driver.findElement(By.xpath("")).sendKeys("pune");
		 Thread.sleep(3000);
		 
		 //to click on area
		 driver.findElement(By.xpath("")).sendKeys("HP Petrol Pump");
		 Thread.sleep(3000);
		 
		 //to click on pincode
		 driver.findElement(By.xpath("")).sendKeys("411043");
		 Thread.sleep(3000);
		 
		 //to click on gst No
		 driver.findElement(By.xpath("")).sendKeys("10AABCU9603R1Z2");
		 Thread.sleep(3000);
		 
		 
		
		 
		 
		 
		 
  }
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Thread.sleep(5000);
	
	    //To load url
		driver.get("http://test.csjewellers.com:81/metal-booking/public/admin/login");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		  Thread.sleep(3000);
	  	 
 } 
}
