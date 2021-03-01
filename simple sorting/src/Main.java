import java.text.DecimalFormat;
import java.util.Arrays;


public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "-37.507 -3.263 40.079 27.999 65.213 -55.552";
		String s1 = "79.982 -22.080 -72.543 -56.806 -28.604 -31.253 10.258 -44.267 -90.050 -38.552 39.614 -0.131 79.731 36.022 -88.375 -76.571";
		String s2 = "-3.426 45.164 30.914 2.592 -82.427 -73.006 -72.438 -28.725 -23.943 -25.853 -59.273 -12.730 -24.573 -29.107 8.790 -64.581 -35.309 -21.068 78.363";
		String s3 = "15.212 -27.065 -34.722 98.769 14.162 -82.611 -26.097 13.099 -12.700 -46.876";
		String s4 = "-90.681 -86.794 100.573 -17.383 64.866 89.820 99.673 24.095 37.716 26.324 33.332 49.803 33.034 65.592 91.317 -18.691";
		
		
		spiltString(s2);
		System.out.println();
		spiltString(s1);
		System.out.println();
		spiltString(s3);
		System.out.println();
		spiltString(s);
		System.out.println();
		
		spiltString(s4);
	}
	
	public static void spiltString(String s){
		String[] strArr;
		strArr = s.split(" ");
		convertToDouble(strArr);
	}
	public static void convertToDouble(String[] strArr){
		
		//takes the length of string arr and creates a double arr of same length.
		double[] parsed = new double[strArr.length];
		double[] parsedFormatted = new double[strArr.length];
		
		//prints out all double values in the parsed array
		for(int i = 0; i < strArr.length; i++){
			parsed[i] = Double.parseDouble(strArr[i]); //converts string to double and puts it in the array
			System.out.print(parsed[i] + " ");
		}

		sortDoubleArr(parsed);
	}
	
	/**
	 * 1. Receive array from convert function
	 * 2. Sort the array of doubles
	 * 3. change formatting of decimal
	 * 
	*/
	public static void sortDoubleArr(double[] parsed){
		String[] parsedFormatted = new String[parsed.length];
		
		String finalString = "";
		
		Arrays.sort(parsed);
		
		for(int k = 0; k < parsed.length; k ++){
		    DecimalFormat format = new DecimalFormat("0.000");
		    String a = format.format(parsed[k]).toString();
		    parsedFormatted[k] = a;
			finalString += parsedFormatted[k] + " ";
		}
		System.out.print(finalString.trim());
	}

}
