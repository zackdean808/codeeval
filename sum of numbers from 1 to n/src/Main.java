
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = 50;
		int tot = 0;
		int prt = 0;
		
		for(int i = 1; i < val; i++){
			int temp = i;
			int fp = temp * temp + 1;
			int sp = fp/2;
			prt = sp;
		}
		
		System.out.println(prt);

	}

}
