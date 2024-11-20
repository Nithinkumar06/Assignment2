package Assignmentday2;
import java.util.*;

public class Factorial {
	public static void factorial1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n = sc.nextInt();
	int fact=1;
	int i=1;
	for(i=1;i<=n;i++) {
		fact = fact*i;
		System.out.println(fact);
		
	}
	}
	public static void main(String[] args) {
		factorial1();
		
	}

}
