package Day15;

public class ArrayTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //  // Given 2 arrays of ints, a and b, print "have the same first elements"
        //    //       if they have the same first


//   Part2

        int[] num1 = {3, 2, 5,98,6, 8};
        int[] num2 = {3, 5, 7,8};



            if (num1[0] == num2[0]) {
                System.out.println("they have the same first element");
            }
        int length1=num1.length;
            int length2=num2.length;

            if(num1[length1-1]==num2[length2-1]){
                System.out.println("they have the same last elements");
            }
            int half1=num1.length/2;
            int half2=num2.length/2;

            if(num1[half1-1]==num2[half2-1]){
                System.out.println("they have the same middle elements");
                System.out.println("the number is "+ num1[half1-1]);
            }

	}

}
