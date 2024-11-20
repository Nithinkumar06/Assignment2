package Assignmentday2;
import java.util.Arrays;


public class SubString {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int b[]=Arrays.copyOfRange(a, 0, 7);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+",");
		}
	}
	}
