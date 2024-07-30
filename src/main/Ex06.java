package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex06 {

	public static void main(String[] args) {
		
		// 파일을 열어서 읽고 쓰틑 입력 클래스
		try {
			FileInputStream fis = new FileInputStream("src/main/a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}

}
