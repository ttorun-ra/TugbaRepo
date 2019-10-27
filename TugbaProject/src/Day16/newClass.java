package Day16;
import java.util.Random;

public class newClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] arr = {
                {100, 100, 100},
                {100, 100, 100, 100, 100}};
                
                
//		int arr[][]=new int[2][5];
                Random grades=new Random();

//		
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
            	
               arr[i][j] = grades.nextInt(100);
               
              
                System.out.println(arr[i][j]);
                
                
            }
            System.out.println();


        }
		}
}

//		int[][] examResult = {
//                {100, 100, 100},
//                {100, 100, 100, 100, 100}
//        };
//        //part2
//        System.out.println("Length: " + examResult[0].length);
//        
//        Random random = new Random();
//        
//        for (int row = 0; row < examResult.length; row++) {
//        	
//            for (int col = 0; col < examResult[row].length; col++) {
//                //part2.1
//                examResult[row][col] = random.nextInt(100);
//                System.out.print(examResult[row][col]+ " ");
//            }
//            System.out.println();
//        }
//    }
//}
	