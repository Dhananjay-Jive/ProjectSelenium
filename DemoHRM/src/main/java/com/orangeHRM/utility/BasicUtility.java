package com.orangeHRM.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;







public class BasicUtility {
    public static FileInputStream file;
    public static XSSFWorkbook book;
    public static XSSFSheet sheet;
    public static  Properties prop;
    static int i;
	static int j;
	public static int rowCount;
	public static int cellCount;
	
@Test		
	
public static void getDataFromExcel() 
{
try {
	file =new FileInputStream("C:\\Users\\RSC\\OneDrive\\Desktop\\microsoft edge resume pune\\Book1.xlsx");
	 book=new XSSFWorkbook(file);
	  sheet=book.getSheet("Sheet1");
     String value=sheet.getRow(i).getCell(j).getStringCellValue();
     System.out.println(value);
} catch (Exception e) {
	
	e.printStackTrace();
}
           
         
}
public static Object[][] getTestDataFrom_Dataprovider(String Sheetname) throws FileNotFoundException
{     

      try {
    	  file =new FileInputStream("D:\\selenium\\DemoHRM\\excelSheet\\userName.xlsx");
		  book=new XSSFWorkbook(file);
		  sheet =book.getSheet(Sheetname);
	} catch (IOException e) {
	
		e.printStackTrace();
	}
        rowCount=sheet.getLastRowNum();
        cellCount=sheet.getRow(0).getLastCellNum();
    
  Object data[][]=new Object[rowCount][cellCount];
         for(i=0;i<rowCount;i++)
         {
       	 for(int j=0;j<cellCount;j++)
       	 {
       		 data[i][j]=sheet.getRow(i+1).getCell(j).toString();
       	 }
         }
         return data;
             
}
public static String getdataFromPropFile(String Key) throws IOException
{     String path="D:\\selenium\\DemoHRM\\PropertyFile\\propFile";

file=new FileInputStream(path);
  prop=new Properties();
   prop.load(file);
   
String value=prop.getProperty(Key) ;  
return value;
}
}
