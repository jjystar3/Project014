package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		try {
			int num = scanner.nextInt(); // nextInt는 정수값을 입력받는데, 다른 타입의 값이 들어와서 에러남
		} catch (InputMismatchException e) {
			System.out.println(e);
		}

	}

}
