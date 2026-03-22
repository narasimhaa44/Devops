package com.example;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ImmutableList<String> fruits=ImmutableList.of("Apple","Bannana","Cherry");
    	System.out.println(fruits);
    	File sourceFile=new File("source.txt");
    	File destFile=new File("destination.txt");
    	try{
    	  FileUtils.copyFile(sourceFile,destFile);
    	  System.out.println("File Copied Sucessfully!");
    	  }catch(IOException e){
    	     System.out.println("Error occured while Copying file :"+e.getMessage());
    	     }
    }
}
