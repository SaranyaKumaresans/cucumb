package com.pom.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
public WebDriver driver;
	
	
	public Logout(WebDriver driver5) {
		this.driver=driver5;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="logout")
	private WebElement Logout;
	public WebElement getLogout() {
		return Logout;
}
	@FindBy(linkText="Click here to login again")
	private WebElement Loginag;
	public WebElement Loginagain() {
		return Loginag;
}
}
