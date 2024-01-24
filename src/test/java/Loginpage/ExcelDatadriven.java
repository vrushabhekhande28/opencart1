package Loginpage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class ExcelDatadriven {

	@Test
	public void getDataFromExcel() throws IOException {
		// File is get here
		String filePath = System.getProperty("user.dir") + "\\excelstore\\DATADRIVEN.xlsx";
		File file = new File(filePath);
		FileInputStream InputStream = new FileInputStream(file);

		/*
		 * XSSFWorkbook XSSFSheet
		 * 
		 */

		// start the data driven
		XSSFWorkbook workBook = new XSSFWorkbook(InputStream);

		// get the sheet by number or enter sheetname
		XSSFSheet sheet = workBook.getSheetAt(0);

		
		/*
		// get the last row
		int row = sheet.getLastRowNum();
		System.out.println("Row:" + row);
		int column = sheet.getRow(0).getLastCellNum();
		System.out.println("column : " + column);

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < column; c++) {
				XSSFCell value = sheet.getRow(r).getCell(c);
              System.out.println(value.getCellType());
				if (value.getCellType()!=null)
				{
					switch (value.getCellType()) 
					{
					 case STRING:
						System.out.print(value.getStringCellValue());
						break;

					 case NUMERIC:
						System.out.print(value.getNumericCellValue());
						break;
					}
				} 
				else 
				{
					System.out.print("Cell type is null");
				}
				System.out.print(" |  ");
			}
			System.out.println();
		}
		*/
		
		/*
		
		     Iterator iterate =sheet.iterator();
		     
		     
		     while(iterate.hasNext())
		     {
		    	 XSSFRow row =(XSSFRow)iterate.next();
		    	 
		    	  Iterator<org.apache.poi.ss.usermodel.Cell> cellIter = row.cellIterator();
		    	  
		    	  while(cellIter.hasNext())
		    	  {
		    		  XSSFCell cell=(XSSFCell)cellIter.next();
		    		  
		    		  switch(cell.getCellType())
		    		  {
		    		  case STRING:
							System.out.print(cell.getStringCellValue());
							break;

						 case NUMERIC:
							System.out.print(cell.getNumericCellValue());
							break;
		    		  }
		    		  System.out.print(" | ");
		    	  }
		    	  System.out.println();
		     }
		   */
		
		
		/*
		    Iterator it=sheet.iterator();
		    
	        while(it.hasNext())
	        {
	        	 XSSFRow row = (XSSFRow)it.next();
	        	  Iterator it2=row.cellIterator();
	        	  
	        	  while(it2.hasNext())
	        	  {
	        		  XSSFCell cell =(XSSFCell)it2.next();
	        		   
	        		  switch(cell.getCellType())
		    		  {
		    		  case STRING:
							System.out.print(cell.getStringCellValue());
							break;

						 case NUMERIC:
							System.out.print(cell.getNumericCellValue());
							break;
		    		  }
		    		  System.out.print(" | ");
		    	  }
		    	  System.out.println();
	        		  
	        	  
	        	 
	        }
	        */
		
		/*
		
		    int rows =sheet.getLastRowNum();
		    System.out.println(rows);
		    int col=sheet.getRow(0).getLastCellNum();
		    System.out.println(col);
		    
		    
		    for(int r=0 ; r<rows ; r++)
		    {
		    	for(int c= 0 ; c<col ; c++)
		    	{
		    		XSSFCell cell = sheet.getRow(r).getCell(c);
		    		switch(cell.getCellType())
		    		  {
		    		  case STRING:
							System.out.print(cell.getStringCellValue());
							break;

						 case NUMERIC:
							System.out.print(cell.getNumericCellValue());
							break;
		    		  }
		    		  System.out.print(" | ");
		    	  }
		    	  System.out.println();
		    		
		    	}
		    	  */
		    }
		    
		     
		   
	
}
