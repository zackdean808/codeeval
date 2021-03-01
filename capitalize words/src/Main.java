import java.lang.Character;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "this";
		char startingWith;
		Character subChar;
		int len = 0;
		
		
		startingWith = str1.charAt(0);
		
		if (!Character.toUpperCase(startingWith)) {
			
		}
		
		
		//str1 = splitStr(str1);
		System.out.println(startingWith);
	}
	
	private static String splitStr(String s){
		String[] strArr;
		String toSplit = " ";
		String rtn = "";
		String s1 = "";
		strArr = s.split(toSplit);
		
		for (int i = 0; i < strArr.length; i++) {
			rtn = capitalizeLetter(strArr[i]);
			System.out.println(rtn);
		}
		
		return s1 += rtn;
	}
	
	private static String capitalizeLetter(String s){
		
		s.toUpperCase();
		
		return s;
	}

}
