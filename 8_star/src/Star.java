
public class Star {

	public static void main(String[] args) {
		//별찍기
		for(int j=0; j<10; j++) {
			for(int i=0; i<10; i++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int j=0; j<10; j++) {
			for(int i=0; i<j+1; i++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int j=0; j<10; j++) {
			for(int i=0; i<10-j; i++) {
				System.out.printf("%c", '☆');
			}
			System.out.println();
		}
	}
	/*
	 * 결과
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	------------
	☆
	☆☆
	☆☆☆
	☆☆☆☆
	☆☆☆☆☆
	☆☆☆☆☆☆
	☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆☆
	------------
	☆☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆☆
	☆☆☆☆☆☆☆
	☆☆☆☆☆☆
	☆☆☆☆☆
	☆☆☆☆
	☆☆☆
	☆☆
	☆
	*/
}
