package com.pom.clas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Adactin {

	private static WebDriver driver;

	public Login_Adactin(WebDriver driver1) {
		Login_Adactin.driver = driver1;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "username")
	private WebElement usernam;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getUsernam() {
		return usernam;

	}

	public WebElement getpwd() {
		return pwd;
	}

	public WebElement getlogin() {
		return login;

	}

}
