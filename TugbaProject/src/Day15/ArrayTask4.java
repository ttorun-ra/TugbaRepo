package Day15;

public class ArrayTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // you have string array of numbers,
        // change data type to int
//        //ex: {"11", "13", "17"} =>  {11, 13, 17}
//
//        String str = "2";
//        int a = Integer.valueOf(str);
//        System.out.println(a);
//
//        String[] arr = {"2", "3", "4"};
//        int b[] = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//
//            b[i] = Integer.valueOf(arr[i]);
//
//
//            System.out.println(b[i]);
//        }
//	}
//}
//            
        }
        String [] stringNumbers= new String[15];
        for(int i=0; i<stringNumbers.length;i++) {
        	
        	stringNumbers[i]="" +i;
        }
        String stringSum="";
        
        for(String s: stringNumbers) {
        	stringSum+=s + " ";
        }	
        	System.out.println("stringSum: " + stringSum); 
        	
        	int[] intNumbers= new int[15];
        	
        	for(int i=0;i<intNumbers.length;i++) {
        		
        		  intNumbers[i] = Integer.valueOf(stringNumbers[i]);
            }

            int intSum = 0;
            for (int n : intNumbers) {
                intSum += n;
            }
            System.out.println("IntSum: " + intSum);

        	}
        }
        
    


	