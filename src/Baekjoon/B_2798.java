package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_2798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		int result = 0;
		int nowMin = 0;
		int min = 300000;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				for(int k=j+1; k<N; k++) {
					if(arr[i] + arr[j] + arr[k] <= M) {
						result = arr[i] + arr[j] + arr[k];
						nowMin = M - result;
						if(min > nowMin) {
							min = nowMin;
						}
					}
			
				}
			}
			
		}
		System.out.println(M - min);
		
		
	}
}
