package pmttestcases.stepdefinition;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.EditApplication_POM;
import utility.Baseclass;

public class TC0010_EditApplication extends Baseclass {

	EditApplication_POM eapom;
	
	
	@Given("^User will click on Application page$")
	public void user_will_click_on_Application_page() throws Throwable {
		try {
			eapom = new EditApplication_POM();
			eapom.ClickApplication();
			
		} catch (Exception e) {
			System.out.println("Application page is not click"+e.getMessage());
		}
	   
	}

	@When("^User will select dropdown to Choose Vehicle, Make & Model and Click search$")
	public void user_will_select_dropdown_to_Choose_Vehicle_Make_Model_and_Click_search() throws Throwable {
		try {
			eapom.ChooseVehicle(pro.getProperty("EnterVehicleName"));
			
			eapom.ChooseMake(pro.getProperty("EnterMakeName"));
			
			eapom.ChooseModel(pro.getProperty("EnterModelName"));
			
			eapom.Clicksearch();
			
		} catch (Exception e) {
			System.out.println("Vehicle, Make & Model dropdown not selected"+e.getMessage());
		}
		
	}

	@When("^User will selectfilter Engine Base and enter search value and search$")
	public void user_will_selectfilter_Engine_Base_and_enter_search_value_and_search() throws Throwable {
		try {
			eapom.SelectFiterdropdown(pro.getProperty("SelectFilterName"));
			
			eapom.SelectsearchTextbox(pro.getProperty("SearchText"));
			eapom.Clicksearch2();
			
		} catch (Exception e) {
			System.out.println("Engine Base or search value not passed"+e.getMessage());
		}
		
	   
	}

	@Then("^User will Click edit and change CC$")
	public void user_will_Click_edit_and_change_CC() throws Throwable {
		try {
			eapom.ClickEdit();
			
			eapom.EditCc(pro.getProperty("EditCcvalue"));
			
		} catch (Exception e) {
			System.out.println(" edit Not Clicked or Edit text not passed"+e.getMessage());
		}
		
		
	    
	}

	@Then("^User will click Update successfully and verify that the record has come$")
	public void user_will_click_Update_successfully_and_verify_that_the_record_has_come() throws Throwable {
		try {
			eapom.ClickUpdate();
			
			eapom.acceptAlert();
		} catch (Exception e) {
			System.out.println("Not Edited Successfully"+e.getMessage());
		}
	   
	}
	
}

