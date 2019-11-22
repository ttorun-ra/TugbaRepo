package Day35.Task;

class Bank {
    public int year;
    public int serial;
    public String name;
    public boolean trustworthiness;
    
    public Bank(){
        year = 0;
        serial = 0;
        name = "Unknown bank";
    }
    
    public Bank(boolean t){
        this(2019, 10, "Bank of America");
        trustworthiness = t;
    }

    public Bank(int year, int num, String name) {
        this.year = year;
        serial = num;
        this.name = name;
        
    } public Bank(int year, int num, String name,boolean t) {
        this.year = year;
        serial = num;
        this.name = name;
        trustworthiness=t;
        
    }

    public String getAttributes(){
        return "Bank Year:" + year + "\n"
                + "Bank Name:" + name + "\n"
                + "Serial Number:" + serial + "\n"
                +"trustworthiness"+trustworthiness;
    }
}


public class Task2DosSolution {

	public static void main(String[] args) {
	Bank chase=new Bank(2010,1,"Chase");
	System.out.println(chase.getAttributes());
	
	Bank bank=new Bank();
	System.out.println(bank.getAttributes());
	
	Bank tw=new Bank(true);
	System.out.println(tw.getAttributes());
	

	}

}
