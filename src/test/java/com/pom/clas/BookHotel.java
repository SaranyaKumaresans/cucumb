package com.pom.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel {
public WebDriver driver;
	
	public BookHotel(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="first_name")
	private WebElement Fname;
	public WebElement getFname() {
		return Fname;
}
	@FindBy(id="last_name")
	private WebElement Lname;
	public WebElement getLname() {
		return Lname;
}
	@FindBy(id="address")
	private WebElement Add;
	public WebElement getAdd() {
		return Add;
	}
	
	@FindBy(id="cc_num")
	private WebElement Credit;
	public WebElement getCredit() {
		return Credit;
	}
	@FindBy(id="cc_type")
	private WebElement Ctype;
	public WebElement getCtype() {
		return Ctype;
	}
	@FindBy(id="cc_exp_month")
	private WebElement Month;
	public WebElement getMonth() {
		return Month;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement Year;
	public WebElement getYear() {
		return Year;
	
	}
	
	@FindBy(id="cc_cvv")
	private WebElement Cvv;
	public WebElement getCvv() {
		return Cvv;
	
	
	}
	
	@FindBy(id="book_now")
	private WebElement Book;
	public WebElement getBook() {
		return Book;
	
	
	
	}	



}
