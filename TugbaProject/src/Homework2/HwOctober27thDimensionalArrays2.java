package Homework2;

public class HwOctober27thDimensionalArrays2 {

	public static void main(String[] args) {
		
//      walmart	costco	corrado's	AVG
// apple	3	       4	   5	     4
// milk	3	       3	   3	     3
// meat	4          5	   4	     4.33
// bread	1	       1	   2	     1.33
// TOTAL	11	      13	   14

 // given table,
 // part1. calculate sum of price in each market(walmart,costco,corrado's)
 // expected output is:
 // Total at Walmart is: ???
 // Total at costco is: ???
 // Total at corrado's is: ???
		
		int[] apple= {3,4,5};
		int[]milk= {3,3,3};
		int[]meat= {4,5,4};
		int[]bread= {1,1,2};
		
		int sumApple=0;
		
		int sumMilk=0;
		
		double sumMeat=0;
		
		double sumBread=0;
		
		int[][] items= {{3,4,5},{3,3,3},{4,5,4},{1,1,2}};
		
			for(int j=0; j<3 ;j++) {
			 
				 sumApple= sumApple + items[0][j];
				
				 sumMilk= sumMilk  + items[1][j];
				 
				 sumMeat= sumMeat  + items[2][j];
				 
				 sumBread= sumBread + items[3][j];
				
			 
			}
			 System.out.println("The average price of apples is : " + sumApple/3);
			 System.out.println("The average price of milk is : " + sumMilk/3);
			 System.out.println("The average price of meat is : " +  sumMeat/3);
			 System.out.println("The average price of bread is : " + sumBread/3);
				
		
	}
	}

	

