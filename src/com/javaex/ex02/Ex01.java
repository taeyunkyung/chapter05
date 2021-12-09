package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {

		// buffered 사용: in, out을 컨트롤 하지 않겠다는 의미
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in); // 섞어쓰기 잘 안함

		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\bufferedimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);

		while (true) {			
			int data = bin.read();
			if (data == -1) {
				System.out.println("복사가 완료되었습니다." + data);
				break;
			}
			
			bout.write(data);
		}

		bin.close(); // in을 알아서 닫아줌
		bout.close(); // out을 알아서 닫아줌
	}

}
