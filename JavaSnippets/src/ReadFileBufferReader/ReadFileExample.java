package ReadFileBufferReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
	
	public static void main(String[] args) {
	
	BufferedReader objReader = null;
	
	  try {
	   String strCurrentLine;
	   
	   objReader = new BufferedReader(new FileReader("D:\\Support.txt"));

	   while ((strCurrentLine = objReader.readLine()) != null) {

	    System.out.println(strCurrentLine);
	    
	    int count = 1;
		   for(int i=0; i < strCurrentLine.length()-1;i++){
			   if((strCurrentLine.charAt(i) == ' ') && (strCurrentLine.charAt(i+1) != ' ')){
				   
				   count ++;
			   } 
			   
		   }
		   
		   System.out.println(count);
		   
	   }
	  // System.out.println(strCurrentLine);
	   
	   

	  }
	  catch (IOException e) {
	   e.printStackTrace();

	  } 
	  
	  finally {

	   try {
	    if (objReader != null)
	     objReader.close();
	   } 
	   catch (IOException ex) {
	    ex.printStackTrace();
	   }
	   
	  }

	}
}
