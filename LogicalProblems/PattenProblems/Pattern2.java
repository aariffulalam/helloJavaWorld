package LogicalProblems.PattenProblems;
/*
Pattern-2: Right-Angled Triangle Pattern
Problem Statement: Given an integer N.
*/
public class Pattern2 {
    
    public static void main(String[] args) {
        int N = 5;
        printPattern(N);
    }
    public static void printPattern(int N) {
        for (int i  = 1; i <= N; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
