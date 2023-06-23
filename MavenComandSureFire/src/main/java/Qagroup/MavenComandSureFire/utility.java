package Qagroup.MavenComandSureFire;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class utility {
   static FileInputStream file;
   static XSSFWorkbook book;
   static XSSFSheet sheet;
   static int rowCount=0;
   static int cellcount=0;
	
	public static Object[][]getDataFromExcel(String sheetName) throws IOException
	{  String path= "C:\\Users\\RSC\\workspace\\selenium\\MavenComandSureFire\\excelsheet\\Book.xlsx";
		 file=new FileInputStream(path);
		 book= new XSSFWorkbook(file);
		sheet= book.getSheet(sheetName);
		rowCount=sheet.getLastRowNum();
		cellcount=sheet.getRow(0).getLastCellNum();
		
		Object object[][] =new Object[rowCount][cellcount];
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
			      object[i][j]=sheet.getRow(i+1).getCell(j).toString();
			      
			}
		}
		return object;
		
		
		
	}
}
