package Testng.Amaz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	 public String baseUrl = "https://www.amazon.in/";
	 String driverPath = "C:\\Users\\mohammadp\\Desktop\\Drivers\\chromedriver.exe";
	 String Webdriver = "webdriver.chrome.driver";
	 public WebDriver driver ;
	 
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty(Webdriver, driverPath);
		  driver = new ChromeDriver();
	  }
	  @Test(priority = 1 )
	  public void Open() throws Exception {
		  System.out.println("Running new test java");
		  driver.get(baseUrl);
		  driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl()); 
	  	  	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphones");
		 
		
			  driver.findElement(By.className("nav-input")).click();
	      
	  }
	@Test(priority = 2 )
	  public void Buy() throws InterruptedException {
		  driver.findElement(By.linkText("Apple iPhone X (Silver, 64GB)")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("submit.buy-now")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("createAccountSubmit")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("ap_customer_name")).sendKeys("Prem");
		  Thread.sleep(1000);
		  driver.findElement(By.id("ap_phone_number")).sendKeys("9854754256");
		  Thread.sleep(1000);
		  driver.findElement(By.id("ap_email")).sendKeys("Prem45@gmail.com");
		  Thread.sleep(1000);
		  driver.findElement(By.id("ap_password")).sendKeys("Prem123");
		  Thread.sleep(1000);
		  driver.findElement(By.id("continue")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.cssSelector("i[class='a-icon a-icon-logo']")).click();
	  } 
	  
	 @Test(priority = 3)
	  public void Find_Elements() {
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("da vinci books");
		  driver.findElement(By.className("nav-input")).click();
		 
		  List<WebElement> ty = driver.findElements(By.tagName("span"));
		  for(WebElement tr : ty ) {
			 System.out.println(tr.getText());	  
		  }
	  }
		 


	  @AfterTest
	  public void afterTest(){
	  driver.close();
	  }

	}
