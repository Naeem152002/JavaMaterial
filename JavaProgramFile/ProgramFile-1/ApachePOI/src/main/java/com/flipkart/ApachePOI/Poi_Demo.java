package com.flipkart.ApachePOI;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi_Demo {

	public static void main(String[] args) {
		try {
			Workbook w = new XSSFWorkbook(new FileInputStream("C:\\Users\\naeem\\OneDrive\\Desktop\\Vedio\\emp1.xlsx"));
			Sheet s =  w.getSheet("emp1");
		FormulaEvaluator f =w.getCreationHelper().createFormulaEvaluator();
		for(Row row:s )
		{
			for(Cell cell:row)
			{
				switch(f.evaluateInCell(cell).getCellType())
				{
				case NUMERIC : 
					System.out.println(cell.getNumericCellValue()+ "\t\t");
					
					break;
				case  STRING:
					System.out.println(cell.getStringCellValue() + "\t\t");
					break;
					
				}
			
				System.out.println();
			}
		}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

