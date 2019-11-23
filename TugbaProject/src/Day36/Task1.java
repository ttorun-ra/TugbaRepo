package Day36;

public class Task1 {

	public static void main(String[] args) {
		// create array of size 5
		// try to access to index 10
		
           int[]arr=new int[5];
           
           try {
           System.out.println(arr[10]);

	}catch(Exception ArrayIndexOutOfBoundsException) {
		
		System.out.println("Don't worry, it is handled");
	}finally {
		System.out.println("heeeyyy");
	}

}
}
