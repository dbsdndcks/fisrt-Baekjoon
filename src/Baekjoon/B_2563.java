package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2563 {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int arr[][] = new int[100][100];
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
			for(int a = A; a < (A+10); a++) {
				for(int b = B; b < (B+10); b++) {
					arr[a][b] = 1;
				}
			}
		}
		
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				if(arr[i][j] == 1) {
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
