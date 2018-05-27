package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateAccount extends ProjectMethods{
	
	
	public CreateAccount() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="country")
	WebElement clickDropDown;
	
	public CreateAccount clickDropDown(String data) {
	selectDropDownUsingText(clickDropDown,data);
		return this;
	}
	
	
}
