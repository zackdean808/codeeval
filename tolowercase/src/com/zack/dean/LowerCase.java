package com.zack.dean;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LowerCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
	    File file = new File(args[0]);
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	        String[] lineArray = line.split("\\s");
	        if (lineArray.length > 0) {
	            //Process line of input Here

	    		System.out.println(line.toLowerCase());

	        }
	    }
		
	}

}
