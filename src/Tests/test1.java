package Tests;

import org.testng.annotations.Test;

import Base.SetupBreakDown;
import Utilities.ActionMethods;

public class test1 extends ActionMethods {
	
	@Test
	public void openBrowser() throws Exception {
		
		clickByXpath("//*[@id='btnLogi']","loginButton");
	}
	
	

}
