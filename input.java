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