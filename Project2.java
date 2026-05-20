package simplepro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Project2 {
	
	WebDriver driver;
        @Test
	  public void login()
	  
	  {
		  //  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

          
		        driver = new ChromeDriver();

		        driver.manage().window().maximize();

		        driver.manage().timeouts()
		              .implicitlyWait(Duration.ofSeconds(10));

		        driver.get("https://opensource-demo.orangehrmlive.com/");
		        
		        System.out.println("Browser is launched successfully");

		        // Login
		        driver.findElement(By.name("username")).sendKeys("Admin");

		        driver.findElement(By.name("password")).sendKeys("admin123");

		        driver.findElement(By.className("oxd-button")).click();
		        System.out.println("login the page ");
		        
	  }	
		        
		      
}
