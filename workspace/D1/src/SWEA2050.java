import java.util.Scanner;
public class SWEA2050 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] text = sc.next().toCharArray();
		String result = "";
		for(char i: text) {
			result = result.concat(String.valueOf(alpha.indexOf((String.valueOf(i)))+1)).concat(" ");
		}
		System.out.println(result);	
	}

}
