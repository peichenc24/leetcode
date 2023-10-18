class Solution {
    class Graph {
		private int v;
		private List<ArrayList<Integer>> adj;

		public Graph(int v) {
			this.v = v;
			this.adj = new ArrayList<ArrayList<Integer>>(this.v);
			for (int i = 0; i < this.v; i++) {
				this.adj.add(new ArrayList<Integer>());
			}
		}

		public void addEdge(int u, int v) {
			adj.get(u).add(v);
		}

		public int topologicalSort(int[] time) {
			int indegree[] = new int[this.v];
			for (int u = 0; u < this.v; u++) {
				for (int v : this.adj.get(u)) {
					indegree[v]++;
				}
			}
			Queue<Integer> queue = new LinkedList<>();
			int[] maxTime = new int[this.v];
			for (int u = 0; u < this.v; u++) {
				if (indegree[u] == 0) {
					queue.add(u);
					maxTime[u] = time[u];
				}
			}
			while (!queue.isEmpty()) {
				int u = queue.poll();
				for (int v : this.adj.get(u)) {
					maxTime[v] = Math.max(maxTime[v], maxTime[u] + time[v]);
					if (--indegree[v] == 0) {
						queue.add(v);
					}
				}
			}
			int ans = 0;
			for (int u = 0; u < this.v; u++) {
				ans = Math.max(ans, maxTime[u]);
			}
			return ans;
		}
	}

	public int minimumTime(int n, int[][] relations, int[] time) {
		Graph graph = new Graph(n);
		for (int[] relation : relations) {
			graph.addEdge(relation[0] - 1, relation[1] - 1);
		}
		return graph.topologicalSort(time);
	}
}
