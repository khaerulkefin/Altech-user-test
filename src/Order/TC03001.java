package Order;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import globalVariable.Global;

public class TC03001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Login.TC02001.main(args);
		Global.wait
				.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//div[@class='DesktopHeader__LevelOne']/div[@class='DesktopHeader__LogoArea']")))
				.click();

		Global.driver.findElement(By.xpath(
				"//div[contains(@class,'Hero__Content')]/div[@class='container']/div[contains(@class,'Hero__ContentBox')]/div[@class='Hero__ContentButton']/div//button[@class='Hero__BtnCta']"))
				.click();

		Global.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div[contains(@class,'Hero__MomentsWrapper')]/a/div[contains(@class,'Hero__MomentItemWrapper')]/div[contains(@class,'Hero__MomentItem')]/div[contains(@class,'Hero__MomentTextWrapper')]/div[contains(@class,'Hero__MomentText')][text()='Birthday']")))
				.click();
		Global.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[2]/form/div/div[2]/div[1]"))).click();
		Global.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='react-select-2-option-0-0']"))).click();
		Global.driver.findElement(By.xpath("//form/div[@class='Card__Form City']/div[@id='Button']")).click();
		
		Thread.sleep(5000);
		Global.driver.findElement(By.xpath("//div[@class='Package__Container']/div[@data-name='1 Hour Photo Shoot']/div[@class='Package__Footer']/div[@class='Package__SelectButton']")).click();
		
		//Assert
		String location = Global.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[3]/div[1]/div[2]/div[1]/div[3]/div[2]/div")).getText();
		Assert.assertEquals(location, "Bali, Indonesia");
		
		String session = Global.driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[3]/div[1]/div[2]/div[1]/div[3]/div[3]/div")).getText();
		Assert.assertEquals(session, "1 Hour Photo Shoot");
	}

}
