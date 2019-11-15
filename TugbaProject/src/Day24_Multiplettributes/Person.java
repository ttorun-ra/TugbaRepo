package Day24_Multiplettributes;

public class Person {
//	String fname = "John";
//	
//	  String lname = "Doe";
//	  
//	  int age = 24;
//
//	  public static void main(String[] args) {
//		  
//	    Person myObj = new Person();
//	    
//	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
//	    
//	    System.out.println("Age: " + myObj.age);
//	
	    int age = 20; //Global variable

        static int age2 =  30 ;

        public void myMethod1(){

            int carAge = 23; //local variable

            System.out.println("carage in the myMethod1 --->>> " + carAge);
        }

        public void myMethod2(){

            System.out.println("my age in the mymethod 2 non static --->> "+age++);

            System.out.println("age2 is here in the myMethod2  static   --->> " + age2++);

//        System.out.println(carAge);  this variable is local variable in the myMethod1 so we are able to connect just in the myMethod1

        }

        public static void myMethods(){

            Person s1 = new Person();


            s1.myMethod2();


        }


        public static void main(String[] args) {

           Person s1 = new Person();

            s1.myMethod2();

           Person s2 = new Person();

            s2.myMethod2();

            Person s3 = new Person();

            s3.myMethod2();

            myMethods();

        }

		
		

	}


