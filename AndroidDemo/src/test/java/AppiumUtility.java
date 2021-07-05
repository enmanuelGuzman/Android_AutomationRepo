import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class AppiumUtility {
	
	
	public static AppiumDriver<MobileElement>driver;
	
	public AppiumUtility()
	{
        DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability("deviceName", "Android Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		
		cap.setCapability("appPackage", "com.servicemagic.consumer.debug");
		cap.setCapability("appActivity", "com.servicemagic.consumer.splashscreen.Home");
		cap.setCapability("commandTimeouts", "12000");
		
		URL url;
		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	public static AppiumDriver<MobileElement>getDriver()
	{
		
		return driver;
	}
	
	public static void close()
	{
		System.out.println("Closing App");
		driver.quit();
	}

	
}
