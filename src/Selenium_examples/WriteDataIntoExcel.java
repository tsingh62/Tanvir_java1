package Selenium_examples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws IOException 
	{
		// File
			// we need to create new file here 
			// provide the location and name of the new file to be created
		String path = ("C:/Users/Tanvir Singh/Desktop/Adv_Automation/Data_Driven_XL_Data_Day21/");
		FileOutputStream file = new FileOutputStream(path + "Test123.xlsx");
		
		// Workbook
			// Creating object for class workbook
		// Creating sheet inside the workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// Creating sheet inside the workbook
		XSSFSheet sheet = workbook.createSheet("Data"); // Name of the sheet can be any name
		
		for(int r=0;r<=4;r++)//0 1 2 3 4
		{
			// Create row object
			// Create row
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<=4;c++) //0 1 2 3 4
			{
				row.createCell(c).setCellValue("Testing..");// add value into cell
			}
		}
		
		workbook.write(file);
		file.close();
		workbook.close();
		
		System.out.println("Data has been written in to excel......");
	}

}