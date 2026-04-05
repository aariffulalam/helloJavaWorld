package LogicalProblems.PattenProblems;
/*
Pattern - 8: Inverted Star Pyramid
Problem Statement: Given an integer N. 
*/
public class Pattern8 {
    
    public static void main(String[] args) {
        int N = 5;
        printPattern(N);
    }
    public static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N*2; j++) {
                if (j <=i-1 || j > N*2-i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
