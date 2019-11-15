package Day25_1;

import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {
		
		
		Day24Other.Ecample ex=new Day24Other.Ecample() ;
		ex.PublicMethod();
		ex.PublicStaticVoid();
	
		
		
		ArrayList<Integer> alist=new ArrayList<>();
		
		alist.add(2);
		alist.add(4);
		alist.add(6);
		
		for(int i=0;i<alist.size();i++) {
			
		
		System.out.println(alist.get(i)* alist.get(i));
	}
		ArrayList<String> a2=new ArrayList<>();
		a2.add("a");
		a2.add("be");
		a2.add("de");
		
		for(int i=0;i<a2.size();i++) {
			System.out.println(a2.get(i)+"*");
			
			System.out.println((a2.get(i))+a2.get(i)+a2.get(i));
		}
	}
}

