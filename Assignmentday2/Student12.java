package Assignmentday2;
import java.util.*;

public class Student12 {

	public static void Grades() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade :  ");
		char grade = sc.next().charAt(0);
		switch(grade) {
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
				System.out.println("Good");
				break;
			case 'C':
				System.out.println("Medium");
				break;
			case 'D':
				System.out.println("Fail");
				break;
		}


	}
	public static void main(String[] args) {
		Grades();
	}
}



