package Utilities;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import Base.SetupBreakDown;

public class ActionMethods extends SetupBreakDown {
	
	
	public void clickByXpath(String XPATH, String ScreenshotName) throws Exception {
		
		try {
			
		driver.findElement(By.xpath(XPATH)).click();
			
		}catch (Exception E) {
			takeSnapShot(driver, "/Users/mahmudulalam/Desktop/GroupHRMProject/GroupHRMProject/Errors/"+ScreenshotName+".jpeg" );
			System.out.println("Following exception is found " + E.getMessage());
			
		}
		
		
	}
	

	
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

}
