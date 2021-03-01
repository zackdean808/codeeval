import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		String s = "Hello World";
		String s1 = "Hello CodeEval";
		String s2 = "This is a test";

		// System.out.println(flip(s));
		//System.out.println(flip(s1));
		
		flip(s);
		System.out.println();
		flip(s1);
		System.out.println();
		flip(s2);
	}
	
	static void flip(String s){

		String[] myStrArr;
		String delms = "[ ]";
		
		myStrArr= s.split(delms);
		
		for(int i = myStrArr.length -1 ; i >= 0; i-- ){
			System.out.print(myStrArr[i] + " ");
		}
	}
}
