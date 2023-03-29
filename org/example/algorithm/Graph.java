package org.example.algorithm;

import java.util.*;
public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt(); // 頂点数
        int m = sc.nextInt(); // 辺数
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            graph.get(u).add(new Edge(v, w));
        }
        int s = sc.nextInt() - 1; // 始点

        // ダイクストラ法
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue.add(new Node(s, 0));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int u = node.u;
            int d = node.d;
            if (d > dist[u]) {
                continue;
            }
            for (Edge e : graph.get(u)) {
                int v = e.v;
                int w = e.w;
                if (dist[v] > dist[u] + w) {
                    dist[v] = dist[u] + w;
                    queue.add(new Node(v, dist[v]));
                }
            }
        }

        // 出力
        for (int i = 0; i < n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println("INF");
            } else {
                System.out.println(dist[i]);
            }
        }
    }

    static class Edge {
        int v;
        int w;
        public Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }

    static class Node implements Comparable<Node> {
        int u;
        int d;
        public Node(int u, int d) {
            this.u = u;
            this.d = d;
        }
        public int compareTo(Node other) {
            return Integer.compare(this.d, other.d);
        }
    }
}
