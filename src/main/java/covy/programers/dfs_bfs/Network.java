package covy.programers.dfs_bfs;

public class Network {

    public int solution(int n, int[][] computers) {
      int answer = 0;
      boolean[] check = new boolean[n];

      for(int i=0;i<n;i++){
        if(!check[i]){
          dfs(computers, i, check);
          answer++;
        }
      }

      return answer;
    }

    public void dfs(int[][] computers, int i, boolean[] check) {
      check[i] = true;

      for (int j = 0; j < computers.length; j++) {
        if (i != j && computers[i][j] == 1 && !check[j]) {
          dfs(computers, j, check);
        }
      }
    }

}
