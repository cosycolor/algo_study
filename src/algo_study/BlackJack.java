package algo_study;

import java.util.Scanner;

public class BlackJack {
	static int N;
	static int M;
	static int[] arr;
	
	static int result;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		int result = blackJack();
		System.out.println(result);
		
	}
	public static int blackJack() {
		
		for(int i = 0;i<N-2;i++) {
			for(int j = i+1;j<N-1;j++) {
				for(int k = j+1;k<N;k++) {
					
					 int temp = arr[i]+arr[j]+arr[k];
					 
					 if(temp ==M) {
						 return temp;
					 }
					 if(temp<M && temp > result) {
						 result = temp;
						 
					 }
					
				}
			}
		}
		return result;
	}
}
