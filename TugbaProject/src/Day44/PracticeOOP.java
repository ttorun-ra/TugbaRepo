package Day44;

public class PracticeOOP {
	// example of runtime polymorphism
	
    public static void main(String[] args) {
        Parent p = new Parent();
        p.print();
        p = new SubClass1();
        p.print();

        p = new SubClass2();
        p.print();
    }
}

class Parent {
    void print() {
        System.out.println("ParentClass");
    }
}

class SubClass1 extends Parent {
    void print() {
        System.out.println("Sub Class 1");
    }
}

class SubClass2 extends Parent {
    void print() {
        System.out.println("Sub Class 2");
    }
}