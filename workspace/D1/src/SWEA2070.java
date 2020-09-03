import java.util.Scanner;
public class SWEA2070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; test_case++) {
			int firstNumber = Integer.parseInt(sc.next());
			int secondNumber = Integer.parseInt(sc.next());
			String result = "";
			if(firstNumber > secondNumber) {
				result = ">";
			}else if(firstNumber == secondNumber) {
				result = "=";
			}else if(firstNumber < secondNumber) {
				result = "<";
			}
			System.out.println(String.format("#%d %s", test_case, result));
		}
		
	}

}
