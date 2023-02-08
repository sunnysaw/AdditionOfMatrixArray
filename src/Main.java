import java.util.Scanner;
/*
Question : Write a program to add matrix value and return the sum of matrix.
______________________________________________________________________________
NOTE : THE SIZE OF MATRIX SHOULD BE EQUAL.
 */
public class Main {
    static void PrintMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
    static void sum(int[][] arr, int a, int b, int[][] arr1, int a1, int b2) {
        if (a != b || a1 != b2) {
            System.out.println("Wrong input can't perform addition operation :");
            return;
        }
        int[][] sum = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum[i][j] = arr[i][j] + arr1[j][i];
            }
        }
        PrintMatrix(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ROW SIZE OF FIRST MATRIX :");
        int a = sc.nextInt();
        System.out.println("ENTER THE COLUMN SIZE OF FIRST MATRIX :");
        int b = sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("Enter the element of matrix :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("ENTER THE ROW SIZE OF SECOND MATRIX :");
        int a1 = sc.nextInt();
        System.out.println("ENTER THE COLUMN SIZE OF SECOND MATRIX :");
        int b2 = sc.nextInt();
        int[][] arr1 = new int[a][b];
        System.out.println("Enter the element of matrix :");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        sum(arr,a,b,arr1,a1,b2);
    }
}