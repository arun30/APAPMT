Feature: PMT Add Product List
Description: User will add Application related like vehicle, make & model


Scenario: Adding Aces Applicarion
	Given User will click on the Application and Click add button
	When User will select the dropdown and Choose Vehicle, Make & Model
	And User will Enter the year
	Then User will click Aces Engine Radio Button
	And User will Select Engine Base in dropdown
	Then User will successfully added and verify that the record has come
	
@SanityTest
	Scenario: Adding NonAces Applicarion
	Given User will click on Application and Click add button
	When User will select dropdown and Choose Vehicle, Make & Model
	And User will Enter year
	Then User will click non Aces Engine Radio Button
	And User will Enter NonAces Engine Base details
	Then User will successfully added and verify that record has come
	
@SanityTest	
	Scenario: Editing Applicarion
	Given User will click on Application page
	When User will select dropdown to Choose Vehicle, Make & Model and Click search
	And User will selectfilter Engine Base and enter search value and search
	Then User will Click edit and change CC
	And User will click Update successfully and verify that the record has come