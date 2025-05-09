package programmers.practice;

import java.util.*;

public class FurthisetNode {

    public int solution(int n, int[][] edge) {
        //인접 리스트 틀 만들기
        Map<Integer, List<Integer>> graph = new HashMap<>();  //동적, Map(HashMap) 사용
        for (int i = 1; i < n+1; i++) {
            graph.put(i, new ArrayList<>());  //각 노드에 대한 리스트 추가
        }
        for (int[] e : edge) {
            int a = e[0];
            int b = e[1];

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        //BFS
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        int[] distance = new int[n + 1];

        q.add(1);
        distance[1] = 0;
        visited.add(1);

        while (!q.isEmpty()) {
            int cur = q.remove();
            for (int next : graph.get(cur)) {
                if (!visited.contains(next)) {
                    q.add(next);
                    distance[next] += distance[cur] + 1;
                    visited.add(next);
                }
            }
        }
        int max = 0;
        for (int d : distance) {
            if(d>max)max = d;
        }


        int countNum = 0;
        for ( int d : distance) {
            if(d==max) countNum++;
        }
        return countNum;
    }


        public static void main(String[] args) {
            int n = 6;
            int[][] edge = new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
            FurthisetNode fn = new FurthisetNode();
            int result = fn.solution(n, edge);
            System.out.println(result);
        }
    }

