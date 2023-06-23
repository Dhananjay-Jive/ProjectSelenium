package Qagroup.MavenComandSureFire;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class getDataFromPropertyFile {
       static FileInputStream file;  
       
	public static String propdata(String Key) throws IOException
       {
    	    FileInputStream file=new  FileInputStream("C:\\Users\\RSC\\workspace\\selenium\\MavenComandSureFire\\credential.file");
    	     Properties prop=new Properties();
    	     prop.load(file);
    	     String value=prop.getProperty(Key);
    	     return value;
       }
}

