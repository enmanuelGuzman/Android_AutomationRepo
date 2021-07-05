import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MoreWinPO {
	
	
	
	
	
	/*MobileElement settingBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/test_settings_button");
	
	
	public static void clicSettingBtn()
	{
		settingBtn.click();
	}*/
	
	public static void clicSettingBtn(AppiumDriver<MobileElement> driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 120, 1000);
		MobileElement settingBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/test_settings_button");
		
		wait.until(ExpectedConditions.elementToBeClickable(settingBtn));
		System.out.println("Click on Setting");
		settingBtn.click();
	}
	
	
	
	/*
	MobileElement userNameMoreWin = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/name_text");
	public String getUserName()
	{
		
		return userNameMoreWin.getText();
	}
	
	
	MobileElement homeTabMoreWin = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget."
			+ "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/"
			+ "android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView");
	
	public void clickHomeTab()
	{
		homeTabMoreWin.click();
	}*/
	
	/*MobileElement txtLabelMoreWin = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
			+ "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget."
			+ "FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget."
			+ "LinearLayout[2]/android.widget.TextView[1]");
     public String getTextMoreWin()
     {
    	 return txtLabelMoreWin.getText();
     }
	
     
     public void VerifyMoreWin()
     {
    	 if(getTextMoreWin().trim().equals("Are you a quality pro?"))
    	 {
    		 System.out.println("Test Passed - Inside More Window");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Inside More Window");
    	 }
    	 
     }*/
	
	
	public static String getTextMoreWin(AppiumDriver<MobileElement> driver)
    {
   	 MobileElement aboutAngiBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/about_homeadvisor_button");
   	 return aboutAngiBtn.getText();
   	 
	 
    }
	
	
    public static void VerifyMoreWin(AppiumDriver<MobileElement> driver)
    {
   	 if(getTextMoreWin(driver).trim().equals("About Angi"))
   	 {
   		 System.out.println("Test Passed - Inside More Window");
   	 }
   	 else 
   	 {
   		 System.out.println("Test Failed - Inside More Window");
   	 }
   	 
    }
     
     
	

}
