






import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class MainPagePO{
		
/*
	AppiumDriver<MobileElement> driver;
	
	public MainPagePO(AppiumDriver<MobileElement> driver) {
		
		super(driver);
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	private MobileElement moreTab = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.Line"
			+ "arLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLay"
			+ "out/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
			+ "android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView");
	
    
	public void clickMoreTab()
	{ 
		moreTab.click();
		
	}
	*/
	public static void clickMoreTab(AppiumDriver<MobileElement> driver)
	{ 
		WebDriverWait wait = new WebDriverWait(driver, 120, 1000);
		MobileElement moreTab = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.Line"
				+ "arLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLay"
				+ "out/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/"
				+ "android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.ImageView");
		
		wait.until(ExpectedConditions.elementToBeClickable(moreTab));
		System.out.println("Click on More Tab");
		
		moreTab.click();
		
	}
	
	
	public static void clickOnboardScreenNextBtn(AppiumDriver<MobileElement> driver)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Click on Next Button from Onboarding Screen");
		MobileElement nextBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/onboarding_screen_next_button");
		nextBtn.click();

	}
	
	public static void clickOnBoardScreenSkipBtn(AppiumDriver<MobileElement> driver)
	{
		System.out.println("Click on Skip Button from Onboarding Screen");
		MobileElement skipBtn = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/onboarding_screen_skip_button");
		skipBtn.click();
	}
	
	public static String getBrowseTitle(AppiumDriver<MobileElement> driver)
	{
		MobileElement browserTitleLabel = (MobileElement) driver.findElementById("com.servicemagic.consumer.debug:id/title");
		return browserTitleLabel.getText();
	}
	
	public static void verifPointHomePage(AppiumDriver<MobileElement> driver)
	{
		
		
		 if(getBrowseTitle(driver).trim().equals("Browse by category"))
    	 {
    		 System.out.println("Test Passed - Inside Home Page");
    	 }
    	 else 
    	 {
    		 System.out.println("Test Failed - Inside Home Page");
    	 }
	}
	
	
 

}
