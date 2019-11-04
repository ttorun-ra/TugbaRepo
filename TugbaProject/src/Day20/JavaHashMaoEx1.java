package Day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class JavaHashMaoEx1 {

	public static void main(String[] args) {
		// Sinan 95
		//max 54
		
		ArrayList<String> name= new ArrayList<>();
		
		name.add("Sinan");
		name.add("Max");
		
		ArrayList<Integer> points= new ArrayList<>();
		points.add(95);
		points.add(54);
		
		int size=name.size();
		for(int i =0; i<size; i++) {
			String names=name.get(i);
			
			Integer point=points.get(i);
			
			System.out.println(names+" "+point);
					
			
		}
		

		HashMap<String,Integer> map=new HashMap<>();
		
		 map.put("Sinan", 95);
	        map.put("Max", 54);
	        map.put("Sinan", 1000);
	        map.put("Max", 2000);

	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            String names = entry.getKey();
	            Integer point = entry.getValue();
	            System.out.println(name + " " + point);
	        }
//	        System.out.println(map);
	        
//	        System.out.println(map.entrySet());
	        
	        System.out.println("Getting value of Max: " + map.get("Max"));
	        System.out.println("Map contains Max:" + map.containsKey("Max"));
	        System.out.println("Map contains Ali:" + map.containsKey("Ali"));
	        map.remove("Max"); // removes eleme
	        System.out.println("1." + map);
	        map.put("Sinan", 33);//to update existing key-value pair
	        System.out.println("2." + map);

		
	}

}
