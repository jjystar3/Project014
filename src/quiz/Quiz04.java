package quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		String str = "1.23";
		
		try {
			int num = Integer.parseInt(str); //실수를 정수로 변환하려고 해서 에러남
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
	}

}
