import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated methods
		
		Stack st = new Stack();
		String str = "1 2 3 4";
		String str1 = "10 -2 3 4";
		String str5 = "11 10 9 -8 7 6 -5 4 3 2 1";
		
		convertStringToInt(st, str);
		altPopStack(st);
		clearStack(st);
		System.out.println();
		convertStringToInt(st, str1);
		altPopStack(st);
		clearStack(st);
		System.out.println();
		convertStringToInt(st, str5);
		altPopStack(st);
		clearStack(st);
		
		
		
	}
	//clears stack
	static void clearStack(Stack st){
		while(!st.empty()){
			st.pop();
		}
	}
	
	//pushes value to the stack
	static void pushStack(Stack st, int p){
		st.push(new Integer(p));
	}
	// pops value from stack and prints it out
	static void popStack(Stack st){
	    Integer fromStack = (Integer) st.pop();
	    System.out.print(fromStack + " ");

	}
	//alternates popStack and pop call to print alternating numbers from stack
	static void altPopStack(Stack st){
		int count = 0;
		
		while (!st.empty()) {
			if (count % 2 ==0) {
				popStack(st);
			}
			else {
				st.pop();
			}
			count++;
		}
	}
	//takes string and parses the numbers from the string
	// Then calls function to push numbers to the stack
	static void convertStringToInt(Stack st, String s){
		String[] stringArray;
		String delms = "[ ]";
		int numFromArr = 0;
		
		stringArray = s.split(delms);
		
		for(int i = 0; i < stringArray.length; ++i){
			numFromArr = Integer.parseInt(stringArray[i]);
			pushStack(st, numFromArr);
		}
		
	}		// end of function
}			// end of class























