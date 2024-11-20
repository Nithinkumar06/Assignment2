package Assignmentday2;
import java.util.*;

public class GreatestSmallest12 {

	public static  void Greatest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value ");
		int a = sc.nextInt();
		System.out.println("Enter b value ");
		int b = sc.nextInt();
		System.out.println("Enter c value ");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is Greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is Greater");
		}
		else {
			System.out.println("c is Graeter");
					
				}
		if(a<b && a<c) {
			System.out.println("a is Smaller");
		}
		else if(b<a && b<c) {
			System.out.println("b is Smaller");
		}
		else {
			System.out.println("c is Smaller");
					
				}
		
				
		
			}
	public static void main(String[] args) {
		Greatest();
	}
			
	}

