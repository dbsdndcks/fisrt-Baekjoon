package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_24265 {
		public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Long N = Long.parseLong(br.readLine());
			
			Long num = 0L;
			for(long i=1; i<N; i++) {
				num += i;
			}
			System.out.println(num);
			System.out.println(2);
		
	}
}