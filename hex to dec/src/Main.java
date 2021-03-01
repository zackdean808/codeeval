
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String hexstr1 = "11";
		String subStr = "";
		int decValue = 0;
		int powInc = 0;
		int hexVal = 0;
		
		for (int i = hexstr1.length(); i > 0; i--) {
			
			subStr = hexstr1.substring(i - 1);
			decValue = Integer.parseInt(subStr);
			hexVal += Math.pow(decValue, powInc);
			++powInc;
			
		}
		
		System.out.println(hexVal);
		
	}
}