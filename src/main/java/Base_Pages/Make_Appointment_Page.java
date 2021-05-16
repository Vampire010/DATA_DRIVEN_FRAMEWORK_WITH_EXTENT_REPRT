package Base_Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Make_Appointment_Page 
{
	@FindBy(xpath="//*[@id=\"combo_facility\"]")
	WebElement Facility;
	
	@FindBy(xpath="//*[@id=\"chk_hospotal_readmission\"]")
	WebElement  hospital_readmission;
	
	@FindBy(xpath="//*[@id=\"radio_program_medicare\"]")
	WebElement Medicare;
	
	@FindBy(xpath="//*[@id=\"txt_visit_date\"]")
	WebElement Visit_Date;
	
	@FindBy(xpath="//*[@id=\"txt_comment\"]")
	WebElement Comment;
	
	@FindBy(xpath="//*[@id=\"btn-book-appointment\"]")
	WebElement btn_book_appointment;
	
	public Make_Appointment_Page(WebDriver d)
	{
		PageFactory.initElements(d, this);
	}
	
	public void Facility_dropdwn()
	{	
		Select Facl = new Select(Facility);
		Facl.selectByVisibleText("Seoul CURA Healthcare Center");		
	}
	public void hospital_readmission_ch_bx()
	{		
		hospital_readmission.click();		
	}
	
	public void Medicare_radio_btn() throws IOException
	{		
		Medicare.click();			
	}
	
	public void Visit_Date_Calender() throws IOException
	{		
		Visit_Date.sendKeys("26/03/2021");	
	}
	public void Enter_Comment()
	{		
		Comment.sendKeys("Im a Healthy Person");		
	}
	public void Book_appointment() throws IOException
	{		
		btn_book_appointment.click();			
	}


}
