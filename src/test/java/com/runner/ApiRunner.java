package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.virtualan.idaithalam.contract.IdaithalamExecutor;
import io.virtualan.idaithalam.core.generator.ExcelToCollectionGenerator;

public class ApiRunner {
	
	@Test	
	public void executeApiTests() {
		int status=0;
		try {
			int testcase = 1;
			List<String> list = new ArrayList<String>();
			list.add("FirstAPITest");
			File f = new File(System.getProperty("user.dir") +"/target/"+testcase);
			if(!f.exists()) f.mkdir();
			ExcelToCollectionGenerator.createCollection(list, "APITests.xlsx", System.getProperty("user.dir") +"/target/"+testcase);
			status = IdaithalamExecutor.validateContract("API EXCEL based api testing", System.getProperty("user.dir") +"/target/"+testcase);
			System.out.println(status);
			if(status != 0) {
			 Assert.assertTrue(false); 
			}
			Assert.assertTrue(true); 
						
		}catch (Exception e) {
			System.out.println(e.getMessage());
			Assert.assertTrue(false);
		}
		
	}

}
