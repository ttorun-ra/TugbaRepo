package Day35.example.accessModifiers;


class Bank {
    private String privateInfo() {
        return "private info: CEO is Max";
    }

    public String publicInfo() {
        String var =privateInfo();
        String publicInfo = "Name is: Chase \n" + var;

        return publicInfo;// + privateInfo;
    }
}

public class Example1 {

    public static void main(String[] args) {
        Bank b = new Bank();
        // System.out.println(b.getInfo());
        System.out.println(b.publicInfo());
    }

}