package pageobjectmodel;


import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utility.Baseclass;



public class ApplicationAddNonAces_POM  extends Baseclass{
	
	
	public ApplicationAddNonAces_POM() {
		PageFactory.initElements(driver, this);
		
		}
	
	@FindBy(xpath = "//a[@id='ucMenu_rptLevel1_lnkLink1_1']")
	@CacheLookup
	public WebElement eApplication;
	
	@FindBy(xpath ="//button[@id='MainContent_btnAdd']")
	public WebElement eAddApplication;
	
	@FindBy(xpath ="//select[@id='MainContent_drpVehicleTypeAdd']")
	public WebElement eSelectVehicle;
	
	@FindBy(xpath ="//select[@id='MainContent_drpMakeAdd']")
	public WebElement eSelectMake;
	
	@FindBy(xpath ="//select[@id='MainContent_drpModelAdd']")
	public WebElement eSelectModel;
	
	@FindBy(xpath ="//input[@id='MainContent_txtYear']")
	public WebElement eYear;
	
	@FindBy(xpath ="//input[@id='MainContent_rblist_1']")
	public WebElement eNonAces;
	
	@FindBy(id ="MainContent_txtcylinders")
	public WebElement eCylinder;
	
	@FindBy(id ="MainContent_txtcc")
	public WebElement eCc;
	
	@FindBy(id ="MainContent_txtliter")
	public WebElement eLiter;
	
	@FindBy(xpath ="//input[@id='MainContent_btnSave']")
	public WebElement eSaveButton;
	
	public void ClickApplication() {
		eApplication.click();
	}

	public void ClickAddApplication() throws InterruptedException {
		eAddApplication.click();
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
	public void ApplicationYear(String EnterYear) throws InterruptedException {
		eYear.sendKeys(EnterYear);
		Thread.sleep(3000);
		}
	public void checkNonAces() throws InterruptedException {
		eNonAces.click();
		Thread.sleep(3000);
	}
	public void EngineDetails(String Cylindervalue, String Ccvalue,String litervalue ) throws InterruptedException {
		eCylinder.sendKeys(Cylindervalue);
		
		eCc.sendKeys(Ccvalue);
		eLiter.sendKeys(litervalue);
		Thread.sleep(3000);
	}
	public void Clicksave() throws InterruptedException {
		eSaveButton.click();
		Thread.sleep(3000);
		}
	public void acceptAlert() throws InterruptedException{
		Alert alert = driver.switchTo().alert();
		System.out.println("Acess: " + alert.getText());
		alert.accept();
		}
	
	
}



