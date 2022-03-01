package dipak.navale;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class YahooMail {

	@Test
	public void yahoomail () {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHREYA\\Downloads\\selenium\\chromedriver\\chromedriver.exe");
	    //ChromeDriver driver= new ChromeDriver();
	    System.setProperty("webdriver.edge.driver", "C:\\Users\\SHREYA\\Downloads\\selenium\\edgedriver\\msedgedriver.exe");
	     EdgeDriver driver =new EdgeDriver();
	    driver.get("https://login.yahoo.com/manage_account?.intl=in&.lang=en-IN&pspid=2114723002&activity=header-signin&src=search&signin=true&done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&eid=100");
	    
	    driver.findElement(By.id("login-username")).sendKeys("dipaknavale57@yahoo.com");
	    
	   
	    driver.findElement(By.name("signin")).click();
	
	    driver.findElement(By.name("password")).sendKeys("Tejaswini@143");
	    driver.findElement(By.id("login-signin")).click();
	   

	   
	    
//	    By logout2=By.id("gb_71");
//	    WebElement logout1= driver.findElement(logout2);
//	    logout1.click();

	    driver.close();
	    
	}

}
