import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int even = 0;
		
		
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		while ((line = in.readLine()) != null) {
			String[] lineArray = line.split("\\s");
			if (lineArray.length > 0){
				
				even = Integer.parseInt(line);
				if (even % 2 == 0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			
			}
		}	

	}	

}