package LogicalProblems.PattenProblems;
/*
Pattern - 7: Star Pyramid
Problem Statement: Given an integer N. 
*/
public class Pattern7 {
    
    public static void main(String[] args) {
        int N = 5;
        printPattern(N);
    }
    public static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N+i-1; j++) {
                if (j <=N-i || j > N+i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }
}
