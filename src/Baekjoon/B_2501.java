package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2501 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count = 0;
		String arr[] = new String[N];
		
		for(int i=1 ; i<=N ; i++) {
			if(N % i == 0) {
				arr[count] = String.valueOf(i);
				count++;
			}
		}
		
		if(arr[K-1] == null) {
			System.out.println(0);
		}else {
			System.out.println(arr[K-1]);
		}
		
		
		
	}

}
