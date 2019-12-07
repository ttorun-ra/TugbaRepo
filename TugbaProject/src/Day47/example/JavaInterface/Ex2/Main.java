package Day47.example.JavaInterface.Ex2;

public class Main {

	public static void main(String[] args) {
		
	CopyToWord ctw= new CopyToWord();
	
	ctw.CopyPaste();
	
	CopyAndPastingToFile cp1= new CopyToWord();
	
	CopyAndPastingToFile cp2= new CopyToExcel();
	
			CopyAndPastingToFile  cp3=new CopyToPowerpoint();
	

	}

}
