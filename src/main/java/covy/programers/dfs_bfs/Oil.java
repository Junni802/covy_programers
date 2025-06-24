package covy.programers.dfs_bfs;

import java.util.*;

public class Oil {
  static int [] arx = {-1,1,0,0};
  static int [] ary = {0,0,-1,1};
  static int row, col;
  static boolean [][] visited;
  static int max = 0;
  public int solution(int[][] land) {

    row = land.length; // 행
    col = land[0].length; // 열
    for(int i = 0; i < col; i++){
      BFS(i, land);
    }
    return max;
  }
  public static void BFS(int start, int [][] land){
    visited = new boolean [row][col];
    int sum = 0;
    ArrayDeque<int[]> q = new ArrayDeque<>();
    for(int i = 0; i < row; i++){
      if(visited[i][start] || land[i][start] == 0) continue;
      sum++;
      visited[i][start] = true;
      q.add(new int[]{i, start});
      while(!q.isEmpty()){
        int [] cur = q.poll();
        for(int j = 0; j < 4; j++){
          int nx = cur[0] + arx[j];
          int ny = cur[1] + ary[j];
          if(!validation(nx, ny) || visited[nx][ny] || land[nx][ny] == 0) continue;
          sum++;
          visited[nx][ny] = true;
          q.add(new int[]{nx,ny});
        }
      }
    }
    if(sum > max){
      max = sum;
    }
  }
  public static boolean validation(int nx, int ny){
    if(0 <= nx && 0 <= ny && nx < row && ny < col) return true;
    return false;
  }
}
