
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s0 = "2";
		String s2 = "5";
		String s1 = "12";
		
		checkInput(s0);
		checkInput(s1);
		checkInput(s2);
		

	}
	static void checkInput(String s ){
		int test = Integer.parseInt(s);
		if(test == 0){
			System.out.println(0);
		}else if(test == 1){
			System.out.println(1);
		}else if(test == 2){
			System.out.println(1);
		}else{
			fibonaccicalc(s);
		}
		
	}
	
	static void fibonaccicalc(String lastInSequence){
		
		int[] fibonacciSequence = new int[Integer.parseInt(lastInSequence)];
		fibonacciSequence[0] = 0;
		fibonacciSequence[1] = 1;
		fibonacciSequence[2] = 2;
		
		for(int i = 3; i < fibonacciSequence.length; i++) {
			fibonacciSequence[i] = fibonacciSequence[i-1] + fibonacciSequence[i-2];
			//System.out.println(fibonacciSequence[i]);
		}

		System.out.println(fibonacciSequence[fibonacciSequence.length -1]);
		
		
	}

}
