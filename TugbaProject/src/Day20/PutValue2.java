package Day20;

import java.util.HashMap;

public class PutValue2 {

	public static void main(String[] args) {
		 HashMap<String, Integer> map = new HashMap<>();
		 
		 String [] names= {"Max","Drake","Susan"};
		 
		 for(int i=0; i<names.length;i++) {
			 map.put(names[i],0);
		 }
			 System.out.println(map);
			 
			 
			 
		 }

	}

