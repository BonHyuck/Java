import java.util.Scanner;
public class SWEA2047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String text = sc.next().toUpperCase();
//		System.out.println(text);
		char[] text = sc.next().toCharArray();
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
		String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";
		for(char i:text) {
			if (lowerCase.indexOf(String.valueOf(i)) >= 0) {
				result = result.concat(String.valueOf(upperCase.charAt(lowerCase.indexOf(String.valueOf(i)))));
			}else {
				result = result.concat(String.valueOf(i));
			}
		}
		System.out.println(result);
	}

}
