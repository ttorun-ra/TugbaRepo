package Day15;

public class ArrayTask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // you have string array of numbers,
        // change data type to int
//        //ex: {"11", "13", "17"} =>  {11, 13, 17}
//
        String str = "2";
        int a = Integer.valueOf(str);
        System.out.println(a);

        String[] arr = {"2", "3", "4"};
        int b[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            b[i] = Integer.parseInt(str);


            System.out.println(b[i]);
        }
    }
}

	