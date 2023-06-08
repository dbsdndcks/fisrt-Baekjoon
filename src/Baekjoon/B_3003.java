package Baekjoon;

import java.util.Scanner;

public class B_3003 {

	public static void main(String[] args) {
		int king = 1;
		int queen = 1;
		int lock = 2;
		int bishop = 2;
		int night = 2;
		int phon = 8;
		
		Scanner sc = new Scanner(System.in);
		int whiteking =king - sc.nextInt();
		int whitequeen =queen - sc.nextInt();
		int whitelock =lock - sc.nextInt();
		int whitebishop = bishop - sc.nextInt();
		int whitenight = night - sc.nextInt();
		int whitephon =  phon - sc.nextInt();
		
		System.out.print(whiteking + " " + whitequeen + " " + whitelock + " " + whitebishop + " " + whitenight + " " +  whitephon);
	}

}
