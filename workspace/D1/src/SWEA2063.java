import java.util.Scanner;
public class SWEA2063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수의 개수
		int N = sc.nextInt();
		// 받은 정수를 담을 배열
		int[] numberArray = new int[N];
		// 배열 요소 채우기
		for(int i=0; i<N; i++) {
			numberArray[i] = sc.nextInt();
		}
		
		// 정렬시작
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				if (numberArray[i] >= numberArray[j]) {
					int temp = numberArray[i];
					numberArray[i] = numberArray[j];
					numberArray[j] = temp;
				}
			}
		}
		
		System.out.println(String.format("%d", numberArray[N/2]));
	}

}
