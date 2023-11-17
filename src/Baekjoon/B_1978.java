package Baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class B_1978 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 0;
		
		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			int count = 0;
			for(int j=1; j<=A; j++) {
				if(A % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				num++;
			}
		}
		System.out.println(num);
		
	}

}
