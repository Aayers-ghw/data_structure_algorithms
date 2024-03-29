package algo.graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {	//无向图

	private int v;	//顶点的个数
	private LinkedList<Integer> adj[];	//邻接表
	
	public Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; ++i) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int s, int t) {		//无向图一条边存两次
		adj[s].add(t);
		adj[t].add(s);
	}
	
	public void bfs(int s, int t) {
		if(s == t) return;
		boolean[] visited = new boolean[v];		//记录已经被访问的顶点
		visited[s] = true;		
		Queue<Integer> queue = new LinkedList<>();		//用来存储已经被访问、但相连的顶点还没有被访问的顶点
		queue.add(s);
		int[] prev = new int[v];	//记录搜索路径
		for(int i = 0; i < v; ++i) {
			prev[i] = -1;
		}
		
		while(queue.size() != 0) {
			int w = queue.poll();
			for(int i = 0; i < adj[w].size(); ++i) {
				int q = adj[w].get(i);
				if(!visited[q]) {
					prev[q] = w;
					if(q == t) {
						print(prev, s, t);
						return;
					}
				}
				visited[q] = true;
				queue.add(q);
			}
		}
	}
	
	private void print(int[] prev, int s, int t) {
		if(prev[t] != -1 && t != s) {
			print(prev, s, prev[t]);
		}
		System.out.print(t + " ");
	}
	
	
	boolean found = false;	//全局变量或者成员变量
	
	public void dfs(int s, int t) {
		found = false;
		boolean[] visited = new boolean[v];
		int[] prev = new int[v];
		for(int i = 0; i < v; ++i) {
			prev[i] = -1;
		}
		
		recurDfs(s, t, visited, prev);
		print(prev, s, t);
	}
	
	private void recurDfs(int w, int t, boolean[] visited, int[] prev) {
		if(found == true)	return;
		visited[w] = true;
		if(w == t) {
			found = true;
			return;
		}
		for(int i = 0; i < adj[w].size(); ++i) {
			int q = adj[w].get(i);
			if(!visited[q]) {
				prev[q] = w;
				recurDfs(q, t, visited, prev);
			}
		}
	}
	
}
