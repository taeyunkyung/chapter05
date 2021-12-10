package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		List<Person> pList = new ArrayList<Person>();

		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine();
			if (line == null) {
				break;
			}

			String[] dArray = line.split(",");
			String dname = dArray[0];
			String dhp = dArray[1];
			String dcompany = dArray[2];

			Person p01 = new Person(dname, dhp, dcompany);
			pList.add(p01);
		}

		br.close();
		
		listPrint(pList);

		Scanner sc = new Scanner(System.in);
		System.out.println("데이터를 입력하세요.(종료 q)");

		while (true) {
			String enter = sc.nextLine();
			if (enter.equals("q")) {
				break;
			}

			String[] eArray = enter.split(",");
			String ename = eArray[0];
			String ehp = eArray[1];
			String ecompany = eArray[2];

			Person p02 = new Person(ename, ehp, ecompany);
			pList.add(p02);
		}

		sc.close();

		listPrint(pList);

		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB3.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		for (Person print : pList) {			
			bw.write(print.bwrite());
			bw.newLine();
		}

		bw.close();
	}
	
	public static void listPrint(List<Person> pList) {
		for (int i = 0; i < pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
	}

}
