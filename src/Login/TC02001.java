package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import globalVariable.Global;

public class TC02001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Global.driver.get("https://www.sweetescape.com/");

		Global.driver.findElement(By.xpath(
				"//div[@class='DesktopHeader__LevelOne']/div[@class='DesktopHeader__UserArea ']/div[@class='DesktopHeader__Link']/div[@class='DesktopHeader__Items']/div[@class='DesktopHeader__ItemsText '][text()='Login']"))
				.click();

		Global.wait
				.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//form[@id='login_form']//input[@id='user_email']")))
				.sendKeys(Global.emailValid);
		Global.driver.findElement(By.xpath("//form/div[@class='login-password']/input[@id='user_password']"))
				.sendKeys(Global.passwordValid);

		Global.driver.findElement(By.xpath("//form/div[@class='login-form_submit']/input[@id='gtm-login-button']"))
				.click();

		
		//Assert
		Assert.assertEquals(Global.driver.getCurrentUrl(), "https://www.sweetescape.com/en/escapes");
		
		String verifyUsername = Global.driver.findElement(By.xpath("//div[@class='DesktopHeader__LevelOne']/div[@class='DesktopHeader__UserArea ']/div[@class='DesktopHeader__UserInfo']/div[@class='DesktopHeader__UserAttr']/div[@class='DesktopHeader__UserName ']")).getText();
		Assert.assertEquals(verifyUsername, Global.username);

	}

}
