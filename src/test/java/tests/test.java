package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import pages.pages;
import java.util.*;

public class test extends baseclass {
	
	pages pagobj=new pages();
	
//	@BeforeTest
//	 static void Selendroid(){
//	           if (( driver).isDeviceLocked())
//	        	   ( driver).pressKey(new KeyEvent(AndroidKey.ENTER));
//	           else
//	                   ( driver).lockDevice();
//	    }
	 
	@Test
	public void testcases() throws InterruptedException {
		
		//pagobj.clickPermission();
//		pagobj.clickContinue();
//		pagobj.typeEmail("mohammadusmanpasha2000@gmail.com");
//		pagobj.typePassword("Phj6Js8x3z");
//		pagobj.clickLogin();
		
		driver.unlockDevice();


		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"CONTINUE WITH YOUR HUNTER LOGIN\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Email\")").sendKeys("mohammadusmanpasha2000@gmail.com");
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"password\")").sendKeys("Phj6Js8x3z");
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"START HUNTING\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"NEXT\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"LET'S GO!\")").click();
		 
		 if(driver.findElement(By.className("android.widget.ImageButton")).isDisplayed() )
			 System.out.println("has found!!!!");
		 else 
			 System.out.println("Not found!!!!");
		 
		 driver.findElement(By.className("android.widget.ImageButton")).click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"PROFILE\")").click();
		 driver.findElementByAndroidUIAutomator("new UiSelector().text(\"SIGN OUT\")").click();
		 
		 driver.close();
		 
		 driver.wait(99999999);
		
	}

}
