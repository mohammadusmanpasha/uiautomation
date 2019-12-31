package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class pages {
	
	 private AndroidDriver<AndroidElement> driver;
	    public pages() {
	    }
	    public pages(AndroidDriver<AndroidElement> driver) {
	        this.driver = driver;
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    }
	
	
	//post
	@AndroidFindBy(id="io.voiapp.charger:id/beginButton")
	private AndroidElement permission;
	
	@AndroidFindBy(id="io.voiapp.charger:id/beginButton")
	private AndroidElement continuebtn;

	@AndroidFindBy(id="io.voiapp.charger:id/loginEmail")
	private AndroidElement enteremail;
	
	@AndroidFindBy(id="io.voiapp.charger:id/loginPassword")
	private AndroidElement enterpassword;
	
	@AndroidFindBy(id="io.voiapp.charger:id/loginButton")
	private AndroidElement clickstarthunting;


	

	public void clickContinue() {
		continuebtn.click();
	}

	public void typeEmail(String email) {
		enteremail.sendKeys(email);
	}

	public void typePassword(String password) {
		enterpassword.sendKeys(password);
	}
	
	public void clickLogin() {
		clickstarthunting.click();
	}
	
	public void clickPermission() {
		permission.click();
	}




}
