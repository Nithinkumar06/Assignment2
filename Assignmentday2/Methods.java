package Assignmentday2;

public class Methods {
	public static void MethodWithoutReturnType() {
		System.out.println("this is method without return type");
		
	}
	public static int MethodWithReturnType() {
		int n=10;
		int m=20;
		int c=n+m;
		return c;	
	}
	public static void main(String[] args) {
		MethodWithoutReturnType();
		System.out.println(MethodWithReturnType());
		
	}

}
