package Day22Practice;

import java.util.ArrayList;

public class Task15 {

	public static void main(String[] args) {
		int [] a= {2,3,5,6,8,0,12,4,1,9};
		
		ArrayList<Integer> alist= new ArrayList<>();
		
		for(int i=0;i<a.length;i++) {
			if(a[i] %2 ==0) {
					
				
				alist.add(a[i]);
						
			}
		}	
		
			System.out.println(alist);
		}

	}



