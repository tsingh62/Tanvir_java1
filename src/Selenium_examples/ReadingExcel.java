package Selenium_examples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	
	// Follow the Hierarchy 
	// File - workbook - sheet - row - cells
	public static void main(String[] args) throws IOException 
	{
//======For Reading Data from File to Workbook to Sheet to ROw to Cell num==//
	// FileInputStream is a java class not Selenium
		// import file from java 
		// Reading from File - path is the location of the Excel file + file name
		String path = ("C:/Users/Tanvir Singh/Desktop/Adv_Automation/Data_Driven_XL_Data_Day21/");
		FileInputStream file = new FileInputStream(path + "data3.xlsx");
		
		// Reading the workbook from above file location
		XSSFWorkbook workbook = new XSSFWorkbook(file);// above file location
		
		// Reading the sheet number
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		// we can also use this logic 
	//	XSSFSheet sheet = workbook.getSheetAt(0); // index for sheet starts from 0
		
		// Before reading the data from the Excel sheet 
		// we need to know the how many rows and cells are there in the sheet
		
		//This logic will return the last row in the sheet
		int rownum = sheet.getLastRowNum(); // getting last row in sheet1
		
		// This logic will get last cell in the specified row
		// we can take any row and check the last cell in the row
		int colcount = sheet.getRow(1).getLastCellNum();
		
		System.out.println(rownum); // Index will start from 0 for rows (0-12)
		System.out.println(colcount); // Index will start from 1 for cols (1-4)
				
//============================================================================================//
		//Reading data from sheet (rows and cols)
		
		for(int r=0;r<=rownum;r++) //0 1 2 3....12
		{	// reading from row object
			XSSFRow row=sheet.getRow(r); //0 1
			//for(int c=0;c<=colcount-1;c++) = logic also works 
			for(int c=0;c<colcount;c++) //0 1 2 3 
			{
				String value=row.getCell(c).toString();
				//System.out.print(value + "                          ");
				System.out.print("          "+ value + "          ");
			}
			// to print the values in table format
			System.out.println();
		}
		file.close();
		workbook.close();
		
	}

}
