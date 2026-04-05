package LogicalProblems.PattenProblems;
/*
Pattern - 4: Right-Angled Number Pyramid - II
Problem Statement: Given an integer N. 
*/
public class Pattern4 {
    
    public static void main(String[] args) {
        int N = 5;
        printPattern(N);
    }
    public static void printPattern(int N) {
        for (int i  = 1; i <= N; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
