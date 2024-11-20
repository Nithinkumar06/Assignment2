
package Assignmentday2;

public class sort {
public static void main(String[] args) {
	int[] array = {9,7,1,3,55};
	for(int i=0;i<array.length;i++) {
		for(int j=i+1;j<array.length;j++) {
		int temp=0;
		if(array[i]>array[j]) {
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			
		}
			
		}
		System.out.print(array[i]);
	
	}
}
}