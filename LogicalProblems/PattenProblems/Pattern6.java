package LogicalProblems.PattenProblems;
/*
Pattern - 6: Inverted Numbered Right Pyramid
Problem Statement: Given an integer N. 
*/
public class Pattern6 {
    
    public static void main(String[] args) {
        int N = 5;
        printPattern(N);
    }
    public static void printPattern(int N) {
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
