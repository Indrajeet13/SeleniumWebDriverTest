package TestListenersDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManagerr implements ITestListener
{
	public ExtentSparkReporter sparkReporter;	//UI of the report
	public ExtentReports extent;	//Populate common info into the report
	public ExtentTest test;		//Creating test entries in the report and update status of the test methods
	
	public void onStart(ITestContext context) {
		
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReports.html"); //
		
		sparkReporter.config().setDocumentTitle("Automation Reports"); //Title of report
		sparkReporter.config().setReportName("Functional Testing"); //Name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Indrajeet");
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());	//create new entry in the report
		test.log(Status.PASS, "Test Case PASSED is: "+ result.getName());//Update Status p/f/s
		
	}
	
	public void onTestFailure(ITestResult result) {
		 
		test = extent.createTest(result.getName());	
		test.log(Status.FAIL, "Test Case PASSED is: "+ result.getName()); 
		test.log(Status.FAIL, "Test Case FAILED cause is: "+ result.getThrowable()); //Get the error message		
		
	}
	
	public void onTestSkipped(ITestResult result){
		 
		test = extent.createTest(result.getName());	
		test.log(Status.SKIP, "Test Case SKIPPED is: "+ result.getName()); 
		
	}
	
	public void onFinish(ITestContext context) {
		 
		extent.flush();
		
	}
	
}
