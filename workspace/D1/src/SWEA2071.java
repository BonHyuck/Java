import java.util.Scanner;
public class SWEA2071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;
			for(int i=0; i<10; i++) {
				int number = Integer.parseInt(sc.next());
				sum += number;
			}
			int result = sum/10;
			if (sum%10 >= 5) {
				result += 1; 
			}
			System.out.println(String.format("#%d %d", test_case, result));
		}

	}

}
