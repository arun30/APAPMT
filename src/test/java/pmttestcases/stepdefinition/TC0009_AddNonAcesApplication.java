package pmttestcases.stepdefinition;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.ApplicationAddNonAces_POM;
import utility.Baseclass;


public class TC0009_AddNonAcesApplication extends Baseclass {
	
	ApplicationAddNonAces_POM anpom;
		
	
	
	@Given("^User will click on Application and Click add button$")
	public void user_will_click_on_Application_and_Click_add_button() throws Throwable {
		 try {
			 
			anpom = new ApplicationAddNonAces_POM();
			 anpom.ClickApplication();
			 anpom.ClickAddApplication();
			 
		} catch (Exception e) {
			System.out.println("Application or Application Add is not click"+e.getMessage());
		}
	    
	}

	@When("^User will select dropdown and Choose Vehicle, Make & Model$")
	public void user_will_select_dropdown_and_Choose_Vehicle_Make_Model() throws Throwable {
		try {
			anpom.ChooseVehicle(pro.getProperty("EnterVehicleName"));
			
			anpom.ChooseMake(pro.getProperty("EnterMakeName"));
			
			anpom.ChooseModel(pro.getProperty("EnterModelName"));
			
		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected"+e.getMessage());
		}
	    
	}

	@When("^User will Enter year$")
	public void user_will_Enter_year() throws Throwable {
		try {
			anpom.ApplicationYear(pro.getProperty("EnterYear"));
			
		} catch (Exception e) {
			System.out.println("Year Not Entered"+e.getMessage());
		}
	    
	}

	@Then("^User will click non Aces Engine Radio Button$")
	public void user_will_click_non_Aces_Engine_Radio_Button() throws Throwable {
		try {
			anpom.checkNonAces();
			
		} catch (Exception e) {
			System.out.println("NonAces Engine Radio Button Not checked"+e.getMessage());
		}
	}

	@Then("^User will Enter NonAces Engine Base details$")
	public void user_will_Enter_Engine_Base_details() throws Throwable {
		try {
			anpom.EngineDetails(pro.getProperty("Cylindervalue"), pro.getProperty("Ccvalue"), pro.getProperty("litervalue"));
			
			
		} catch (Exception e) {
			System.out.println("Engine Base Details Not Entered"+e.getMessage());
		}
	   
	}

	@Then("^User will successfully added and verify that record has come$")
	public void user_will_successfully_added_and_verify_that_record_has_come() throws Throwable {
		try {
			anpom.Clicksave();
			
			anpom.acceptAlert();
			
		} catch (Exception e) {
			System.out.println("NonAces Application Not Added"+e.getMessage());
		}
	   
	}
	

}


