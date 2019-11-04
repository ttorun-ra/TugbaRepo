package Day20;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMapTask14 {
	

	public static void main(String[] args) {
		 //14. print    
	    // Apple Lemon Peach Melon Berry
	    // 100 200 150 145 250


		HashMap<String,Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);
        
        
        for(Map.Entry<String, Integer> entry: map.entrySet() ) {
        	
        	
                String keys = entry.getKey(); // or e.getValue()
                
                System.out.print(keys + " ");
            }
        
        for(int value:map.values()) {
        	System.out.println(value);
        }
                       System.out.println();
                       
                for (Map.Entry<String, Integer> entry1 : map.entrySet()) {
                	
                    int values = entry1.getValue();
                    
                    System.out.print(values + " ");

     
        }
                for(String s:map.keySet()) {
                	System.out.println(s
                			
                			);
                }

	}
}

