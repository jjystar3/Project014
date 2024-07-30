package quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		String s = null; // 참조변수를 선언만 하고 생성은 안함
		
		try {
			System.out.println(s.length()); //빈 객체를 참조하여 에러남
		} catch (NullPointerException e) {
			System.out.println(e);
		}

		System.out.println("프로그램이 정상적으로 종료되었습니다");

	}

}
