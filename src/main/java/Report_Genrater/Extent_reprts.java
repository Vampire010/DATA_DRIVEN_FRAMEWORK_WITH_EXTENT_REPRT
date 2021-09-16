package Report_Genrater;



import com.aventstack.extentreports.ExtentReports;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_reprts 
{
	public void Report_Genraters(String Test_Name , String Test_Status )
	{
		ExtentTest test;
		ExtentReports report;
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("/Users/girishg/eclipse-workspace/PGAE_OBJECT_MODEL_FRAMEWORK_POM/Browser_Drivers/ex_Reporter.html");
		
        	// Create object of ExtentReports class- This is main class which will create report
		    ExtentReports extent = new ExtentReports();
		    
		    // attach the reporter which we created in Step 1
		    extent.attachReporter(reporter);
		    
		        // call createTest method and pass the name of TestCase- Based on your requirement
		    ExtentTest logger = extent.createTest(Test_Name);
	
		    logger.log(Status.INFO, "Demo1 Extent report gen");
			   
		    logger.log(Status.PASS, Test_Status);
		    
		    logger.log(Status.FAIL, "Demo2");
		    logger.log(Status.ERROR, "Go_Check");
		    
		    logger.log(Status.WARNING, Test_Status);

        extent.flush();

	}


}
