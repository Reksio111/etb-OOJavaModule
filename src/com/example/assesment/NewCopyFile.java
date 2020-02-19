package com.example.assesment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NewCopyFile {


	public NewCopyFile() {

	}
	
	public void copyFile(String in, String out) throws IOException {
		
		File file = new File(in);
		FileWriter writer = new FileWriter(file);
		BufferedWriter bwriter=new BufferedWriter(writer);
		

		FileReader fr = new FileReader(out);
		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line = br.readLine()) != null) {
			bwriter.write(line);
			bwriter.newLine();
		}
		br.close();
		bwriter.close();
	}
		
		
	
}
