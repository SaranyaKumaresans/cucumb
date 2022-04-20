package com.revsteps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.helper.PageObject_Manager;

import cucumber.Adactin_Project_9AM.Cucumber_Base1;

import com.helper.Filereader_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defns extends Cucumber_Base1 {
	WebDriver driver;
	PageObject_Manager pom = new PageObject_Manager(driver);

	@Given("User Launches the Chrome browser")
	public void user_launches_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","D:\\TRB\\Adactin_Project_9AM\\Driver1\\chromedriver.exe");
		System.getProperty("user.dir");
		driver=new ChromeDriver();
	}

	@When("User opens Url")
	public void user_opens_url() {

		driver.get("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters username")
	public void user_enters_username() throws Throwable {

		inputElements(pom.getInstanceLogin().getUsernam(),
				Filereader_Manager.getInstance().getInstanceCR().getUsername());
	}

	@When("user enters password")
	public void user_enters_password() throws Throwable {

		inputElements(pom.getInstanceLogin().getlogin(),
				Filereader_Manager.getInstance().getInstanceCR().getPassword());
	}

	@Then("user clicks Login and successfully logged")
	public void user_clicks_login_and_successfully_logged() {

		click(pom.getInstanceLogin().getlogin());
	}

	@Given("adactin group of hotels search hotel form")
	public void adactin_group_of_hotels_search_hotel_form() {
		System.out.println("search hotel form");
	}

	@When("user select the desired location and the name of the hotel")
	public void user_select_the_desired_location_and_the_name_of_the_hotel() {

		selectInd(pom.getsearch().getLocation(), 4);
		selectValue(pom.getsearch().getHotels(), "Hotel Hervey");
	}

	@When("user select the type of room and the number of rooms")
	public void user_select_the_type_of_room_and_the_number_of_rooms() {
		selectValue(pom.getsearch().getRoomtype(), "Super Deluxe");
		selectValue(pom.getsearch().getRoomno(), "2");

	}

	@When("user enter the check in date and check out date")
	public void user_enter_the_check_in_date_and_check_out_date() throws InterruptedException {
		clear(pom.getsearch().getDatein());
		inputElements(pom.getsearch().getDatein(), "09/03/2022");
		Thread.sleep(2000);
		inputElements(pom.getsearch().getDateout(), "11/03/2022");
	}

	@When("user select the number of adults and children")
	public void user_select_the_number_of_adults_and_children() {
		selectValue(pom.getsearch().getAroom(), "2");
		selectValue(pom.getsearch().geCroom(), "1");
	}

	@When("user click the search button")
	public void user_click_the_search_button() {
		click(pom.getsearch().getSubmt());

	}

	@Then("user get the available hotels")
	public void user_get_the_available_hotels() {
		System.out.println("available hotels");
	}

	@Given("user has the selects hotel form")
	public void user_has_the_selects_hotel_form() {
		System.out.println("select");
	}

	@When("user select the desired hotel")
	public void user_select_the_desired_hotel() {
		click(pom.getselect().getSelect());

	}

	@When("user click on the continue button")
	public void user_click_on_the_continue_button() {
		click(pom.getselect().getCont());
	}

	@Then("user succesfully selected the available hotels")
	public void user_succesfully_selected_the_available_hotels() {
		System.out.println("successfully selected");
	}

	@Given("user has the book a hotel form")
	public void user_has_the_book_a_hotel_form() {
		System.out.println("booked form");
	}

	@When("user enter the first name and last name")
	public void user_enter_the_first_name_and_last_name() {
		inputElements(pom.gethotel().getFname(), "Saranya");

		inputElements(pom.gethotel().getLname(), "Samraj");
	}

	@When("user enter the Billing address and valid credit card number")
	public void user_enter_the_billing_address_and_valid_credit_card_number() throws Throwable {
		inputElements(pom.gethotel().getAdd(), "newpet,krishnagri");

		inputElements(pom.gethotel().getCredit(), Filereader_Manager.getInstance().getInstanceCR().getcreditCardNo());
	}

	@When("user select the credid card type and month and year of expiry date")
	public void user_select_the_credid_card_type_and_month_and_year_of_expiry_date() {
		selectInd(pom.gethotel().getCtype(),2);

		selectInd(pom.gethotel().getMonth(),2);

		selectInd(pom.gethotel().getYear(),3);

	}

	@When("user enter the cvv number")
	public void user_enter_the_cvv_number() throws Throwable {
		inputElements(pom.gethotel().getCvv(), Filereader_Manager.getInstance().getInstanceCR().getCvv());
	}

	@Then("click on the book now option and the hotel is booked successfull")
	public void click_on_the_book_now_option_and_the_hotel_is_booked_successfull() {
		click(pom.gethotel().getBook());
		System.out.println("The hotel is successfully booked");
	}
}

	