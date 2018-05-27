package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountSelection extends ProjectMethods{
	
	public AccountSelection() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="radio-personal")
	WebElement radio;
	@FindBy(how=How.LINK_TEXT,using="Next")
	WebElement clickNext;
	
	public AccountSelection radioButton() {
		verifySelected(radio);
		
		return this;
	}
	
	public CreateAccount clickNext() {
		click(clickNext);
		return new CreateAccount();
	}
	
}
