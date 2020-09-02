// 10개의 수 중에 홀수만 더하기
import java.util.Scanner;
public class SWEA2072 {
	/*
	 * 
		3
		3 17 1 39 8 41 2 32 99 2
		22 8 5 123 7 2 63 7 3 46
		6 63 2 3 58 76 21 33 8 1 
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int result = 0;
			for(int i=0; i<10; i++) {
				String text = sc.next();
				if (Integer.parseInt(text) % 2 == 1){
					result += Integer.parseInt(text);
				}
			}
			
			System.out.println(String.format("#%d %d", test_case, result));
			

		}
	}

}
