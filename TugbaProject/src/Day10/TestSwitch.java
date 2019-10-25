package Day10;

import javax.sound.midi.Soundbank;

public class TestSwitch {
    public static void main(String[] args) {
//            int x = 10;
//            if (x) {
//                System.out.println("HELLO TECHNO");
//            } else {
//                System.out.println("BYE");
//            }
//        }
//    }
////Options:
////1. HELLO TECHNO
////2. Compile time error
////3. Runtime Error
////4. BYE
//            int x = 10;
//            if (x)
//                System.out.println("HELLO TECHNO");
//            System.out.println("WELCOME");
//
//        else
//            {
//                System.out.println("BYE");
//            }
//        }
//    }


////Options:
////1. HELLO TECHNO
////WELCOMEclick
////2. HELLO TECHNO
////3. BYE
////4. Compile time error


//            int x = 10, y = 20;
//            if (x < y) {
//                int a = 10;
//            }
//            else {
//                System.out.println("BYE");
//            }
//        }
//    }
////Options:
////1. 10
////2. BYE
////3. NO output
////4. Compile time error

//    int x = 10, y = 20;
//            if (x < y) {
//                if (x > y) {
//                    System.out.println("HELLO TECHNO");
//                } else {
//                    System.out.println("WELCOME");
//                }
//            }
//        }
//    }
////Output:
////1. HELLO TECHNO
////2. Compile time error
////3. WELCOME
////4. No Output


//        String day = "Saturday";
//        switch (day) {
//            case "Monday":
//                System.out.println("Let's Work");
//                break;
//            case "Saturday":
//                System.out.println("waiting for Sunday");
//                break;
//            case "Sunday":
//                System.out.println("Today is fun day");
//        }
//    }
//}
//         int x = 10;
//            final int y = 20;
//            switch (x) {
//                case 10:
//                    System.out.println("HELLO");
//                    break;
//                case y:
//                    System.out.println("TECHNO");
//                    break;
//            }
//        }
//    }
////Options:
////1. TECHNO
////2. Compile time error
////3. HELLO
////4. NO Output


//        int x = 10;
//        switch (x + 1 + 1) {
//            case 10:
//                System.out.println("HELLO");
//                break;
//            case 10 + 1 + 1:
//                System.out.println("TECHNO");
//                break;
//        }
//    }
//}

////Output:
////1. Compile time error
////2. TECHNO
////3. HELLO
////4. No Output

//        char stream = 'C';
//        int x = 2;
//
//        switch (x) {
//            case 1:
//                System.out.println("SCIENCE, MATHS, PHYSICS");
//                break;
//            case 2:
//                switch (stream) {
//                    case 'A':
//                        System.out.println("Welcome");
//                        break;
//                    case 'C':
//                        System.out.println("TechnoStudy");
//                        break;
//                    case 'B':
//                        System.out.println("Have a nice day");
//                        break;
//                }
//                break;
//            case 3:
//                switch (stream) {
//                    case 'C':
//                        System.out.println("Welcome");
//                        break;
//                    case 'D':
//                        System.out.println("In");
//                        break;
//                    case 'E':
//                        System.out.println("GFG");
//                        break;
//                }
//                break;
//        }
//    }
//}

//        int a = 2;
//        int b = 5;

        // here the question mark means if
        // : symbol means else
//        int min = (a <= b) ? a : b;
//
//        if (a <= b) {
//            min = a;
//        } else {
//            min = b;
//        }
//
//        System.out.println(min);
//    }
//}
//find out max number between two inputs, use user input and ternary operator
//        int val1 = 10;
//        int val2 = 20;
//
//        int max = (val2 >= val1) ? val2 : val1;
//        System.out.println(max);
//    }
//}

        int val1 = -20;
        int abs = (val1 <= 0) ? -val1 : val1;
        System.out.println(abs);
    }
}







