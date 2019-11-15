package HwOctober29thStockProblem;

import java.util.ArrayList;

public class SenaMentorng {

	public static void main(String[] args) {
//		\*
////	}
//		["1","title","content1"],
//		["2","another title","content2"],
//		["3","yet another title","content3"]
//		]

//		the String id argument of blogDb method is referring to a row from the table the arraylist holds.
//		You need to loop through each element in the ArrayList and find the matching String[] with that id.
//		Then return the title and content in the format below.
//
//		for example
//
//		blogDb(r,"1")
//		returns:
//		title
//		content1
//
//		blogDb(r,"2")
//		returns:
//		another title
//		content2
//
//		when you return the string make sure there is a line break between the title and content.
//		you can use " \n " to line break in a string
//
//		 */

	
		  public String blogDb(ArrayList<String[]> r, String id) {
		    
		    /*
		     * 
		     r arraylisti
		     
		     { "1", "title 1", "content" } => 0.;
		     { "2", "title 2", "content" } => 1.;
		     { "3", "title 3", "content3" }=> 2.;
		     
		     id = 3
		     */

		    String str = "";

		    //       i = 0; i < 3; i++
		    for (int i = 0; i < r.size(); i++) {
		       // r.get(0)[0] = 1 id = 3
		       // { "1", "title 1", "content" }
		  
		      // r.get(1)[0] = 2 id = 3
		      // { "2", "title 2", "content" }
		      
		      // r.get(2)[0] = 3 id = 3
		      // { "3", "title 3", "content3" }
		      if (r.get(i)[0].equals(id)) {
		        str = r.get(i)[1] + "\n" + r.get(i)[2];
		      //  str = r.get(2)[1] + "\n" + r.get(2)[2]
		        //    "title 3"  + "\n" +  "content3"
		      }
		    }

		    return str;

		  }


	}


