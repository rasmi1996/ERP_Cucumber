package stepDefination;

import commonFunctions.FunctionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinations extends FunctionLibrary
{
	@Given("Launch Browser")
	public void launch_browser() throws Throwable {
	    driver=FunctionLibrary.startBrowser();
	}

	@When("Launch Url")
	public void launch_url() {
		FunctionLibrary.openUrl();
	}

	@When("Wait for Username with {string} and {string}")
	public void wait_for_username_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String LocatorType, String LocatorValue, String TestData){
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String LocatorType, String LocatorValue, String TestData) throws Throwable  {
		Thread.sleep(2000);
		FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}

	@When("Click login button with {string} and {string}")
	public void click_login_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("wait for logout link with {string} and {string}")
	public void wait_for_logout_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "30");
	}
	@When("wait for stock items link with {string} and {string}")
	public void wait_for_stock_items_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("Click stock items link with {string} and {string}")
	public void click_stock_items_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Wait for Add icon button with {string} and {string}")
	public void wait_for_add_icon_button_with_xpath_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("Wait for Category with {string} and {string}")
	public void wait_for_category_with_and(String LocatorType, String LocatorValue) throws Throwable
	{
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}
	@When("select Category with {string} and {string}")
	public void select_category_with_and(String LocatorType, String LocatorValue) throws Throwable {
	    FunctionLibrary.dropDownAction(LocatorType, LocatorValue, "1");
	}
	@When("Select Supplier Number with  {string} and {string}")
	public void select_supplier_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, "1");
	}
	@When("capture stock number with  {string} and {string}")
	public void capture_stock_number_with_and(String LocatorType, String LocatorValue) throws Throwable {
		FunctionLibrary.captureStock(LocatorType, LocatorValue);
	}
	@When("select Unit Of Measurement  with {string} and {string}")
	public void select_unit_of_measurement_with_and(String LocatorType, String LocatorValue) throws Throwable  {
		FunctionLibrary.dropDownAction(LocatorType, LocatorValue, "1");
	}
	@When("Click Add button with {string} and {string}")
	public void click_add_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Verify Stock number")
	public void verify_stock_number() throws Throwable {
	  FunctionLibrary.stockTable();
	}

	@When("Wait for Supplier link with {string} and {string}")
	public void wait_for_Supplier_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click Supplier link with {string} and {string}")
	public void click_Supplier_link_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for Add icon with {string} and {string}")
	public void wait_for_Add_icon_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click Add icon button with {string} and {string}")
	public void click_Add_icon_button_with_and(String LocatorType, String LocatorValue) {
	    FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for Supplier Number with {string} and {string}")
	public void wait_for_Supplier_Number_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Capture Supplier Number with {string} and {string}")
	public void capture_Supplier_Number_with_and(String LocatorType, String LocatorValue) throws Throwable  {
	   FunctionLibrary.captureSup(LocatorType, LocatorValue);
	}

	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String LocatorType, String LocatorValue)  {
	   FunctionLibrary.typeAction(LocatorType, LocatorValue, TestData);
	}
	@When("click add button with {string} and {string}")
	public void click_add_button_wit_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	
	@When("Wait for Confirm ok button with {string} and {string}")
	public void wait_for_Confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click confirm ok button with {string} and {string}")
	public void click_confirm_ok_button_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for alert ok button with {string} and {string}")
	public void wait_for_alert_ok_button_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click Alert ok button with {string} and {string}")
	public void click_Alert_ok_button_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Verify Supplier Number")
	public void verify_Supplier_Number() throws Throwable  {
		Thread.sleep(3000);
	    FunctionLibrary.supplierTable();
	}

	@When("click logout with {string} and {string}")
	public void click_logout_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}
	@When("Wait for Customer link with {string} and {string}")
	public void wait_for_Customer_link_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Click customer link with {string} and {string}")
	public void click_customer_link_with_and(String LocatorType, String LocatorValue) {
	   FunctionLibrary.clickAction(LocatorType, LocatorValue);
	}

	@When("Wait for customer Number with {string} and {string}")
	public void wait_for_customer_Number_with_and(String LocatorType, String LocatorValue) {
		FunctionLibrary.waitForElement(LocatorType, LocatorValue, "10");
	}

	@When("Capture Customer Number with {string} and {string}")
	public void capture_Customer_Number_with_and(String LocatorType, String LocatorValue) throws Throwable  {
	   FunctionLibrary.captureCus(LocatorType, LocatorValue);
	}

	@When("Verify Customer Number")
	public void verify_Customer_Number() throws Throwable {
		Thread.sleep(3000);
	   FunctionLibrary.customerTable();
	}
	@When("Close Browser")
	public void close_Browser() {
	   FunctionLibrary.closeBrowser();
	}
	
}


	