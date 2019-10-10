package Tests;

import org.testng.annotations.Test;

import Base.SetupBreakDown;
import Utilities.ActionMethods;

public class test1 extends ActionMethods {
	
	@Test
	public void openBrowser() throws Exception {
		
		//clickByXpath("//*[@id='btnLogi']","loginButton");
		//clickById("btnLogi4", "logIN");
		//dropDown("","","");
		sendKeys("//*[@id=\'txtUsername\']","admin","username");
		sendKeys("//*[@id=\'txtPassword\']","America17762019@","password");
		clickByXpath("//*[@id='btnLogin']","loginButton");
		Thread.sleep(100000L);
		hoverOver("//*[@id=\'menu_admin_viewAdminModule\']/b","hoverOverIssue");
		Thread.sleep(100000L);
		
		
		
		

	}
	

	
	

}
