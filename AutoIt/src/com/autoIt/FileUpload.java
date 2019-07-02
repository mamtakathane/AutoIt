package com.autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUpload {

	@Test
	public void test() throws IOException {
		
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/USER/Desktop/fileupload.html");	
	
	driver.findElement(By.xpath("html/body/input")).click();
	
	
	//Runtime.getRuntime().exec("C:\\Users\\USER\\Desktop\\AutoIt\\Fileupload.exe");
	
	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
}
