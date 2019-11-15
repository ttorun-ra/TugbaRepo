package Day23Practice;
import java.util.ArrayList;

public class Task7 {

	public static void main(String[] args) {
		  // Given arrayList of chars
	    // print true if they have repetitive letters
	    // {'A','B','B'} => true
	    // {'C','D'} => false

		
		ArrayList<Character> alist=new ArrayList<>();
		
		alist.add('a');
		alist.add('b');
		alist.add('a');
		
		int count=0;
		boolean rep=false;
		for(int i=0;i<alist.size();i++) {
			for(int j=i+1;j<alist.size();j++) {
				
			if(alist.get(i)==alist.get(j)&& i!=j){			
							
				rep=true;
							
			}
			}
			
		}if(rep) {
			
			System.out.println("there are repetitive letters");
		}else {
			System.out.println("nothing");
		}
	}
}
