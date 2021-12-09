package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		List<String> db = new ArrayList<String>();
		
		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}

			db.add(line);
		}

		br.close();

		db.add("경태윤,010-0000-0000,042-000-0000");

		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB2.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for (String newline : db) {
			bw.write(newline);
			bw.newLine();
		}

		bw.close();
	}

}
