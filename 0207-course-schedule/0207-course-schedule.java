import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        // Build adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        int[] state = new int[numCourses]; // 0 = unvisited

        // Check for cycle in each component
        for (int i = 0; i < numCourses; i++) {
            if (dfs(graph, i, state)) {
                return false; // cycle found
            }
        }

        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int node, int[] state) {
        if (state[node] == 1) return true;  // cycle
        if (state[node] == 2) return false; // already safe

        state[node] = 1; // mark visiting

        for (int neighbor : graph.get(node)) {
            if (dfs(graph, neighbor, state)) {
                return true;
            }
        }

        state[node] = 2; // mark visited
        return false;
    }
}