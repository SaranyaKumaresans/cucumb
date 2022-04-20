package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.clas.BookHotel;
import com.pom.clas.Login_Adactin;
import com.pom.clas.Logout;
import com.pom.clas.SearchHotels;
import com.pom.clas.SelectHotel;

public class PageObject_Manager {

	private static WebDriver driver;
	private Login_Adactin la;

	public PageObject_Manager(WebDriver driver1) {
		PageObject_Manager.driver = driver1;
	}

	public Login_Adactin getInstanceLogin() {
		la = new Login_Adactin(driver);
		return la;

	}

	private SearchHotels search;

	public SearchHotels getsearch() {
		search = new SearchHotels(driver);
		return search;
	}

	private SelectHotel select;

	public SelectHotel getselect() {
		select = new SelectHotel(driver);
		return select;
	}

	private BookHotel hotel;

	public BookHotel gethotel() {
		hotel = new BookHotel(driver);
		return hotel;

	}

	private Logout logout;

	public Logout getlogout() {
		logout = new Logout(driver);
		return logout;
	}

}
