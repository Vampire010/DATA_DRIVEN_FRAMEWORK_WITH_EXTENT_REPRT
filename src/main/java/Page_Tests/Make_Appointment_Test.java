package Page_Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Pages.Make_Appointment_Page;
import Browser_SetUP.Launch_Browsers;

public class Make_Appointment_Test
{
	
	String URL = "https://katalon-demo-cura.herokuapp.com/";
	String Browser = "chrome";
	Launch_Browsers br = new Launch_Browsers();

	@BeforeMethod
	public void open_Browser()
	{
		br.browsers("chrome", URL);		
	}
	
	
	@Test
	public void run_Make_Appointment_Test() throws IOException
	{
	
		Make_Appointment_Page Map = new Make_Appointment_Page(br.driver);
		Login_test tst = new Login_test();
		tst.run_login_test();
		Map.Facility_dropdwn();
		Map.hospital_readmission_ch_bx();
		Map.Medicare_radio_btn();
		Map.Visit_Date_Calender();
		Map.Enter_Comment();
		Map.Book_appointment();
	}	
	
	@AfterMethod
	public void get_page_title()
	{
		System.out.println(br.driver.getTitle());		
	}


}
