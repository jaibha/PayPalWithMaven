package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SignUp extends ProjectMethods{

	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="signup-button")
	WebElement signUpButton;
	
	public AccountSelection clickSignUp() {
		click(signUpButton);
		return new AccountSelection();
	}
	
	
	
	
	
	
	
}
