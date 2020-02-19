package com.example.file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PhoneNumbersCombination {
	private static char[][] letters = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
			{ 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

	public static void main(String[] args) throws IOException {

		String fileLocation = "phone numbers.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation));
		int[] number = new int[7];
		for(int i=0;i<number.length;i++) {
		//number[i]=character.getNumericValue(numberString.charAt(i))
		}
		for (int i = 0; i < letters[number[0]].length; i++) {
			for (int j = 0; j < letters[number[1]].length; j++) {
//string builder.append
			}

		}
		writer.close();

	}
}
