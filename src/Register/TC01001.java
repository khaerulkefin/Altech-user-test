package Register;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import globalVariable.Global;

public class TC01001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Global.driver.get("https://www.sweetescape.com/");

		Global.driver.findElement(By.xpath(
				"//div[@class='DesktopHeader__LevelOne']/div[@class='DesktopHeader__UserArea ']/div[@class='DesktopHeader__Link']/div[@class='DesktopHeader__Items']/div[@class='DesktopHeader__ItemsText '][text()='Register']"))
				.click();

		Global.wait
				.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//form/div[@class='EmailCheck__Wrapper']/input[@id='user_email']")))
				.sendKeys(Global.newEmail);

		Global.driver.findElement(By.xpath("//form/input[@class='EmailCheck__Button']")).click();

		Global.driver.findElement(By.xpath("//form/input[@id='user_name']")).sendKeys("yoshui");
		
//		Global.driver.findElement(By.xpath("//form[@id='new_user']/div/div/div/div/div/div")).click();
		
		Global.driver.findElement(By.xpath("//*[@id=\"user_phone\"]")).sendKeys("83726152637");

		Select gender = new Select(Global.driver
				.findElement(By.xpath("//form/div[@class='signup-form__select']/select[@id='user_gender']")));
		gender.selectByValue("Male");
		
		Global.driver.findElement(By.xpath("//form/div[@class='signup-form-datepicker']/div[@class='signup-form-inline-datepicker-container']/input[@id='datepicker']")).sendKeys("22 Jan 1985");
		
		Select nat = new Select(Global.driver.findElement(By.xpath("//form/div[@class='signup-form__select']/select[@id='user_nationality']")));
		nat.selectByValue("ID");
		
		Global.driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys(Global.newPass);
		
		Global.driver.findElement(By.xpath("//*[@id=\"submit-user-form\"]")).click();

	}

}
