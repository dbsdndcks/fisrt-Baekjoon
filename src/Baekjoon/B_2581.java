package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = N;
		int sum = 0;
		
		for(int i = M; i <= N; i++) {
			//�Ҽ����� �Ǻ��� ����
			boolean check = true;
			//1�� �� �� ������ 1�� �Ҽ��� �ƴϱ⿡ chech�� false ����.
			if(i == 1) check = false;
			
			for(int j = 2; j < i; j++) {
				//������ �������ٸ� check�� false �����ϰ� �ݺ� ����
				if(i % j == 0) {
					check = false;
					break;
				}
			}
			
			//check�� true��� �Ǽ��̴� ���ϰ�, �ּڰ� ����.
			if(check) {
				if(min > i) min = i;
				sum += i;
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum + "\n" + min);
		}
	}

}
