import java.lang.Object;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "100";
		String s1 = "20";
		String s2 = "10";
		String s3 = "2,3,4,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,8";
		String s4 = "2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,8";
		boolean t;
		//int test = Integer.parseInt(s);
		
		System.out.println(s3.compareTo(s4));
		
		calcPrimes(Integer.parseInt(s));
	}
	//checks to see if the number is prime
	public static boolean isPrime(int n) {
		   if (n <= 1) {
		       return false;
		   }else if(n == 2){
			   return true;
		   }
		   for (int i = 2; i < n/2; i++) {
		       if (n % i == 0) {
		           return false;
		       }
		   }
		   return true;
		}
	/**
	 * Function that takes all the primes from 2 to the value
	 * Takes those values and creates a string this allows the next function to 
	 * easily format and out put the values. 
	 * @param val
	 */
	public static void calcPrimes(int val){
		String s ="";
		for(int i = 2; i <= val; ++i){
			if(isPrime(i)){
				s += i + ",";
			}
		}
		//System.out.println(s);
		// next funciton call goes here, remove sys out.
		formatPrimes(s);
	}
	/**
	 * 
	 * @param strOfPrimes
	 */
	public static void formatPrimes(String strOfPrimes){
		final int FIXEDWIDTH = 80;
		int l = strOfPrimes.length() - 1;
		//System.out.println("Length is : " + strOfPrimes + "After short: " + l);
		String subStr = (String) strOfPrimes.subSequence(0, l);
	//	String myWrappedString = WordUtils.wrap(subStr,FIXEDWIDTH);
		System.out.println(subStr);
	}

}
