package Day26Exceptions_2;

public class JavaExceptionTest {
ow Do you 

	    public static void main0(String[] args) {
	        throw new ArithmeticException();
	    }

	////Options: Answer is 1.
	////1. RuntineException:java.lang.ArithmeticExcetion
	////2. RuntineException:/ by zero
	////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
	////4. RuntineException:ArithmeticExcetion


	    static ArithmeticException ae = new ArithmeticException();

	    public static void main(String[] args) {
	        throw ae;
	    }
	////Options: Answer 
	////1. RuntineException:java.lang.ArithmeticExcetion
	////2. RuntineException:/ by zero
	////3. RuntineException:java.lang.ArithmeticExcetion:/ by zero
	////4. RuntineException:ArithmeticExcetion
	//

	}