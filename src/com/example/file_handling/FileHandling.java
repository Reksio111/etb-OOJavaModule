package com.example.file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) throws IOException {

		File file = new File("plain.txt");
		FileWriter writer = new FileWriter(file);
		writer.write("Weather info:");
		writer.write("\nTemperature: 8 degree");
		writer.write("\nReal feely: 3 degree");
		writer.write("\nWind speed: 17 km/h");
		writer.close();

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;

		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
