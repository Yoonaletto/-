import java.util.Scanner;
public class NtoMplus {

	public static void main(String[] args) {
		// 정수 N과 M을 입력받아 N부터 M까지 숫자의 합을 구하라.(반복문 사용X)
		System.out.println("첫번째 숫자를 입력하세요.");
		Scanner n = new Scanner(System.in);
		int numN = n.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		Scanner m = new Scanner(System.in);
		int numM = m.nextInt();
		int result=0;
		
		result = (Math.abs(numN - numM) + 1) *(numN + numM) / 2;
		
		System.out.println(numN + "부터" + numM + "까지의 합: " + result);
		n.close(); m.close();
	}
//	결과
//	첫번째 숫자를 입력하세요.
//	-2
//	두번째 숫자를 입력하세요.
//	3
//	-2부터3까지의 합: 3
}
