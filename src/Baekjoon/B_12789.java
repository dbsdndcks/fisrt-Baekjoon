package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class B_12789 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());// �л� ��
		
		Queue<Integer> q = new LinkedList<>();	// ��⿭
		Stack<Integer> s = new Stack<>();	//�߰� ��⿭
		
		StringTokenizer st = new StringTokenizer(in.readLine()," ");
		for(int i=0;i<N;i++) {
			q.offer(Integer.parseInt(st.nextToken()));
		}
		
		int start = 1;	// ���� �Դ� ����
		
		while(!q.isEmpty()) {	// ��⿭���� �л����� ������ �� ����
			if(q.peek() == start) {	//���ĸԴ� �������
				q.poll();
				start++;
			}else if(!s.isEmpty() && s.peek() == start) {	// ���õ� ��⿭�̹Ƿ� ���� �˻絵 �ؾ� �Ѵ�.
				s.pop();
				start++;
			}else {	// ť ��⿭�� �ִ� �л��� ������ start�� �������� ������
				s.push(q.poll());	// ť���� ���� ���ÿ� ����ִ´�.
			}
		}
		while(!s.isEmpty()) {	// ���ÿ� �л� �����ִٸ� ���� ������ �������� Ȯ��
			if(s.peek() == start) {	// ���� ���� ����
				s.pop();
				start++;
			}else {	// ���� ���� Ʋ��
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");
		
		
	}

}
