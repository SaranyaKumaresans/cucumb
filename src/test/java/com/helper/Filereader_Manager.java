package com.helper;

public class Filereader_Manager {
private Filereader_Manager() {
	
}
public static Filereader_Manager getInstance() {
	Filereader_Manager frm=new Filereader_Manager();
	return frm;
	
}
public Config_Reader getInstanceCR() throws Throwable {
	Config_Reader cr=new Config_Reader();

	return cr;
	
}
}
