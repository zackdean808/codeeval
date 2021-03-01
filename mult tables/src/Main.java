import java.text.DecimalFormat;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 1; i <13; i++){
			for(int k = 1; k < 13; k++){
				DecimalFormat format = new DecimalFormat("#.###");
			    String a = format.format(i*k).toString();
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
}
