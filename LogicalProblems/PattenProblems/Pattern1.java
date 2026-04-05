package LogicalProblems.PattenProblems;
/*
Pattern-1: Rectangular Star Pattern
Problem Statement: Given an integer N.
*/
public class Pattern1 {

    public static void main(String[] args) {
        int N = 5; // You can change this value to print a different size pattern
        printPattern(N);
    }

    public static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
