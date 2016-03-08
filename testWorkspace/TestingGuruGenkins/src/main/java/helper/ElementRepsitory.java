package helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementRepsitory {
	
	@FindBy(linkText="user")
	public static WebElement userName;
	
	@FindBy(linkText="passwrd")
	public static WebElement password;
	
	@FindBy(linkText="login")
	public static WebElement loginButton;

	

}
