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

		//create a file object
		File file = new File(in);
		
		//create FileWriter object that will write the file 
		FileWriter writer = new FileWriter(file);
		
		//create BufferedWiter that use the FileWriter object
		BufferedWriter bwriter = new BufferedWriter(writer);

		//create fileReader and BufferedReadrer objects
		FileReader fr = new FileReader(out);
		BufferedReader br = new BufferedReader(fr);
		String line;

		//BufferedReader reads file line and if its not empty the write it to new file
		while ((line = br.readLine()) != null) {
			bwriter.write(line);
			bwriter.newLine();
		}
		
		//close writer and reader objects
		br.close();
		bwriter.close();
	}

}
