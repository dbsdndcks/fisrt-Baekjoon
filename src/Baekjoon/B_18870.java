package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B_18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[]arr = new int[N];
		int[]secondArr = new int[N];
		HashMap<Integer, Integer>rankingMap = new HashMap<Integer, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			secondArr[i] = arr[i] = Integer.parseInt(st.nextToken());
			}
		
		Arrays.sort(secondArr);
		int rank = 0;
		for(int v : secondArr) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int key : arr) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(" ");
		}
		
		System.out.println(sb);
	}
}
