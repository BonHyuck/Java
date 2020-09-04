import java.util.Scanner;
public class SWEA2056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<T+1; tc++) {
			String input = sc.next();
			String year = input.substring(0, 4);
			String month = input.substring(4, 6);
			String day = input.substring(6, 8);
			int monthInt = Integer.parseInt(month);
			int dayInt = Integer.parseInt(day);
			if(monthInt==1 || monthInt==3 || monthInt ==5 || monthInt==7 || monthInt==8 || monthInt==10 || monthInt==12) {
				if(dayInt <1 || dayInt > 31) {
					System.out.println(String.format("#%d -1", tc));
				}else {
					System.out.println(String.format("#%d %s/%s/%s", tc, year, month, day));
				}
			}else if(monthInt == 4 || monthInt==6 || monthInt==9 || monthInt==11) {
				if(dayInt <1 || dayInt > 30) {
					System.out.println(String.format("#%d -1", tc));
				}else {
					System.out.println(String.format("#%d %s/%s/%s", tc, year, month, day));
				}
			}else if(monthInt==2) {
				if(dayInt <1 || dayInt > 28) {
					System.out.println(String.format("#%d -1", tc));
				}else {
					System.out.println(String.format("#%d %s/%s/%s", tc, year, month, day));
				}
			}else {
				System.out.println(String.format("#%d -1", tc));
			}
		}
		
				
				
		
	}

}
