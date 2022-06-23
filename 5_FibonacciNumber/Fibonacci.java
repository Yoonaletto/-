import java.util.Scanner;
import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		// 자연수 N을 입력받아 N번째 항 까지의 피보나치수열을 구하시오. (0번째 항은 0)
		// 0, 1, 1, 2, 3, 5, 8...N
		// 0번째(numA)랑 1번째(numB) 더한 값이 2번째(result)
		System.out.println("숫자를 입력하세요.");
		Scanner num = new Scanner(System.in);
		int input = num.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>(); // 임의의 값을 받기 때문에 배열의 길이를 정할 수 없어 리스트를 이용했다.
		list.add(0);
		list.add(1);
		int result = 0;
		int numA=0; int numB=1;
		for(int i=2; i<=input; i++) {
			result = numA + numB;
			list.add(result);
			numA = numB;
			numB = result;
		}
		System.out.println(list);
		num.close();
//		결과
//		숫자를 입력하세요.
//		8
//		[0, 1, 1, 2, 3, 5, 8, 13, 21]
	}

}
