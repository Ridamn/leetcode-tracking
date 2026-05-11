// Last updated: 5/11/2026, 9:54:24 AM
class Solution {
    class Edge {
        int u, v, w;
        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }

    class DSU {
        int[] p;
        DSU(int n) {
            p = new int[n];
            for (int i = 0; i < n; i++) p[i] = i;
        }

        int find(int x) {
            if (p[x] != x) p[x] = find(p[x]);
            return p[x];
        }

        boolean union(int a, int b) {
            int pa = find(a), pb = find(b);
            if (pa == pb) return false;
            p[pb] = pa;
            return true;
        }
    }

    public int minCost(int n, int[][] edges, int k) {
        List<Edge> list = new ArrayList<>();
        for (int[] e : edges) list.add(new Edge(e[0], e[1], e[2]));

        list.sort(Comparator.comparingInt(e -> e.w));
        DSU dsu = new DSU(n);
        List<Integer> used = new ArrayList<>();

        for (Edge e : list) {
            if (dsu.union(e.u, e.v)) used.add(e.w);
        }

        used.sort(Collections.reverseOrder());
        for (int i = 0; i < k - 1 && !used.isEmpty(); i++) used.remove(0);
        return used.isEmpty() ? 0 : used.get(0);
    }
}
