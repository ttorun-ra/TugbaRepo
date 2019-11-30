package day38Example.finalModifier;

import java.util.ArrayList;
import java.util.List;

public class ex2 {

	public static void main(String[] args) {
		System.out.println(sum);
	}
	public static double bankStatementCalculator(List<String> list) {
		  List<String> myStatement = new ArrayList<>();
          myStatement.add("$6");
          myStatement.add("$7");
          myStatement.add("$0");
          myStatement.add("$0");
          myStatement.add("$0");
	      //end
	     double sum= 0;


	      double[] arrDouble = new double[list.size()];

	      for(int i=0;i<myStatement.size();i++) {

	          myStatement.remove("$");
	           arrDouble[i]=Double.parseDouble(myStatement.get(i));
	          sum = sum + i;
	      }
	      if(sum==0){
	      return -1;
	  }else{
	          return sum;
	      }
	      
	}

}
