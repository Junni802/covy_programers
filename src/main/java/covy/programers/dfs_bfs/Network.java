package covy.programers.dfs_bfs;

public class Network {

    public int solution(int n, int[][] computers) {
     int answer = 0;
     boolean[] booleans = new boolean[n];

     for (int i = 0; i < n; i++) {
       if (!booleans[i]) {
         dfs(i, computers, booleans);
         answer++;
       }
     }

     return answer;
    }

    public void dfs(int i, int[][] computers, boolean[] booleans) {
      for (int j = 0; j < computers.length; j++) {
        if (i != j && computers[i][j] == 1 && !booleans[j]) {
          booleans[j] = true;
          dfs(j, computers, booleans);
        }
      }
    }



}
