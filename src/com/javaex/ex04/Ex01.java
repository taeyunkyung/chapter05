package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String line = br.readLine();			
			if(line==null) { // 순서 주의
				break;
			}
			
			String str[] = line.split(","); // dataArray
			
			// String name = dataArray[0];
			// String hp =  dataArray[1];
			// String company = dataArray[2]; 	
			
			System.out.println("이름: "+str[0]); // name
			System.out.println("핸드폰: "+str[1]); // hp
			System.out.println("회사: "+str[2]); // company
			System.out.println("");
		}
		
		br.close();
	}

}
