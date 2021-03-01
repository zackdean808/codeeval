import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "thisTHIS";
		String s2 = "AAbbCCDDEE";
		String s3 = "N";
		String s4 = "UkJ";
			
		calc(s1);
		calc(s2);
		calc(s3);

	}
	static void calc(String str){
		int length = str.length();
		double totsCapitals = 0;
		double totsNonCaps = 0;
		
		for(int i = 0; i < length; i++){
			if(Character.isUpperCase(str.charAt(i))){
				totsCapitals += 1;
			}else{
				totsNonCaps++;
			}
		}
		
		double lower = (totsNonCaps / length) * 100;
		double upper = (totsCapitals / length)* 100;
		
		 DecimalFormat format = new DecimalFormat("0.00");
		 String l = format.format(lower).toString();
		 String u = format.format(upper).toString();
		
		
		
		System.out.println("lowercase: " + l + " uppercase: " + u);
		
		
	}
}
