package weakOne;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DisplayOptionNamesFromDropdown {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement dropd =  driver.findElement(By.id("userRegistrationForm:securityQ"));
		
		Select question = new Select(dropd);
		
		List<WebElement> myList = question.getOptions();
		
		//List myList = question.getAllSelectedOptions();
		
		for (WebElement webElement : myList) {
			
			if(!webElement.getText().contains("Select"))
			{System.out.println(webElement.getText());}
		}
		
		
		
		
		

	}

}
