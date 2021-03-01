import java.util.Stack;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test ="1535";
		String t1 ="5353535357878786434500055553333123456789098765432153535353578787864345000555533331234567890987654321";
		
		convertStringToInt(test);
		convertStringToInt(t1); 

	}
	static void convertStringToInt(String s){
		int numFromArr = 0;
		int len = s.length();
		String[] stringArray = new String[len];
		for(int i = 0; i < len; ++i){	
			stringArray[i] = s.substring(i, i+1);
			numFromArr += Integer.parseInt(stringArray[i]);
		}
		System.out.println(numFromArr);
	}	
}
