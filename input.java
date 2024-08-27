import java.util.Scanner;

class input {
    public static void main(String [] arg ){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.next();
        System.out.println("Hi "+name+", What is your age?");
        Integer age = scanner.nextInt();
        System.out.print("at this very young age "+age+" you shave very big dreems. "+"what is your Goal? ");
        scanner.nextLine(); // this help to add \n in the end
        String goal = scanner.nextLine();
        System.out.println("Good "+goal);
    }
}
/**
 * Method

nextInt( ) - Takes integer input from the user

nextFloat( ) - Takes floating-type input from the user

nextBoolean( ) - Takes boolean input from the user

nextLine( ) - Takes a line of text (with spaces) as input from the user

next( ) - Takes character input from the user

nextByte( ) - Takes a byte value as input from the user

nextDouble( ) - Takes double-type input from the user

nextShort( ) - Takes short-type input from the user

nextLong( ) - Takes long-type input from the user

 */