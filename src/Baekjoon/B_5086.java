package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B_5086 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if(A == 0 && B == 0) {
				break;
			}
			else if(B % A != 0 && A % B != 0) {
				System.out.println("neither");
			}else if(B % A == 0) {
				System.out.println("factor");
			}else if(A % B == 0) {
				System.out.println("multiple");
			}
		}
	}		
}	
	



