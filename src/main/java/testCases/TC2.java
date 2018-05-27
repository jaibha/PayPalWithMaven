package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SignUp;
import wdMethods.ProjectMethods;

public class TC2 extends ProjectMethods {

	@BeforeTest
	public void setData() {
		testCaseName="TC001";
		testDescription="login and select country in paypal";
		testNodes="Leads";
		category="Smoke";
		authors="jaya";
		browserName="chrome";
		dataSheetName="TC004";
	}

	@Test(dataProvider="fetchData")
	public void loginPaypal(String country) {

		new SignUp().clickSignUp().radioButton().clickNext().clickDropDown(country);		
	}

}
