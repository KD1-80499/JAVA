package Assignment1_Ans;

public class Question4 {

		public static void patternA(int rows) {
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= rows-i; j++)
		            {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= i; j++) {
		                System.out.print(" * ");
		            }
		            System.out.println();
		        }
		}
		public static void patternB(int rows) {
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        for (int i = rows - 1; i >= 1; i--) {
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }


		public static void patternC(int rows) {
		        for (int i = 1; i <= rows; i++) {
		            for (int j = 1; j <= rows - i; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		public static void main(String[] args) {
		    int rows = 6;

		    System.out.println("Pattern A:");
		    patternA(rows);
		   
		    System.out.println("Pattern B ");
		    patternB(rows);
		   
		    System.out.println("Pattern C:");
		    patternC(rows);
		}
		}