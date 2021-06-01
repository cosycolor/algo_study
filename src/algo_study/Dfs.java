package algo_study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Dfs {
	static int arr[][];
	static boolean visited[];
	static int n;
	static int start;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt() +1;
		arr = new int[no][no];
		visited = new boolean[no];
		
		n = sc.nextInt();
		start = sc.nextInt();
		
		for(int i = 0;i < n;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(start);
		System.out.println();
		Arrays.fill(visited, false);
		bfs(start);
		
	}
	private static void dfs(int node) {
		visited[node]= true;
		System.out.print(node+" ");
		
			for(int j = 0;j<arr.length;j++) {
				if(arr[node][j] == 1 && visited[j] ==false) {
					
					dfs(j);
				}
			}
	}
	private static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		visited[node]= true;
		q.offer(node);
		
		
			while(!q.isEmpty()) {
				int cur = q.poll();
				System.out.print(cur +" ");
				//반복문으로 인접노드를 큐에 집어 넣는다
				for(int i = 0;i<arr.length;i++) {
					if(arr[cur][i] ==1 && visited[i] == false) {
						visited[i] = true;
						q.offer(i);
					}
				}
			}
	}
}
