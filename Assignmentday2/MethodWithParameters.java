package Assignmentday2;

public class MethodWithParameters {
	int a=10;
	int b=20;
	String c="Hyderabad";
	String d="durgam chervu";
	public void MethodPara(int a,int b) {
		int e=a+b;
		System.out.println(e);	
	}
	public void MethodWithout() {
		String c="Hyderabad";
		String d="durgam chervu";
		System.out.println(c.concat(d));
	}
    public static void main(String[] args) {
    	MethodWithParameters para = new MethodWithParameters();
    	para.MethodPara(10,20);
    	para.MethodWithout();
    	
	}
}

	


