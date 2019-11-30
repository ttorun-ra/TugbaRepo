package one;


class Counter{
	
   static int count=0;
   

    public Counter(){
	   	
	   	count ++;
	   	
	   	System.out.println(count);
   }
}
   public class Task1 {
  
   public static void main(String[] args) {		

		       Counter c1 = new Counter();
//		       
		       System.out.println("Number of object: "+ c1.count);
//		       
		       
		       Counter c2 = new Counter();
		       
		       System.out.println("Number of object: "+ c2.count);
		       Counter c3 = new Counter();
		       
		      System.out.println("Number of object: "+ c3.count); 
		}
	   	 	
		    }
		

   
