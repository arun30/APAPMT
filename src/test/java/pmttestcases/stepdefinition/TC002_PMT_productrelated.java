package pmttestcases.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.Masterproductrelated_POM;
import utility.Baseclass;

public class TC002_PMT_productrelated extends Baseclass {

	
	Masterproductrelated_POM mpom;
	
	
	  /*@Before() 
	  public void login_initialize() throws InterruptedException {
	  
		  Baseclass.browserlaunch(); 
		  Baseclass.logindetails(); 
		  Thread.sleep(5000);
	  
	  }*/
	 
	
	
	@Given("^User will mouse hover and choose the product category page$")
	public void user_will_mouse_hover_and_choose_the_product_category_page() throws Throwable {
	   
		
		mpom = new Masterproductrelated_POM();
			
		 mpom.clickonproductcategory();
		
	}

	@When("^User will click on the add button and add a new category$")
	public void user_will_click_on_the_add_button_and_add_a_new_category() throws Throwable {
	  
		
		mpom.addcategory1();
	}

	@And("^User will enter the category name and choose the equivalent PIES category$")
	public void user_will_enter_the_category_name_and_choose_the_equivalent_PIES_category() throws Throwable {
	 
		
		mpom.entrycategory(pro.getProperty("categoryname"));
		mpom.savingcategory();
		Thread.sleep(3000);
		mpom.acceptAlert();
	}

	@Then("^User will successfully added and verify that the record has come$")
	public void user_will_successfully_added_and_verify_that_the_record_has_come() throws Throwable {
	   
		
		//mpom.verifyingtext(pro.getProperty("categoryname"));
	    System.out.println("category successfully added");
	}

	
	
	@Given("^User will go to master and choose product sub category$")
	public void user_will_go_to_master_and_choose_product_sub_category() throws Throwable {
	   
		mpom = new Masterproductrelated_POM();
		mpom.clicksubcategory();
	}

	@When("^User will click on the add button and choose the category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_drop_down_list() throws Throwable {
	    
		mpom.addcategory1();
		mpom.addsubcategory();
	}

	@And("^User will enter the sub category name  and choose the equivalent and save button is clicked$")
	public void user_will_enter_the_sub_category_name_and_choose_the_equivalent_and_save_button_is_clicked() throws Throwable {
	  
		mpom.entrysubcategory(pro.getProperty("subcategoryname"));
		mpom.savingcategory();
	}

	@Then("^User will successfully added and verify the record has come$")
	public void user_will_successfully_added_and_verify_the_record_has_come() throws Throwable {
	  
		mpom.acceptAlertsub();
		System.out.println("subcategory Successfully Added");
	}

	
	
	@Given("^User will go to master and choose part description$")
	public void user_will_go_to_master_and_choose_part_description() throws Throwable {
	    
		mpom = new Masterproductrelated_POM();
		mpom.partdesc1();
	}

	@When("^User will click on the add button and choose the category & sub category drop down list$")
	public void user_will_click_on_the_add_button_and_choose_the_category_sub_category_drop_down_list() throws Throwable {
	  
		mpom.addcategory1();
		mpom.addsubcategory(); //category choose
		mpom.categoryselect(); //subcategory select
		mpom.entrypartdesc(pro.getProperty("partdesc"));
		mpom.equivalentpartdesc();
		
	}

	@And("^User will enter the part description name  and save button is clicked$")
	public void user_will_enter_the_part_description_name_and_save_button_is_clicked() throws Throwable {
	   
		
		mpom.savingpartdesc();
	}

	@Then("^User will see successfully added and verify the record has come$")
	public void user_will_see_successfully_added_and_verify_the_record_has_come() throws Throwable {
	   
		mpom.acceptAlertdesc();
		System.out.println("Successfully Added");
	}

	@Given("^User will go to master and choose product line$")
	public void user_will_go_to_master_and_choose_product_line() throws Throwable {
	    
		mpom = new Masterproductrelated_POM();
		mpom.clickonproductlinecode();
	}

	@When("^User will click on add button and enter the line code and line name$")
	public void user_will_click_on_add_button_and_enter_the_line_code_and_line_name() throws Throwable {
	   
		mpom.addcategory1();
		mpom.addproductline(pro.getProperty("productline"), pro.getProperty("linename"));
		mpom.savebtn();
	}

	@Then("^User will see successfully alert and verify the record has come in the grid$")
	public void user_will_see_successfully_alert_and_verify_the_record_has_come_in_the_grid() throws Throwable {
	    
		mpom.acceptAlertline();
	}
	
	
	
	
	/*
	 * @After public void quit_initialize() { Baseclass.teardown(); }
	 */
	
}
