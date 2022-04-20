package com.adactin.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\TRB\\Adactin_Project_9AM\\src",glue ="com\\revsteps",dryRun =false,monochrome =true,plugin ="pretty")

public class Runner {

public static WebDriver driver;
//@BeforeClass
//	public static void set_Up() throws Throwable {
//	//driver=Cucumber_Base.Browser("chrome");
//		//driver=cucumber.Adactin_Project_9AM.Cucumber_Base.Browser("chrome");
//	String browser=Filereader_Manager.getInstance().getInstanceCR().getBrowser();
	
//	
//}
//	

}
