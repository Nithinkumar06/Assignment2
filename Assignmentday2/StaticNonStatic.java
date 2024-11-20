package Assignmentday2;

public class StaticNonStatic {
	int n;
	String m="I love you";
	char d='D';
	static String R ="I love you too";
	static int T =20;
	static char V='v';
	
	void static1() {
		//StaticNonStatic st = new StaticNonStatic();
		n=10;
		System.out.println(n);
		System.out.println(m);
		System.out.println(d);
		}
	static void Static2() {
		System.out.println(R);
		System.out.println(T);
		System.out.println(V);
	}
}
