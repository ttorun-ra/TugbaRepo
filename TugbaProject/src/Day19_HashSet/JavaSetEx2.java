package Day19_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class JavaSetEx2 {

	public static void main(String[] args) {
        System.out.println("ArrayList------------------------");
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Max");
        myList.add("Max");
        System.out.println(myList);

        System.out.println("HashSet------------------------");
        Set<String> mySet = new HashSet<>();
        mySet.add("Ali");
        mySet.add("Max");
        mySet.add("Max");
        System.out.println(mySet);
        
      //1. Write a Java program to append the specified element to the end of a hash set.
        // element to the end of a hash set
        //
       // ex:[1,2,3] you add 10
        
        System.out.println("ArrayList------------------------");
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        System.out.println(listNumbers);

        System.out.println("HashSet------------------------");
        Set<Integer> setNumbers = new java.util.HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(3);
        setNumbers.add(10);
        System.out.println(setNumbers);
    }

}
    
