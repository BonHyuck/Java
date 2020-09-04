import java.util.Scanner;
public class SWEA2058 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		while(N > 0) {
			result += N % 10;
			N = N / 10;			
		}
		
		System.out.println(String.format("%d", result));

	}

}
