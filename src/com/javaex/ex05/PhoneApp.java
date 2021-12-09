package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {

		// ArrayList 메모리에 올리기
		List<Person> pList = new ArrayList<Person>();
		
		// PhoneDB.txt 접속하기
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			// 한줄씩 읽기
			String line = br.readLine();
			if (line == null) { // 탈출
				break;
			}

			// ","로 구분하기
			String[] dataArray = line.split(",");
			String name = dataArray[0];
			String hp = dataArray[1];
			String company = dataArray[2];

			// Person객체를 생성하고 값 넣기
			Person p01 = new Person(name, hp, company);
			
			// ArrayList에 추가하기
			pList.add(p01);
		}

		// 테스트용 출력: pList.toString() 사용
		// 화면에 출력해보기 -
		// 방법 1: for(int i=0; i<pList.size(); i++) {System.out.println("이름: "+pList.get(i).getName(); ...}
		for (Person print : pList) {
			print.showInfo();
		}

		br.close();				
	}

}
