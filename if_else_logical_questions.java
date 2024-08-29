/*
    Determine the grade of a student based on their score.
    If the score is 90 or above, the grade is A.
    If the score is between 80 and 89, the grade is B.
    If the score is between 70 and 79, the grade is C.
    If the score is below 70, the grade is F.
*/
import java.util.Scanner;
 class if_else_logical_questions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        Integer marks =  (int) (Math.random() * 100);
        System.out.println("Hi " + name + ", you score "+ marks + " out of 100.");
        if (marks > 90){
            System.out.println("Congratulation "+ name+ " for A grades.");
        } else if (marks > 80){
            System.out.println("Congratulation "+ name+ " for B grades.");
        } else if (marks > 70){
            System.out.println("You need to imporve "+ name+ ". C grades are not good.");
        } else {
            System.out.println("Clap fro "+ name+ ". He is fail.");
        }
    }
    
}