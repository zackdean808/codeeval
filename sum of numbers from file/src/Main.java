
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArr = { "1", "50", "525"};
		int sumofnums = 0;
		for (int i = 0; i < strArr.length; i++) {
			sumofnums+= Integer.parseInt(strArr[i]);
		}
		System.out.println(sumofnums);
	}

}
