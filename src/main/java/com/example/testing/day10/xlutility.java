package com.example.demo.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlutility 
{
	public static  Object[][] readExcel() throws IOException 
	{
		String location = "E:\\data.xlsx\\";
		FileInputStream fls = new FileInputStream(location);
		XSSFWorkbook wrkbok = new XSSFWorkbook(fls);
		XSSFSheet sheet = wrkbok.getSheetAt(0);
		int tot = sheet.getPhysicalNumberOfRows();
		System.out.println("Total No Of Rows :" + tot);
		int clm = sheet.getRow(0).getLastCellNum();
		System.out.println("Total No Of Columns :" + clm);
		for(int i = 1;i<tot;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<clm;j++)
			{
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getNumericCellValue());
				
			}
		}
		Object [][] data = new Object[tot-1][clm];
		for(int i = 1;i<tot;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<clm;j++)
			{
				XSSFCell cell = row.getCell(j);
				data[i-1][j]=cell.getNumericCellValue();
				System.out.println(cell.getNumericCellValue());
				
			}wrkbok.close();
			fls.close();
		}
		return data;
	}
		public static void updateExcel() throws IOException 
		{
			String location = "E:\\data.xlsx\\";
			FileInputStream fls = new FileInputStream(location);
			XSSFWorkbook wrkbok = new XSSFWorkbook(fls);
			XSSFSheet sheet = wrkbok.getSheetAt(0);
			XSSFRow newRow = sheet.createRow(1);
			XSSFCell newcell = newRow.createCell(1);
			newcell.setCellValue("updated");
			System.out.println("DOcumented Updated SuccessFully");
			FileOutputStream fos = new FileOutputStream(location);
			wrkbok.write(fos);
			wrkbok.close();
			fos.close();
			
			
			
			
			 
		}
		
		
	
}