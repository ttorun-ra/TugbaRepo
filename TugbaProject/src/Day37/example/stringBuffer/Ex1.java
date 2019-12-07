package Day37.example.stringBuffer;

public class Ex1 {

	public static void main(String[] args) {
		//1.What are threads?
		// threads work as parallel
		
		String s=" ";
		
		StringBuffer sb= new StringBuffer();
		
		sb.append(s);
		
		for(char i=65; i<=90 ;i++) {
			// for(char letter='A'; letter<='Z'; letter++){
			
			sb.append(i);		
			
			
	}
		System.out.println(sb.toString());
	}
	
	public String getVowels(String str) {
		
		 StringBuffer sb = new StringBuffer();
	        for (char letter = 'A'; letter <= 'Z'; letter++) {
	        	
	        	if(letter=='A'|| letter=='E'||letter=='I'|| letter=='O'|| letter=='U') {
	        		
	            sb.append(letter);
	        }
	        }
	        return sb.toString();
	    }
		
	}

