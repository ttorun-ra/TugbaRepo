package Day37;




class MyInteger {

    private MyInteger() {
    }

    public static int valueOf(String s) {
        // custom code
        return Integer.valueOf(s);
    }

    public static MyInteger getMe(/**/) {
        //some checking before creating object
        MyInteger myInt = new MyInteger();
        return  myInt;
    }

}

public class Example2 {

    public static void main(String[] args) {
//        MyInteger myInt = new MyInteger(); cannot create object because of private constructor
//        MyInteger a = new MyInteger();
        int a = MyInteger.valueOf("10");


        MyInteger myInteger = MyInteger.getMe();
    }

}