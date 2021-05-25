package algo_study;

import java.util.Scanner;

public class Eureka {
	static int[] N =new int[1000];
	static int[] input;
	public static void main(String[] args) {
		//숫자배열 형성
		for(int i = 1;i <= 1000; i++) {
			N[i-1] = i*(i+1)/2;
		}
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		//테스트케이스배열생성
		input = new int[testCase];
		
		//반복문으로 세개 받고 그 수 넘겨줘서 확인
		for(int i=0;i<testCase;i++) {
			int check = eureka(sc.nextInt());
			
			if(check ==1) {
				input[i] = 1;
			}else {
				input[i] = 0;
			}
		}
		
		//출력
		for(int i = 0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		
	}
	static int eureka(int num) {
		int check = 0;
		for(int i = 0;i<N.length;i++) {
			for(int j = 0; j<N.length;j++) {
				for(int k = 0; k<N.length;k++) {
					if(N[i]+N[j]+N[k] == num) {
						
						return check =1;
					}
				}
			}
		}
		return check;
	}
}
