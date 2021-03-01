
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello World,r";
		String s2 = "Hello CodeEval,E";
		int loc = 0;
		//reverseThroughString(s1);
		
		splitString(s1);
		splitString(s2);
		
		//System.out.print(loc);
		
	}
	static void splitString(String s){
		String fullString = s;
		String valueToFind = "";
		int locationOfComma = s.indexOf(',');
		int locationOfLetter;
		
		valueToFind = s.substring(locationOfComma+1, s.length());
		System.out.println(valueToFind + " :this is what we are looking for!!");

		
	}

	static void reverseThroughString(String s){
		int loc = 0;

		loc = s.lastIndexOf(s.charAt(s.length()-1), s.length());
		
		System.out.println(loc);
	}
}