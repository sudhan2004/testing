package com.example.testing.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExportingReports {
	public static void main(String[] args)
	{
		ExtentSparkReporter spark= new ExtentSparkReporter ("1./.extent Report.html");
		ExtentReports extent = new ExtentReports (); extent.attachReporter (spark);
		ExtentTest testl= extent.createTest ("Facebook", "login for facebook");
		testl.log(Status.PASS, "SAMPLE TEST");
		extent.flush();
	}
}
