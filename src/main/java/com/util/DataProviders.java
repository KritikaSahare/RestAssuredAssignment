package com.util;

import org.testng.annotations.DataProvider;

public class DataProviders {

	
	@DataProvider(name="AllData")
	public String[][] userDataProvider()
	{
		String fileName = System.getProperty("user.dir")+"/userdata.xlsx";
		int totalRowCount =ReadExcelFile.getRowCount(fileName, "Sheet1");
		int totalColumnCount = ReadExcelFile.getColCount(fileName, "Sheet1");
		
		String[][] userData = new String[totalRowCount-1][totalColumnCount];
		
		for(int rowNum=1;rowNum<totalRowCount;rowNum++)
		{
		   for(int colNum = 0 ;colNum<totalColumnCount;colNum++)
		   {
			   userData[rowNum-1][colNum] = ReadExcelFile.getCellValue(fileName, "Sheet1", rowNum, colNum);
			   
			
		   }
		}
		return userData;
	}
	
	@DataProvider(name="userNamesData")
	public String[] userNameDataProvider()
	{
		String fileName = System.getProperty("user.dir")+"/testdata.xlsx";
		int totalRowCount =ReadExcelFile.getRowCount(fileName, "Sheet1");
		
		String[] userNames = new String[totalRowCount-1];
		
		for(int rowNum=1;rowNum<totalRowCount;rowNum++)
		{
			userNames[rowNum-1] = ReadExcelFile.getCellValue(fileName, "Sheet1", rowNum, 1);
		}
		return userNames;
	}
}
