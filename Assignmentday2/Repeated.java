package Assignmentday2;

public class Repeated {
		public static void main(String[] args) {
		char[] ch= {'a','c','a','t','g',' '};
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
				if(ch[i+1]!=ch[i]) {
				System.out.print(ch[i]+":"+count+" ");
			}
		}
		

		}
	}
		}


