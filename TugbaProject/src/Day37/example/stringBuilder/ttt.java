package Day37.example.stringBuilder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
public class ttt{


// you have list of student names
// you need to return a string which is first letter of their names

    //ex: {Max, Adam, Susan} => "MAS"
    //Hint: charAt, substring
public String getLetters(List<String> names) {
	StringBuilder sb=new StringBuilder();
	
	 String result=" ";
	 
	 for(int i=0; i<names.size();i++) {
	  
	String a=names.get(i);  

	sb.append(a.substring(0,1));

	String c=sb.toString(); 
	 	 
	}
	 result =sb.toString();
	 
	return result;

	}
	

    public String getLettersSB(List<String> names) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        for (String name : names) {
            //1.way
            String firstLetter = name.substring(0, 1);
//            result += firstLetter;
            sb.append(firstLetter);
        }

        result = sb.toString();
        return result;
    }

    @Test
    public void test1() {
        // GIVEN
        List<String> names = Arrays.asList("Max", "Susan", "Adam");
        // WHEN
        String expected = "MSA";
        String actual = getLettersSB(names);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        // GIVEN
        List<String> names = Arrays.asList("Tuba", "Sena", "Burak");
        // WHEN
        String expected = "TSB";
        String actual = getLettersSB(names);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        // GIVEN
        List<String> names = Arrays.asList("Max", "Susan", "Adam");
        // WHEN
        String expected = "MSA";
        String actual = getLettersSB(names);
        // THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        // GIVEN
        List<String> names = Arrays.asList("Susan", "Adam");
        // WHEN
        String expected = "SA";
        String actual = getLettersSB(names);
        // THEN
        Assert.assertEquals(expected, actual);
    }

}

