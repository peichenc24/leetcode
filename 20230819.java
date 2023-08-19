class Solution {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        Map<int[], Integer> map = new HashMap();
        for(int i = 0; i < edges.length; i++)
            map.put(edges[i], i);
        Arrays.sort(edges, (a,b)->(a[2]-b[2]));
        List<Integer> criticalEdges = new ArrayList();
        List<Integer> pseudoCriticalEdges = new ArrayList();
        int mstCost = mst(edges,n,null, null);
        for(int[] edge:edges){
            int cost = mst(edges, n, null, edge);
            if (cost> mstCost)
                criticalEdges.add(map.get(edge));
            else{
            int cost1 = mst(edges, n, edge, null);
            if (mstCost==cost1)
                pseudoCriticalEdges.add(map.get(edge));
            }
        }
        List<List<Integer>> result = new ArrayList();
        result.add(criticalEdges);
        result.add(pseudoCriticalEdges);
        return result;

    }
    private int mst(int[][] edges,int n,int[] include, int[] exclude){
        UnionFind uf = new UnionFind(n);
        int minCost = 0;
        if (include!=null){
            minCost =uf.union(include[0], include[1])?include[2]:0;
        }
        for(int[] edge:edges){
            if(edge!=exclude && uf.union(edge[0], edge[1]))
                minCost+=edge[2];
        }
        return (uf.components==1)? minCost:Integer.MAX_VALUE;
    }
}
class UnionFind{
    int[] root;
    int components;
    UnionFind(int n){
        root = new int[n];
        components=n;
        for(int i = 0; i< n; i++)
            root[i]=i;
    }
    int find(int v){
        if (v == root[v])
            return v;
        return find(root[v]);
    }
    boolean union(int v1, int v2){
        int ar1 = find(v1);
        int ar2 = find(v2);
        if (ar1 == ar2)
            return false;
        root[ar1]=ar2;
        components--;
        return true;
    }
}
