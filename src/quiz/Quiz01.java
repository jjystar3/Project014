package quiz;

public class Quiz01 {

	public static void main(String[] args) {

		
		try {
			int num = 5/0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); //에러메세지만 출력
			e.printStackTrace(); // 에러메세지, 에러위치 함께 출럭
		}

		System.out.println("프로그램이 정상적으로 종료되었습니다");
	}

}
