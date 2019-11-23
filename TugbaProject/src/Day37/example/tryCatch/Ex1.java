package Day37.example.tryCatch;

public class Ex1 {
	
	public int withdraw(int yourBalance,int moneyYouWant) {
		
		if(yourBalance<moneyYouWant) {
			RuntimeException haveNoMoney=new RuntimeException("Have not enough money in balance");
			
			throw haveNoMoney;
		}
		
		return moneyYouWant;
	}

	public static void main(String[] args) {
		
		Ex1 ex1=new Ex1();
		
		try {
		ex1.withdraw(10, 100);
	

	}catch (Exception ex) {
		System.out.println("Dude you don't have money");
	}finally {
		System.out.println("I am in the finally body");
	}
	}
}
