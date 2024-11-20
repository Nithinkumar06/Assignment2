package Assignmentday2;
import java.util.*;

public class Variables {
	public static void Datatypes() {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter String");
	String s1 = sc.nextLine();
	System.out.println(s1);
	
	System.out.println("Enter number");
	int num1 = sc.nextInt();
	System.out.println("number is  "+ num1);
	
	System.out.println("Enter Float ");
	float b = sc.nextFloat();
	System.out.println("float is  "+ b);
	
	System.out.println("Enter Byte ");
	Byte c = sc.nextByte();
	System.out.println("Byte is  "+ c);
	
	System.out.println("Enter long ");
	long d = sc.nextLong();
	System.out.println("Long is  "+ d);
	
	System.out.println("Enter char ");
	char e = sc.next().charAt(0);
	System.out.println("Char  is  "+ e);
	sc.close();

	}
	public static void main(String[] args) {
		Datatypes();
	}
}
