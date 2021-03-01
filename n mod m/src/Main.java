
public class Main {

	public static void main(String[] args) {

		
		String s1 = "10,6";
		String s2 = "22,4";
		
		spiltStrings(s1);
		spiltStrings(s2);

	}
	
	static void spiltStrings(String s){
		int length = s.length();
		int pos = s.indexOf(',');
		String strN = "";
		String strM = "";
		int n = 0;
		int m = 0;
		
		
		strN = (String) s.subSequence(0, pos);
		strM = (String) s.subSequence(pos+1, length);
		
		System.out.println(strN + " " + strM);
		
		convert(strN, strM);
	
	
	}

	static void convert(String strN, String strM)
			throws NumberFormatException {
		int n;
		int m;
		n = Integer.parseInt(strN);
		m = Integer.parseInt(strM);
		calculate(n, m);
	}
	
	static void calculate(int n, int m){
		
		int mod = 0;
		
		if (m != 0) {
			mod = n % m;
			System.out.println(mod);
		}else {
			System.out.println("error");
		}
	}

}
