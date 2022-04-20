package com.pom.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public static WebDriver driver;

	public SelectHotel(WebDriver driver3) {
		SelectHotel.driver=driver3;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement Select;
	public WebElement getSelect() {
		return Select;
	}
	@FindBy(id="continue")
	private WebElement Cont;
	public WebElement getCont() {
		return Cont;
	}


}
