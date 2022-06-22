import java.util.HashSet;
import java.util.TreeSet;
public class Arrayoverlap {

	public static void main(String[] args) {
//		이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌
//		1. 김씨와 이씨는 각각 몇 명 인가요?
//		2. "이재영"이란 이름이 몇 번 반복되나요?
//		3. 중복을 제거한 이름을 출력하세요.
//		4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.
		String[] array = {"이유덕","이재영","권종표","이재영","박민호","강상희","이재영","김지완","최승혁","이성연","박영서","박민호","전경헌","송정환","김재성","이유덕","전경헌"};
//		1. 김씨와 이씨 각각 몇 명?
		int kim = 0; int lee = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i].charAt(0)=='김') kim++;
			if(array[i].charAt(0)=='이') lee++;
		}
		System.out.println("김씨: " + kim + "명, 이씨:" + lee + "명");
//		2. 이재영이란 이름 몇 번 반복?
		int leejaeyoung = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i].equals("이재영")) leejaeyoung++; // 문자열 비교시 ==로 하면 주소를 비교하고 equals 사용시 값 자체를 비교
		}
		System.out.println("이재영: " + leejaeyoung + "번 반복");
//		3. 중복 제거
		HashSet<String> hashset = new HashSet<>(); // HashSet 중복 데이터 제거
		for(String name : array) {
			hashset.add(name);
		}
		System.out.println(hashset);
//		4. 중복을 제거한 이름을 오름차순으로
		TreeSet<String> treeset = new TreeSet<>(); // TreeSet 오름차순 데이터 정렬
		treeset.addAll(hashset);
		System.out.println(treeset);
	}
}