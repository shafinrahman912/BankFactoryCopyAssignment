package root;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Write a Java program that reads a text file named "input.txt" and counts the number of word in the file. Assume that word are separated by spaces.

public class WordCountOfFile {
	public static void main(String[] args) {
		String fileName = "input.txt";
		int wordCnt = 0;

		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {

			String ln;
			while ((ln = bufferedReader.readLine()) != null) {
				String[] word = ln.split(" ");
				wordCnt += word.length;
			}
		} catch (IOException e) {
			System.out.println("Error in the file: " + e.getMessage());
		}

		System.out.println("Number of words in the file: " + wordCnt);
	}
}
