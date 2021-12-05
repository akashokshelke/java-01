package javatut1;
import java.util.Scanner;

public class MyFirstClass {

    public static void main(String[] args) {
 		System.out.println("input number");
	      Scanner sc = new Scanner(System.in);
	        int Y = sc.nextInt();
	        if (Y % 400 == 0) {
	            System.out.println();
	        }
	        else if (Y % 100==0) {
	          System.out.println(0);
	        }

	        else if (Y % 4 == 0) {
	          System.out.println(1);
	        }
	        else {
	            System.out.println(0);
	        }

	    }
	}
