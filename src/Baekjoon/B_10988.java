package Baekjoon;

import java.util.Scanner;

public class B_10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i) != str.charAt(str.length()-(i+1))) {
				System.out.println(0);
				return;
			}
			
			
		}
		System.out.println(1);
		
	}

}
