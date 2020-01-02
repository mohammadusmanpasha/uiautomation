package tests;

import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.URL;

public class baseclass {
	
	public static URL url;
	public static AndroidDriver<MobileElement> driver;
//	String apkpath="/Users/fidel/Downloads/Test.apk";
//	File app=new File(apkpath);
	
	  @BeforeSuite
	  public void setupAppium() throws MalformedURLException {
	    
		try {
		
	    DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554"); //RF8M20NP95B
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		capabilities.setCapability("unicodeKeyboard", "true");                                     
		capabilities.setCapability("resetKeyboard", "true");
		capabilities.setCapability("MobileCapabilityType.NO_RESET", "false");
		capabilities.setCapability("autoGrantPermissions", "true");
		capabilities.setCapability("unlockType", "pin");
		capabilities.setCapability("unlockKey", "2580");
		capabilities.setCapability("appPackage", "io.voiapp.charger");
		capabilities.setCapability("appActivity", "io.voiapp.hunter.MainActivity");
		//capabilities.setCapability(MobileCapabilityType.APP, "/Users/muhammadusmanpasha/Desktop/hunter.apk");
	
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
//		driver.resetApp();
		
	}catch(Exception exp) {
		
		System.out.println("Cause is:"+exp.getCause());
		System.out.println("Message is:"+exp.getMessage());
		System.out.println("Cause is:"+exp.getCause());
		exp.printStackTrace();
	}
		
		
				
}
	  
	
}	
