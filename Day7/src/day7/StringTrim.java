package day7;

public class StringTrim {

    // trim() removes spaces

    // white space characters at the beginning and end of the string

    public static void main(String[] args) {
        String string = "    Hello   ";
        System.out.println(string);
        System.out.println(string.trim());

        String s2 ="    Hello  World    ";
        System.out.println(s2.trim());


    }
}
