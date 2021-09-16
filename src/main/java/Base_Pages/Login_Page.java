package Base_Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Data_Server.DataDriven;

public class Login_Page 
{
	@FindBy(xpath="//*[@id=\"menu-toggle\"]/i")
	WebElement menu_toggle;
	
	@FindBy(xpath="//*[@id=\"sidebar-wrapper\"]/ul/li[3]/a")
	WebElement Login_btn_toggle;
	
	@FindBy(xpath="//*[@id=\"txt-username\"]")
	WebElement setusername;
	
	@FindBy(xpath="//*[@id=\"txt-password\"]")
	WebElement setpassword;
	
	@FindBy(xpath="//*[@id=\"btn-login\"]")
	WebElement logBtn;
	
	DataDriven a = new DataDriven();

	
	public Login_Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void menu_toggles()
	{		
		menu_toggle.click();		
	}
	public void Login_btn_toggles()
	{		
		Login_btn_toggle.click();		
	}
	
	public void setusernames() throws IOException
	{		
		setusername.sendKeys(a.getdata("sname", 1, 0));	
		System.out.println(a.getdata("sname", 1, 0));

	}
	
	public void setpasswords() throws IOException
	{		
		setpassword.sendKeys( a.getdata("sname", 1, 1));	
		System.out.println(a.getdata("sname", 1, 1));
	}
	public void ClicklogBtn()
	{		
		logBtn.click();		
	}

}
