import java.util.Scanner;
public class SWEA2068 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			// 우선 최대값을 받을 변수 선언
			int maxNumber = 0;
			// 숫자는 10개가 들어온다고 했다.
			for(int i=0; i<10; i++) {
				// 숫자 1개 입력받기
				int inputNumber = sc.nextInt();
				// 바로 최대값 변수와 비교
				if (maxNumber < inputNumber) {
					maxNumber = inputNumber;
				}
			}
			System.out.println(String.format("#%d %d", test_case, maxNumber));
		}
	}

}
