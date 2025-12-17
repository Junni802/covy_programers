package covy.programers.backtraking;

import java.util.Arrays;

public class backTrackingTest {

  int[] arr = new int[5];

  public void test() {
    int n = 10;

  }

  public void backTrack(int depth, int cur, int n) {
    if (depth == 5) {
      System.out.println(Arrays.toString(arr));
    }

    for (int i=cur; i<=n; i++) {
      arr[depth] = i;
      backTrack(i+1, depth+1, n);
    }
  }

}
