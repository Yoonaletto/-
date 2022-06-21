import java.util.InputMismatchException;
import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// 문제: 입력으로 자연수 N을 받고, 출력으로 N 이하의 모든 완전수를 출력하는 코드를 작성하라.
		// 완전수란? 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 수
		// 예. 6의 약수는 1, 2, 3인데 이 셋을 더하면 6이므로 6은 완전수다.
		System.out.println("자연수 하나를 입력해주세요.");
		while(true) { // 자연수가 아닌 값을 입력했을 때 반복해서 입력하도록 while문을 사용함.
			try {
				Scanner num = new Scanner(System.in);
				int input = num.nextInt();
				int sum = 0;
				for(int k=1; k<=input; k++) { // 입력 받은 값 이하의 모든 수 반복
					sum = 0;
					for(int i=1; i<k; i++) { // 해당 값의 약수 찾기
						if(k % i == 0) sum = sum + i;	
					}	
					if(sum == k) {
						System.out.println("완전수: " + k);
					}
					
				}
				num.close();
				break; // 자연수를 입력했다면 종료
			} catch (InputMismatchException e) { // 숫자가 아닌 값을 입력했을 때 예외처리
				System.out.println("자연수만 입력하세요.");
				continue; // 반복문의 처음으로 돌아가서 다시 입력하도록 함. 
			}	
		}
//		결과
//		자연수 하나를 입력해주세요.
//		앙
//		자연수만 입력하세요.
//		앙
//		자연수만 입력하세요.
//		500
//		완전수: 6
//		완전수: 28
//		완전수: 496
	}
}
