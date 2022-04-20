package com.helper;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Config_Reader {
	private static Properties prop;

	public Config_Reader() throws Throwable {
		 File f=new File("D:\\TRB\\Adactin_Project_9AM\\src\\test\\java\\com\\helper\\Config.properties");
	 FileInputStream fis=new FileInputStream(f);
		 prop=new Properties();
		 prop.load(fis);
	 
	 }

public String getBrowser() {
	String brow=prop.getProperty("browser");
	return brow;
	
}

public String getUrl() {
	String uri=prop.getProperty("url");
	return uri;
	

}
public String getUsername() {
	String uname=prop.getProperty("username");
	return uname;
	
}
public String getPassword() {
	String pwd=prop.getProperty("pass");
	
	return pwd;
	
}

public String getcreditCardNo() {
	String cno=prop.getProperty("creditCard");
	return cno;
}

public String getdebitCardNo() {
	String dno=prop.getProperty("getdebitCard");
	return dno;
}

public String getCvv(){
	String cvv=prop.getProperty("cvv");
	return cvv;
	
	
}
public String getIpin() {
	String pin=prop.getProperty("ipin");
	return pin;
}












}