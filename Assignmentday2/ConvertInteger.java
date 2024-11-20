package Assignmentday2;
import java.util.*;

public class ConvertInteger {
	public static void convertingToString() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer value");
		int integertype=sc.nextInt();
		System.out.println("enter byte value");
		byte bytetype=sc.nextByte();
		System.out.println("enter short value");
		short shorttype=sc.nextShort();
		System.out.println("enter float value");
		float floattype=sc.nextFloat();
		System.out.println("enter double value");
		double doubletype= sc.nextDouble();
		System.out.println("enter long value");
		long longtype=sc.nextLong();
		
		String inttostring = String.valueOf(integertype);
		String bytetostring = String.valueOf(bytetype);
		String shorttostring = String.valueOf(shorttype);
		String floattostring = String.valueOf(floattype);
		String doubletostring = String.valueOf(doubletype);
		String longtostring = String.valueOf(longtype);
		
		System.out.println(inttostring);
		System.out.println(bytetostring);
		System.out.println(shorttostring);
		System.out.println(floattostring);
		System.out.println(doubletostring);
		System.out.println(longtostring);
		
	}
	public static void main(String[] args) {
		
		convertingToString();
	}
	}