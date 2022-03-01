package dipak.navale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {

	@Test
	public  void radbutton() {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
//		driver.findElement(By.xpath(
//				"//div[@class='custom-control custom-radio custom-control-inline']/label[@for='impressiveRadio']"))
//				.click();
		boolean flag1 = driver.findElement(By.xpath(
				"//div[@class='custom-control custom-radio custom-control-inline']/label[@for='impressiveRadio']"))
				.isSelected();
		System.out.println("radio button is selected="+flag1);
		WebElement yess=driver.findElement(By.xpath("//div[@class='custom-control custom-radio custom-control-inline']/label[@for='yesRadio']"));
		     yess.click();
		     WebElement flag = driver.findElement(By.id("noRadio"));
				System.out.println("radio button is enabled="+flag.isEnabled());
	;
		System.out.println("radio button is selected="+yess.isSelected());
//		System.out.println("radio button is selected="+flag1);
		
		System.out.println("radio button is diplayed="+flag.isDisplayed());

	}

}
