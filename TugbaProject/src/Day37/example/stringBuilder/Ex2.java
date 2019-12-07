package Day37.example.stringBuilder;

public class Ex2 {
	
	 public static void main(String[] args) {
	        String simpleString = "a" + "b" + "c";
//	      s1 = "a";
//	      s2 = "ab";
//	      s3 = "abc";
//              String a=new String();
//             a.length();
//             a.substring(beginIndex)
              
	        StringBuilder sb = new StringBuilder();
	        
	        sb.append("a");
	        sb.append("b");  
	        sb.append("c");
	    
	        
	        String reversedString= sb.reverse().toString();
	        
	        String sbString = sb.toString();

	        System.out.println("simpleString: " + simpleString);
	        System.out.println("sbString: " + sbString);
	        
	        System.out.println("Reversed String: "+ reversedString);
	    }
	}


