package extentreports007;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import freemarker.ext.beans.TemplateAccessible;

public class ExtentReortdemo  {
	public ExtentReports extent;
	
	@BeforeTest
	public void config() {
		//extentreports //ExtentSparkReporter
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter  reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Web page Ankit");
		reporter.config().setDocumentTitle("ankit results ");
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Ankit");
	}
   @Test
	public void initialdemo() {
	  extent.createTest("initialdemo");
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver cdriver=	new ChromeDriver();
		cdriver.get("https:www.salesforce.com");
		extent.flush();
	}
	
}
