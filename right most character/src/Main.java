
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello World,r";
		String s2 = "Hello CodeEval,E";
		int loc = 0;
		reverseThroughString(s1);
		
		
		
		//System.out.print(loc);
		
	}

	static void reverseThroughString(String s){
		int loc = 0;

		loc = s.lastIndexOf(s.charAt(s.length()-1), s.length()-2);
		
		System.out.println(loc);
	}
}