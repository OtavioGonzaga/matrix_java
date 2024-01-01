import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();
		int[][] matrix = new int[rows][cols];

		System.out.println();
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.printf("Row %d, column %d: ", (i + 1), (j + 1));
				matrix[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		System.out.println();
		for(int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}

		System.out.printf("%nEnter a number to find it in the matrix: ");
		int findNum = sc.nextInt();

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == findNum) {
					System.out.println("Position: " + Integer.toString(i + 1) + ", " + Integer.toString(j + 1));
					if(i > 0) System.out.println("Up: " + matrix[i - 1][j]);
					if(j < matrix[i].length - 1) System.out.println("Rigth: " + matrix[i][j + 1]);
					if(i < matrix.length - 1) System.out.println("Down: " + matrix[i + 1][j]);
					if(j > 0) System.out.println("Left: " + matrix[i][j - 1]);
					System.out.println();
				}
			}
		}
		
		sc.close();
    }
}
