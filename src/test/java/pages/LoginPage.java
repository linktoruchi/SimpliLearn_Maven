package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testcases.BaseClass;

public class LoginPage {

	WebDriver driver;

	// =============================objects====================//

	@FindBy(linkText = "Log in")
	WebElement loginLink;

	@FindBy(name = "user_login")
	WebElement userName;

	@FindBy(name = "user_pwd")
	WebElement password;

	@FindBy(className = "rememberMe")
	WebElement chkBox;

	@FindBy(name = "btn_login")
	WebElement loginBtn;

	// ============================Methods=======================//

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//this - here represents the current class, if the objects are placed in a different class, then we have to mention that particular class name here instead of "this".

	}

	public void LoginFunction(String UsernameVal, String PwdVal) {

		loginLink.click();

		userName.sendKeys("abc@xyz.com");

		password.sendKeys("Abc@12345");

		chkBox.click();

		loginBtn.click();

	}
}
