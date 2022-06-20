
public class Thenumberof {

	public static void main(String[] args) {
		
		int[] strNum = new int[10];
		for(int i=1; i<=1000; i++) {
			if(i<=9) {
				strNum[i%10]++; //일의 자리
			}
			if(i>=10 && i<=99 ) {
				strNum[i/10]++; //십의 자리
				strNum[i%10]++;
			}
			if(i>=100 && i<=999) {
				strNum[i/100]++; //백의 자리
				strNum[i%100/10]++;
				strNum[i%10]++;
			}
			if(i==1000) {
				strNum[i/1000]++; //천의 자리
				strNum[i%1000/100]++;
				strNum[i%100/10]++;
				strNum[i%10]++;
			}
		}
		for(int k=0; k<=9; k++) {
			System.out.println(strNum[k]);
		}
	}

}
