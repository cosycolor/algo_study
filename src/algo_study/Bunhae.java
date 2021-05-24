package algo_study;

import java.util.Scanner;

public class Bunhae {
	static int N;
	
	static int result = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		Bunhae(N);
		System.out.println(result);
	}
	
	static void Bunhae(int n) {
		
		for(int i = 0;i<n;i++) {
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number %10;
				number /=10;
			}
			if(sum + i == n) {
				result = i;
				break;
			}
		}
		
	}
}
