package Utilities;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import Base.SetupBreakDown;

public class ActionMethods extends SetupBreakDown {
	
	
	

	
	public void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination
                FileUtils.copyFile(SrcFile, DestFile);
    }
	
	
	//This method will click given the XPATH for that button and if anything goes wrong it will take a screenshots. 
	public void clickByXpath(String XPATH, String ScreenshotName) throws Exception {
		
		try {	
		driver.findElement(By.xpath(XPATH)).click();	
		}catch (Exception E) {
			takeSnapShot(driver, "/Users/mahmudulalam/Desktop/GroupHRMProject/GroupHRMProject/Errors/"+ScreenshotName+".png" );
			System.out.println("Following exception is found " + E.getMessage());	
		}	
	}
	
	

	

	public void clickById(String ID, String ScreenshotName) throws Exception {
		try {
		driver.findElement(By.id(ID)).click();
			
		}catch (Exception E) {
			takeSnapShot(driver, "/Users/mahmudulalam/Desktop/GroupHRMProject/GroupHRMProject/Errors/"+ScreenshotName+".jpeg" );
			System.out.println("Following exception is found " + E.getMessage());	
		}
		
	}
	
	
	
	public void sendKeys(String Locator,String input, String ScreenshotName) throws Exception {
		try {
			
			driver.findElement(By.xpath(Locator)).clear();
			driver.findElement(By.xpath(Locator)).sendKeys(input);
			
		}catch (Exception E) {
			takeSnapShot(driver, "/Users/mahmudulalam/Desktop/GroupHRMProject/GroupHRMProject/Errors/"+ScreenshotName+".jpeg" );
			System.out.println("Following exception is found " + E.getMessage());	
		}
		
	}
	
	
	
	
	public void dropDown(String Name, String Name1, String ScreenshotName) throws Exception {
		try {
		
		Select fruits = new Select(driver.findElement(By.id(Name)));
		fruits.selectByVisibleText(Name1);
			
		}catch (Exception E) {
			takeSnapShot(driver, "/Users/mahmudulalam/Desktop/GroupHRMProject/GroupHRMProject/Errors/"+ScreenshotName+".jpeg" );
			System.out.println("Following exception is found " + E.getMessage());	
		}
		
	}
	

	
	public void hoverOver(String XPATH, String ScreenshotName) throws Exception {
		try {
		
		Actions actions = new Actions(driver);
	        //Retrieve WebElement 'Music' to perform mouse hover 
	     WebElement menuOption = driver.findElement(By.xpath(XPATH));
	     //Mouse hover menuOption 'Music'
	     actions.moveToElement(menuOption).perform();
			
			
			
		}catch (Exception E) {
			takeSnapShot(driver, "/Users/mahmudulalam/Desktop/GroupHRMProject/GroupHRMProject/Errors/"+ScreenshotName+".jpeg" );
			System.out.println("Following exception is found " + E.getMessage());	
		}
		
	}
	
}
	

	
	
	
	
	

	
	
