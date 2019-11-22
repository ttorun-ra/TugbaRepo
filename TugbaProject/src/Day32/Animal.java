package Day32;

public class Animal {

	  public String name; // cat, dog
	    public String breed;
	    public int age;
	    public double weight;
	    public int legs;
	    public boolean poisonous;

	    public int getSpeed() {
	        return legs * 10;
	    }

	    public boolean canJump() {
//	        if (legs >= 2) {
//	            return true;
//	        } else {
//	            return false;
//	        }

	        return legs >= 2;
	    }
	    
	    public String cuteness(){
	    	String result="";
	        if(legs == 0){
	            result="Not cutkj /e";
	        }else if(legs == 2){
	           result="Some what cute";
	        }else if(legs == 4){
	            result="Perfect";
	        }else if(legs < 0){
	            result="OMG";
	        }else if(legs > 4){
	            result="MUTANT";
	        }
	        return  result;
	    }
	    public String toString() {
	    	String output="";
	    	output+="Name"+ name+"\n";
	    	
	    	output+= "Age:"+age+"\n";
	    	
	    	output+="Weight"+ weight+"\n";
	    	output+= "Cuteness is:   "+cuteness()+"\n";
	    	
	    	return output;
	    }
	    public static void main(String[] args) {
	    	
	    }
	}
