package globalVariable;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Global {
		
		public static WebDriver driver = new EdgeDriver();
		public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		public static String emailValid = "yosha@gmail.com";
		public static String passwordValid = "password1";
		
		public static String newEmail = "yoshui@gmail.com";
		public static String newPass = "pass12345";
		
		public static String username = "yosha";

}
