package covy.programers.dfs_bfs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class GameMapTest {

  @Test
  void test() {
    int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};

    solution1(maps);
  }

  int totalSize;

  // 성공 여부
  boolean resultYn = true;

  List<Integer> list = new ArrayList<>();

  public int solution1(int[][] maps) {

    // 예외 처리를 위한 총 합계 구하기
    totalSize = maps.length * maps[0].length;


    boolean[][] check = new boolean[maps.length][maps[0].length];

    int answer = 0;

    dfs(maps, 0, 0, 1, check);


    // true 이면 하나도 맞은게 없을 경우
    if (resultYn) {
      return -1;
    } else {
      return list.get(0);
    }
  }

  public void dfs(int[][] maps, int i, int k, int count, boolean[][] check) {

    if (check[i][k] == true) {
      return;
    }
    check[i][k] = true;
    // 이동할 수 있는 방법은
    // 위, 아래, 왼쪽, 오른쪽

    if (i == maps.length - 1 && k == maps[0].length - 1 && maps[i][k] == 1) {
      resultYn &= false;
      list.add(count);
    }

    if (maps[i][k] == 1) {
      // 왼쪽
      if (k != 0) {
        dfs(maps, i, k-1, count + 1, check);
      }

      // 오른쪽
      if (k != maps[i].length - 1) {
        dfs(maps, i, k+1, count + 1, check);
      }

      // 위쪽
      if (i != 0) {
        dfs(maps, i - 1, k, count + 1, check);
      }

      // 아래
      if (i != maps.length - 1) {
        dfs(maps, i + 1, k, count + 1, check);
      }
    }
  }

}