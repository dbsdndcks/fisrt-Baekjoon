package น้มุ;

import java.util.Scanner;

public class B_10810 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int i = 0;
		int j = 0;
		int k = 0;
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[]buket = new int[N];
		
		for(int e=0 ; e<M ; e++) {
			i = sc.nextInt();
			j = sc.nextInt();
			k = sc.nextInt();
			for(int f=i ; f<j+1 ; f++) {
				buket[f-1] = k;
			}
		}
		
		for(int e=0; e<buket.length ; e++) {
				System.out.print(buket[e] + " ");
			}
		
	}

}
