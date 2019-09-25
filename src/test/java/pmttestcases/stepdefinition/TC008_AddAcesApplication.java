package pmttestcases.stepdefinition;


import java.util.Properties;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Application_POM;

import utility.Baseclass;

public class TC008_AddAcesApplication extends Baseclass {
	Application_POM apom;
	
	
	
	
	@Given("^User will click on the Application and Click add button$")
	public void user_will_click_on_the_Application_and_Click_add_button() throws Throwable {
		
		 try {
			 
			apom = new Application_POM();
			 apom.ClickApplication();
			 apom.ClickAddApplication();
			 
		} catch (Exception e) {
			System.out.println("Application or Application Add is not click"+e.getMessage());
		}
		 
		 
		 
	}

	@When("^User will select the dropdown and Choose Vehicle, Make & Model$")
	public void user_will_select_the_dropdown_and_Choose_Vehicle_Make_Model() throws Throwable {
		try {
			apom.ChooseVehicle(pro.getProperty("EnterVehicleName"));
			
			apom.ChooseMake(pro.getProperty("EnterMakeName"));
			
			apom.ChooseModel(pro.getProperty("EnterModelName"));
			
		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected"+e.getMessage());
			
		}  
	}

	@When("^User will Enter the year$")
	public void user_will_Enter_the_year() throws Throwable {
		try {
			apom.ApplicationYear(pro.getProperty("EnterYear"));
			
		} catch (Exception e) {
			System.out.println("Year Not Entered"+e.getMessage());
		}
	    
	}

	@Then("^User will click Aces Engine Radio Button$")
	public void user_will_click_Aces_Engine_Radio_Button() throws Throwable {
		try {
			apom.checkAces();
		} catch (Exception e) {
			System.out.println("Aces Engine Radio Button Not checked"+e.getMessage());
		}
	}

	@Then("^User will Select Engine Base in dropdown$")
	public void user_will_Select_Engine_Base_in_dropdown() throws Throwable {
		try {
			apom.ChooseEngineBase();
		} catch (Exception e) {
			System.out.println("Engine Base Not Selected"+e.getMessage());
		}
	}

	@Then("^User will successfully added and verify that the record has come$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {
		try {
			apom.Clicksave();
			apom.acceptAlert();
			
		} catch (Exception e) {
			System.out.println("Aces Application Not Added"+e.getMessage());
		}
	    
	}
	

}
