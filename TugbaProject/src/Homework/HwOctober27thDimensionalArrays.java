package Homework;

public class HwOctober27thDimensionalArrays {

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

 // part2. calculate average price of each item(apple, milk, meat, bread)
 // expected output is:
 // average price of apple is: ???
 // average price of milk is: ???
 // average price of meat is: ???
 // average price of bread is: ???


		//part1;
		
		int[] apple= {3,4,5};
		int[]milk= {3,3,3};
		int[]meat= {4,5,4};
		int[]bread= {1,1,2};
		int sum1=0;
		int sum2=0;
		int sum3=0;
		int[][] items= {{3,4,5},{3,3,3},{4,5,4},{1,1,2}};
		
		for(int i=0;i<items.length;i++) {
			sum1=sum1+items[i][0];
			sum2=sum2+items[i][1];
			sum3=sum3+items[i][2];
		}
			System.out.println("Total at walmart is: " +sum1);
			System.out.println("Total at costco is: " +sum2);
			System.out.println("Total at corrados is: " +sum3);
		}
	
	}


