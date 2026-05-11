# Last updated: 5/11/2026, 9:54:31 AM
from typing import List
from collections import defaultdict
import heapq

class DSU:
    def __init__(self, n):
        self.p = list(range(n + 1))

    def find(self, x):
        if self.p[x] != x:
            self.p[x] = self.find(self.p[x])
        return self.p[x]

    def union(self, x, y):
        self.p[self.find(x)] = self.find(y)

class Solution:
    def processQueries(self, c: int, connections: List[List[int]], queries: List[List[int]]) -> List[int]:
        dsu = DSU(c)
        for u, v in connections:
            dsu.union(u, v)

        g = defaultdict(list)
        for i in range(1, c + 1):
            r = dsu.find(i)
            g[r].append(i)

        h = {}
        for r in g:
            heapq.heapify(g[r])
            h[r] = g[r]

        on = [True] * (c + 1)
        res = []

        for t, x in queries:
            r = dsu.find(x)
            
            if t == 1:
                if on[x]:
                    res.append(x)
                else:
                    heap = h[r]
                    while heap and not on[heap[0]]:
                        heapq.heappop(heap)
                    if heap:
                        res.append(heap[0])
                    else:
                        res.append(-1)
            else:
                on[x] = False




        
        return res
