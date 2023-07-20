package Baekjoon;

import java.util.Scanner;

public class B_2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int range = 2;
		
		int N = sc.nextInt();
		if(N == 1) {
			System.out.println(1);
		}else {
			while(range < N) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
		
	}

}
