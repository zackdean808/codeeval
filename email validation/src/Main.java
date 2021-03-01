import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String e1 = "foo@bar.com";
		String e2 = "adfafafdadfasdfasdfadsfasdf.codeeval";
		String e3 = "adminfasdfadsfadsf#codeeval.com";
		String e4 = "good123@bad.com";
		String e5 = "adnamariqq@gmail";
		String b1 = "";
		String e6 = "adfadf@adfasdfasd.adsfasdf";
		
		checkLine(b1);
		checkLine(e3);
		checkLine(e6);
		checkLine(b1);

	}
	
	static void checkLine(String line){
		if(line.equals("")){
			
		}else{
			isItValid(line);
		}
	}
	/*
	 * 
	 */
	static void isItValid(String email){
		Pattern pattern;
		Matcher matcher;
		//found the email pattern online.
		@SuppressWarnings("unused")
		String EMAIL_PATTERN = 
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String EMAIL ="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9\\-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$";
		
		pattern = Pattern.compile(EMAIL);
		matcher = pattern.matcher(email);
		matcher.matches();
		System.out.println(matcher.matches());
		
	}

}
