package Assignmentday2;

public class ArrayElements {

	public static void ArrayElements1() {
		int[] A = {2,4,1,5,7,8};
		int[] B = new int[6];
		for(int i=0;i<A.length;i++) {
			B[i] = A[i];
			System.out.println(B[i]);
		}

	}
	public static void main(String[] args) {
		ArrayElements1();
	}


}
