package pageobjectmodel;



import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class EditApplication_POM extends Baseclass{
	
	public EditApplication_POM() {
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication;
	
	@FindBy(xpath ="//select[@id='MainContent_drpVehicleType']")
	public WebElement eSelectVehicle;
	
	@FindBy(xpath ="//select[@id='MainContent_drpMake']")
	public WebElement eSelectMake;
	
	@FindBy(xpath ="//select[@id='drpModel']")
	public WebElement eSelectModel;
	
	@FindBy(xpath ="//input[@id='MainContent_imgbtnsearch']")
	public WebElement eSearchButton;
	
	@FindBy(xpath ="//select[@id='MainContent_ddlFilter']")
	public WebElement eSelectFilter;
	
	@FindBy(xpath ="//input[@id='MainContent_txtFind']")
	public WebElement eSelectsearchbox;
	
	@FindBy(xpath ="//input[@id='MainContent_btnFilterSearch']")
	public WebElement eSearchButton2;
	
	@FindBy(xpath ="//input[@id='MainContent_GVData_imgEdit_0']")
	public WebElement eEditButton;
	
	@FindBy(id ="MainContent_txtcc")
	public WebElement eCc;
	
	@FindBy(xpath ="//input[@id='MainContent_btnupdate']")
	public WebElement eUpdateButton;
	
	public void ClickApplication() throws InterruptedException {
		eApplication.click();
		Thread.sleep(3000);
	}
	

	public void ChooseVehicle(String EnterVehicleName) throws InterruptedException {
		
		Select vehicle = new Select(eSelectVehicle);
		vehicle.selectByVisibleText(EnterVehicleName);
		Thread.sleep(5000);
	
		}

	public void ChooseMake(String EnterMakeName ) throws InterruptedException {
	 
		Select make = new Select(eSelectMake);
		make.selectByVisibleText(EnterMakeName);
		Thread.sleep(5000);
		
		}
 
	public void ChooseModel(String EnterModelName ) throws InterruptedException {
		
		Select model = new Select(eSelectModel);
		model.selectByVisibleText(EnterModelName);
		Thread.sleep(3000);
		
		}
	public void Clicksearch() throws InterruptedException {
		eSearchButton.click();
		Thread.sleep(3000);
		}

	public void SelectFiterdropdown(String SelectFilterName) throws InterruptedException {
		
		Select Filer = new Select(eSelectFilter);
		Filer.selectByVisibleText(SelectFilterName);
		Thread.sleep(3000);
	
		}
	public void SelectsearchTextbox(String SearchText) throws InterruptedException {
		eSelectsearchbox.sendKeys(SearchText);
		Thread.sleep(3000);
		
	}
	public void Clicksearch2() throws InterruptedException {
		eSearchButton2.click();
		Thread.sleep(3000);
		}
	public void ClickEdit() throws InterruptedException {
		eEditButton.click();
		Thread.sleep(3000);
		}
	public void EditCc(String EditCcvalue) throws InterruptedException {
		eCc.clear();
		Thread.sleep(3000);
		
		eCc.sendKeys(EditCcvalue);
		
	}
	public void ClickUpdate() throws InterruptedException {
		eUpdateButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		}

}


