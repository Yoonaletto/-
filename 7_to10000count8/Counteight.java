
public class Counteight {

	public static void main(String[] args) {
		// 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
		int count=0;
		for(int i=1; i<=10000; i++) {
			if(i%10 == 8) count++; //일의 자리
			if(i/10%10 == 8) count++; //십의 자리
			if(i/100%10 == 8) count++; //백의 자리
			if(i/1000%10 == 8) count++; //천의 자리	
		}
		System.out.println("8개수: " + count);
	}
//	결과
//	8개수: 4000
}
