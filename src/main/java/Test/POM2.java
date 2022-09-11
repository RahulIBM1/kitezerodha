package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 {

//Declaration
		@FindBy(xpath="//input[@id='pin']")private WebElement PIN;
		@FindBy(xpath="//button[@class='button-orange wide']")private WebElement cntBtn;
		
		
//Initialization
	public POM2 (WebDriver driver) {
			PageFactory.initElements(driver,this);
	}
//utilization
	public void enterPIN(String pinvalue) {
			PIN.sendKeys(pinvalue);
	}
	public void clickcntBtn() {
			cntBtn.click();
	}
}
