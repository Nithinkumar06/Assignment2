package Assignmentday2;
import java.util.*;

public class Range2 {
	
	public static void range() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range ");
		int a =sc.nextInt();
		for(int i=1;i<=a;i++) {
			if(i%7==0 && i%5!=0) {
				System.out.println(i +" ,");
			}
		}
	}
	public static void main(String[] args) {
		range();
	}

}
