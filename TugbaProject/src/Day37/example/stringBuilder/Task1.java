package Day37.example.stringBuilder;

import java.util.ArrayList;

//you have list of student names
//you need to return a string which is first letter of their names
public class Task1 {

 public String getLetters(ArrayList<String> names){
	
	 
	 StringBuilder sb=new StringBuilder();
	 
     String result = "";
     for (String name : names) {
	    	   
	    
	 String firstLetter = name.substring(0, 1);
//          result += firstLetter;
          sb.append(firstLetter);

		
	     }        
		     result=sb.toString();
	    	return result;		       	   		
	     }   	
	    
// StringBuilder sb=new StringBuilder();
// String result=" ";
// 
// for(int i=0; i<names.size();i++) {
//  
//String a=names.get(i);  
//
//sb.append(a.substring(0,1));
//
//String c=sb.toString();
//
//
// 
// 
//}
// result =sb.toString();
// 
//return result;

}
   
