package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {	//����ͼ

	private int v;	//����ĸ���
	private LinkedList<Integer> adj[];	//�ڽӱ�
	
	public Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; ++i) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int s, int t) {		//����ͼһ���ߴ�����
		adj[s].add(t);
		adj[t].add(s);
	}
	
	public void bfs(int s, int t) {
		if(s == t) return;
		boolean[] visited = new boolean[v];		//��¼�Ѿ������ʵĶ���
		visited[s] = true;		
		Queue<Integer> queue = new LinkedList<>();		//�����洢�Ѿ������ʡ��������Ķ��㻹û�б����ʵĶ���
		queue.add(s);
		int[] prev = new int[v];	//��¼����·��
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
	
	
	boolean found = false;	//ȫ�ֱ������߳�Ա����
	
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
