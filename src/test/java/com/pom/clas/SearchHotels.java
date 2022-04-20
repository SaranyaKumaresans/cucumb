package com.pom.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotels {
public WebDriver driver;
	
	public SearchHotels(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="location")
private WebElement Location;
public WebElement getLocation() {
	return Location;
	
}
@FindBy(id="hotels")
private WebElement Hotels;
public WebElement getHotels() {
	return Hotels;
	
}
@FindBy(id="room_type")
private WebElement Roomtype;
public WebElement getRoomtype() {
	return Roomtype;
	
}
@FindBy(id="room_nos")
private WebElement Roomno;
public WebElement getRoomno() {
	return Roomno;
	
}
@FindBy(id="datepick_in")
private WebElement Datein ;
public WebElement getDatein() {
	return Datein;
}
		@FindBy(id="datepick_out")
		private WebElement Dateout ;
		public WebElement getDateout() {
			return Dateout;
	}
	
	
		@FindBy(id="adult_room")
		private WebElement Aroom ;
		public WebElement getAroom() {
			return Aroom;
	}
	
		@FindBy(id="child_room")
		private WebElement Croom ;
		public WebElement geCroom() {
			return Croom;
	}
		
		@FindBy(id="Submit")
		private WebElement Submt ;
		public WebElement getSubmt() {
			return Submt;
		}
	
	
}
