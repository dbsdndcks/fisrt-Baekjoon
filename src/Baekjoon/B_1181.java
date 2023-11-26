package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class B_1181 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> list = new ArrayList<String>();
		
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            // 중복된 단어를 제거하고 리스트에 추가
            if (set.add(word)) {
                list.add(word);
            }
        }
		
		Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
		for(String word : list) {
			System.out.println(word);
		}
	}	
	

}
