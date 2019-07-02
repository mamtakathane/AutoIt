package com.RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadRobotClass {

	public static void main(String[] args) throws AWTException {
		
	Robot robot = new Robot();	
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://demo.automationtesting.in/Register.html");
	
	driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
	
	robot.setAutoDelay(2000);
	StringSelection stringselection = new StringSelection("C:\\Mamta\\programs\\JbkTask\\src\\com\\Task\\ParallelTestNGTest.java");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null );
	
	robot.setAutoDelay(2000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.setAutoDelay(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.setAutoDelay(2000);
		driver.close();
		
	}
		
}
