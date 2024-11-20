package Assignmentday2;

public class StaticNonStaticBlocks {
	static{
		System.out.println("This is Static Block");
		System.out.println("I love you");	
	}
	{
		System.out.println("This is Non-Static Block");
		System.out.println("I love you too");
	}
	public static void main(String[] args) {
		StaticNonStaticBlocks Block = new StaticNonStaticBlocks();
		System.out.println("I hate you!");
	}
}
