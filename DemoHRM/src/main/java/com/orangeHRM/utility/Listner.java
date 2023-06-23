package com.orangeHRM.utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.orangeHRM.base.BaseClass;

public class Listner extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takeScreenshot(result.getMethod().getMethodName());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
