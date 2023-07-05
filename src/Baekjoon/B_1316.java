package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class B_1316 {
 
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
	public static void main(String[] args) throws IOException{
 
		int count = 0;
		int N = Integer.parseInt(br.readLine());
 
		for (int i = 0; i < N; i++) {
			if (check() == true) {
				count++;
			}
		}
		System.out.println(count);
	}
 
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// i ��° ���� ���� (���� ����)
			
			
			// �ռ� ���ڿ� i ��° ���ڰ� ���� �ʴٸ�?
			if (prev != now) {		
				
				// �ش� ���ڰ� ó�� ������ ��� (false �� ���)
				if ( check[now - 'a'] == false ) {
					check[now - 'a'] = true;		// true �� �ٲ��ش�
					prev = now;					// ���� ���� ���� prev �� �ٲ��ش� 
				}
	 
				// �ش� ���ڰ� �̹� ���� ���� �ִ� ��� (�׷�ܾ �ƴϰ� ��) 
				else {
					return false;	//�Լ� ����
				}
			}
	        
	        
			// �ռ� ���ڿ� i ��° ���ڰ� ���ٸ�? (���ӵ� ����)
			// else ���� ��� ��
			else {
				continue;
			}
		}    
		return true;
	}
}
