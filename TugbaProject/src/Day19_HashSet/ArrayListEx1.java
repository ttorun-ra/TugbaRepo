package Day19_HashSet;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		int [] array = new int [5];
	
		ArrayList <Integer> arrayList = new ArrayList();
		int arrayListLength= arrayList.size();// to get the size
			
		
		arrayList.add(10);// to add a value
		arrayList.add(20);
		arrayList.add(30);
		System.out.println("Before Set");
		
		for (Integer integer: arrayList) {
			
			System.out.println(integer + " ");
		}
		int firstValueList=arrayList.get(0);
		
		arrayList.set(0, 100);
		System.out.println("\nAfter set");
		
         for (Integer integer: arrayList) {
			
			System.out.println(integer + " ");
	}
         
         boolean contains40 = arrayList.contains(40);
         if (contains40) {
        	 
        	 System.out.println(" it has 40");
         }else
        	 System.out.println(" It doesn't have 40");

}
    
    

	
	
}