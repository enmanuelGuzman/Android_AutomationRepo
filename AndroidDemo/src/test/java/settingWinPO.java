

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class settingWinPO {
	
	//AppiumDriver<MobileElement> driver = AppiumUtility.getDriver();
	
	
	/*MobileElement settingWinTitle = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/tv_header");
	
	public String getSettingTitle()
	{
		return settingWinTitle.getText();
	}*/
	
	
	public static String getSettingTitle(AppiumDriver<MobileElement> driver)
	{
		MobileElement settingWinTitle = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/tv_header");
		
		return settingWinTitle.getText();
	}
	
	public static void VerifySettingWin(AppiumDriver<MobileElement> driver)
     {
    	 if(getSettingTitle(driver).trim().equals("Test Settings"))
    	 {
    		 System.out.println("Test Passed - Inside Setting Window");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Inside Setting Window");
    	 }
    	 
     }
	
	
	public static void clickEditBtn(AppiumDriver<MobileElement> driver)
	{
		MobileElement editBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/edit_network_button");
		System.out.println("Click edit button");
		editBtn.click();
	}
	
	
	public static String getNetEnvTitle(AppiumDriver<MobileElement> driver)
	{
		MobileElement netEnvLabel = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/network_header");
		return netEnvLabel.getText();
	}	
	
	public static void VerifyNetEnvTitle(AppiumDriver<MobileElement> driver)
	{
		 if(getNetEnvTitle(driver).trim().equals("Network Environment"))
    	 {
    		 System.out.println("Test Passed - Inside Network Environment Section");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Inside Network Environment Section");
    	 }
		
	}
	
	
	
	public static void clickEnvNetwork(AppiumDriver<MobileElement> driver, String env)
	{
		
		MobileElement qaBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/"+env+"_preset");
		System.out.println("Click "+env.toUpperCase()+" Env");
		qaBtn.click();
		
	}
	
	
	
	public static void clickSaveNetEnv(AppiumDriver<MobileElement> driver)
	{
		
			MobileElement saveBtnNetEnv = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/save_network_settings");
			System.out.println("Click Save Button on Network Environment Section");
			saveBtnNetEnv.click();
		
	}
	
	

	
	public static String getCurrentApiHost(AppiumDriver<MobileElement> driver)
	{
		MobileElement currentApiHostLabel = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/api_host_value");
		return currentApiHostLabel.getText();
	}
	
	public static void VerifyCurrentApiHost(AppiumDriver<MobileElement> driver, String apiHostTxt)
	{
		 if(getCurrentApiHost(driver).trim().equals("https://"+apiHostTxt+"-api.homeadvisor.com"))
    	 {
    		 System.out.println("Test Passed - Current Api Host is correct");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Current Api Host is not correct");
    	 }
		
	}
	
	
	public static String getCurrentPaymentHost(AppiumDriver<MobileElement> driver)
	{
		MobileElement currentPayHost = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/payment_host_value");
		return currentPayHost.getText();
	}
	
	public static void VerifyCurrentPaymentHost(AppiumDriver<MobileElement> driver, String currentPayHost)
	{
		 if(getCurrentPaymentHost(driver).trim().equals("https://"+currentPayHost+"-payments.homeadvisor.com"))
    	 {
    		 System.out.println("Test Passed - Current Payment Host is correct");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Current Payment Host is not correct");
    	 }
		
	}
	
	
   
	
	public static void clicCreateUserBtn(AppiumDriver<MobileElement> driver)
	{
		System.out.println("Click on Create User Button");
		MobileElement createUserBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/create_user_btn");
		createUserBtn.click();
	}
	

	
	public static void insertZip(AppiumDriver<MobileElement> driver, String zipCode)
	{
		System.out.println("Inserting ZIP Code: " + zipCode);
		MobileElement zipTxt = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/zip_edit_text");
		zipTxt.sendKeys(zipCode);
	}
	

	
	public static void clickCreateUserConfBtn(AppiumDriver<MobileElement> driver)
	{
		System.out.println("Click on Create User Confirmation Button");
		MobileElement createUserConfirmBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/create_user_confirm_btn");
		createUserConfirmBtn.click();
	}
	
	
	
	public static void clickReturnBtn(AppiumDriver<MobileElement> driver)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Click on Return Button");
		MobileElement returnBtn = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
		returnBtn.click();
	}
	
	public static void clickHomeTab(AppiumDriver<MobileElement> driver)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Click on Home Tab");
		MobileElement homeTab = driver.findElement(By.id("com.servicemagic.consumer.debug:id/bottom_nav_home_button"));
		homeTab.click();
	}
	
	
	/*public static String getCurrentUserInfoTitle(AppiumDriver<MobileElement> driver)
	{
		MobileElement currUserInfoTitle = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/user_info_header");
		return currUserInfoTitle.getText();
	}
	
	public static void VerifyCurrentUserInfoTitle(AppiumDriver<MobileElement> driver)
	{
		 if(getCurrentUserInfoTitle(driver).trim().equals("Current User Information"))
    	 {
    		 System.out.println("Test Passed - Current User Info Title is correct");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Current User Info Title is not correct");
    	 }
		
	}*/
	
	
/*	
	MobileElement editBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/edit_network_button");
	
	public void clickEditBtn()
	{
		editBtn.click();
	}
	
	
	MobileElement qaBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/qa1_preset");
	
	public void clickQA1()
	{
		qaBtn.click();
		
	}
	
	MobileElement saveBtnNetEnv = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/save_network_settings");
	
	public void clickSaveNetEnv()
	{
		saveBtnNetEnv.click();
	}
	
	
	MobileElement currentApiHostLabel = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/api_host_value");
	
	public String getCurrentApiHost()
	{
		return currentApiHostLabel.getText();
	}
	
	MobileElement currentPayHost = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/payment_host_value");
	
	public String getCurrentPaymentHost()
	{
		return currentPayHost.getText();
	}
	
	
	MobileElement createUserBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/create_user_btn");
	
	public void clicCreateUserBtn()
	{
		createUserBtn.click();
	}
	
	
	MobileElement currUserInfoTitle = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/user_info_header");
	
	public String getCurrentUserInfoTitle()
	{
		return currUserInfoTitle.getText();
	}
	

	MobileElement zipTxt = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/zip_edit_text");
	
	public void insertZip()
	{
		zipTxt.sendKeys("99547");
	}
	
	
	MobileElement createUserConfirmBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/create_user_confirm_btn");
	
	public void clickCreateUserConfBtn()
	{
		createUserBtn.click();
	}
	
	MobileElement returnBtn = (MobileElement) driver.findElementByAccessibilityId("Navigate up");
	
	public void clickReturnBtn()
	{
		returnBtn.click();
	}
	*/
	
}