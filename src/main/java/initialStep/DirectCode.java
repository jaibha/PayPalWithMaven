package initialStep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectCode {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.paypal.com/in/home");
		
		driver.findElementById("signup-button").click();
		
		boolean selected = driver.findElementById("radio-personal").isSelected();
		if(selected)
		{
			System.out.println("radio is selected");
		}
		else {
			System.out.println("radio not selected");
		}
		
		driver.findElement(By.linkText("Next")).click();
		
		
		WebElement country = driver.findElement(By.id("country"));
		
		
	}

}
