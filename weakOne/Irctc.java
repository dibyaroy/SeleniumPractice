package weakOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Irctc {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElement(By.id("userRegistrationForm:userName")).sendKeys("Dibyo");
		
		driver.findElementById("userRegistrationForm:password").sendKeys("Hello@123");
		
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Hello@123");
		
		Select selectSecQuestion = new Select(driver.findElementById("userRegistrationForm:securityQ"));
		
		selectSecQuestion.selectByValue("0");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("yoyo");
		
		Select selectLanguage = new Select(driver.findElementById("userRegistrationForm:prelan"));
		
		selectLanguage.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Dibya");
		
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Jyoti");
		
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Roy");
		
		driver.findElementById("userRegistrationForm:gender:0").click();
		
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		Select selectDay = new Select(driver.findElementById("userRegistrationForm:dobDay"));
		
		selectDay.selectByIndex(5);
		
		Select selectMonth = new Select(driver.findElementById("userRegistrationForm:dobMonth"));
		
		selectMonth.selectByValue("10");
		
		Select selectYear = new Select(driver.findElementById("userRegistrationForm:dateOfBirth"));
		
		selectYear.selectByVisibleText("1989");
		
		Select selectOccupation = new Select(driver.findElementById("userRegistrationForm:occupation"));
		
		selectOccupation.selectByIndex(3);
		
		Select selectCountry = new Select(driver.findElementById("userRegistrationForm:countries"));
		
		selectCountry.selectByValue("94");
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("712601");
		
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys(Keys.TAB);
		
		
		Actions builder = new Actions(driver);
		
		//builder.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		
	//	builder.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		
		Select selectCity = new Select(driver.findElementById("userRegistrationForm:cityName"));
		
		selectCity.selectByIndex(1);
		
		Select selectPO = new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		
		selectPO.selectByIndex(1);
		
		driver.findElementById("userRegistrationForm:j_idt484").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
