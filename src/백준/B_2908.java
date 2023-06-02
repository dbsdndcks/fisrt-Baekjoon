package น้มุ;

import java.util.Scanner;

public class B_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		s1 = s1.substring(2,3) + s1.substring(1,2) + s1.substring(0,1);
		s2 = s2.substring(2,3) + s2.substring(1,2) + s2.substring(0,1);
		
		int ns1 = Integer.parseInt(s1);
		int ns2 = Integer.parseInt(s2);
		
		if(ns1 > ns2) {
			System.out.println(ns1);
		}else {
			System.out.println(ns2);
		}
	}

}
