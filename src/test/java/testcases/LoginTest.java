package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class LoginTest extends BaseClass {
	@Test
	public void test1() {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com", "Abc@12345");
		WebElement error = driver.findElement(By.id("msg_box"));

		String actualError = error.getText();
		String expError = "The email or password you have entered is invalid.";

		Assert.assertEquals(actualError, expError);

	}

	@Test
	public void test2() {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("pqr@xyz.com", "Abc@12345");

	}
	
	@Test
	public void test4() throws FilloException {

		LoginPage login = new LoginPage(driver);
		Recordset recordset = connection.executeQuery("select * from data where TestName ='test4'");
		recordset.next();
		
		
		String UserName = recordset.getField("UserName");
		String Password = recordset.getField("Password");
		
		System.out.println(UserName);
		System.out.println(Password);
		
		login.LoginFunction(UserName, Password);
		

	}

}
