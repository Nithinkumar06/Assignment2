package Assignmentday2;
import java.util.*;

public class Reverse {
	public static void Reversed() {	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int w = sc.nextInt();
	int rev=0;
	int rem=0;
	while(w>0) {
		rem=w%10;
		rev=rev*10+rem;
		w=w/10;	
	}
	System.out.println(rev);
	
	}
	public static void main(String[] args) {
		Reversed();
	}

}
