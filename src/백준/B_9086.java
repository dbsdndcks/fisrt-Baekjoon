package น้มุ;

import java.util.Scanner;

public class B_9086 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[]s = new String[num];
		sc.nextLine();
		for(int i=0 ; i<num ; i++) {
			String st = sc.nextLine();
			s[i] = st;
		}
		for(int i=0 ; i<s.length ; i++) {
			System.out.println(s[i].charAt(0) +""+ s[i].charAt(s[i].length()-1));
		}
	}

}
