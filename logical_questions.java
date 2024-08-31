
import java.util.Scanner;

class logical_questions {
    static void AirthmeticOperation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 - ");
        Integer num1 = scanner.nextInt();
        System.out.println("Input 2 - ");
        Integer num2 = scanner.nextInt();
        System.out.println("Addition - " + (num1 + num2));
        System.out.println("multiply - " + (num1 * num2));
        System.out.println("subtract - " + (num1 - num2));
        System.out.println("divide  - " +((double)num1 / num2));
        System.out.println("remainder   - " + (num1 % num2));
        System.out.println("divide  - " +(double)(num1 / num2));  // inter value converting into double
    }

    static  void IntToBinary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 - ");
        Integer num1 = scanner.nextInt();
        String binary_number = "";
        while ( num1> 0){
            Integer remaindor = num1 % 2;
            binary_number = remaindor + binary_number;
            num1 = num1 / 2;            
        }
        System.out.println("Binary number is "+binary_number);

    }

    static void ReverseString(){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Input 1 - ");
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++ ) {
            result = input.charAt(i) + result;
        }
        System.out.println(result);
    }

    static  void  ConvertStringIntoInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1 - ");
        String input = scanner.nextLine();
        Integer result = Integer.parseInt(input);
        System.out.println(result);
        System.out.println( result+1);
    }

    public static void  main(String[] args){

        // AirthmeticOperation();/

        // Write a Java program to convert an integer number to a binary number.
        // IntToBinary();

        // Write a Java program to reverse a string.
        // ReverseString();

        // Write a Java program to convert a string to an integer./
         ConvertStringIntoInteger();
    }
    
}