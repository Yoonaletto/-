
public class Thenumberof {

	public static void main(String[] args) {
		
		int[] strNum = new int[10];
		
		for(int i=1; i<=1000; i++) {
			strNum[i%10]++; //일의 자리
			if(i>=10) {
				strNum[i/10%10]++; //십의 자리
			}
			if(i>=100) {
				strNum[i/100%10]++; //백의 자리
			}
			if(i==1000) {
				strNum[i/1000%10]++; //천의 자리	
			}
		}
		for(int k=0; k<=9; k++) {
			System.out.println(k + ": " +strNum[k]);
		}
//		결과
//		0: 192
//		1: 301
//		2: 300
//		3: 300
//		4: 300
//		5: 300
//		6: 300
//		7: 300
//		8: 300
//		9: 300
	}

}
