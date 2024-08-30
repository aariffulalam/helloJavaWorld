
import java.util.Scanner;

class logical_questions {
    static void airthmeticOperation(){
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
    public static void  main(String[] args){
        airthmeticOperation();
    }
    
}