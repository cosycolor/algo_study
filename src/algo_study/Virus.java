package algo_study;

import java.util.Scanner;

public class Virus {
	static int arr[][];
	static int node;
	static int line;
	static boolean visited[];
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		arr = new int[size+1][size+1];
		visited = new boolean[size+1];
		line = sc.nextInt();
		
		for(int i = 0; i<line;i++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			arr[r][c] = 1;
			arr[c][r] = 1;
		}
		dfs(1);
		for(int i = 0;i<visited.length;i++) {
			if(visited[i] == true) {
				count += 1;
			}
		}
		System.out.println(count-1);
	}
	public static void dfs(int start) {
		visited[start] = true;
		
		for(int i = 0;i<arr.length;i++) {
			
				if(arr[start][i] ==1 && visited[i] ==false) {
					dfs(i);
				}
			
		}
		
	}
}
