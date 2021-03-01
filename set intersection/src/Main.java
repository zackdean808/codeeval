
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "1,2,3,4,5;5,6,7,8";
		String s1 = "";
		String s2 = "";
		String s3 = "";
		String[] strArr;
		int len = s.length() -1;
		int pos = s.indexOf(';');
		s1 = s.substring(pos + 1, s.length());
		
		strArr = s.split(";");
		
		for (String string : strArr) {
			System.out.println(string);
		}

		
	}

}
