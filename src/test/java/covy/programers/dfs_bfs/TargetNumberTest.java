package covy.programers.dfs_bfs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TargetNumberTest {

  @Test
  void test() {
    int[] al = {1,2,3,4,5};
    solution(al, 5);
  }

  public int solution(int[] numbers, int target) {
    boolean[] booleans = new boolean[numbers.length];
    for (boolean aBoolean : booleans) {
      System.out.println(aBoolean);
    }
    return 0;
  }

  public boolean dfs(int[] numbers, int target) {
    int total = 0;
    for (int i=0; i<numbers.length; i++) {
      total += numbers[i];
    }
    return false;
  }

}