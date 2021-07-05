import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class testCase {

	
	private static AppiumDriver<MobileElement>driver;
	
	
	public testCase()
	{
        
	}
	
	public static void main(String[] args) {
		
		
		
        new AppiumUtility();
		
		driver = AppiumUtility.getDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Application Started...");
		
		
		
		MainPagePO.verifPointHomePage(driver);
		MainPagePO.clickMoreTab(driver);
		MoreWinPO.VerifyMoreWin(driver);
		MoreWinPO.clicSettingBtn(driver);
		settingWinPO.VerifySettingWin(driver);
		settingWinPO.clickEditBtn(driver);
		settingWinPO.clickEnvNetwork(driver, "qa1");
		settingWinPO.clickSaveNetEnv(driver);
		settingWinPO.VerifyCurrentApiHost(driver, "qa1");
		settingWinPO.VerifyCurrentPaymentHost(driver, "qa1");
		settingWinPO.clicCreateUserBtn(driver);
		settingWinPO.insertZip(driver, "99547");
		settingWinPO.clickCreateUserConfBtn(driver);
		settingWinPO.clickReturnBtn(driver);
		MoreWinPO.VerifyMoreWin(driver);
		settingWinPO.clickHomeTab(driver);
		/*MainPagePO.clickOnboardScreenNextBtn(driver);
		MainPagePO.clickOnBoardScreenSkipBtn(driver);*/
		MainPagePO.verifPointHomePage(driver);
		AppiumUtility.close();
		

		

	}
	

}
