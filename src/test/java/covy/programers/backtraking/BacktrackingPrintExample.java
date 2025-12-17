package covy.programers.backtraking;

import java.util.Arrays;

public class BacktrackingPrintExample {

  static int[] arr = new int[5];

  public static void main(String[] args) {
    int n = 10;
    backTrack(0, 1, n);
  }

  static void backTrack(int depth, int cur, int n) {
    // 5개를 다 뽑았으면 출력
    if (depth == 5) {
      System.out.println(Arrays.toString(arr));
      return;
    }

    // cur부터 n까지 숫자 선택
    for (int i = cur; i <= n; i++) {
      arr[depth] = i;
      backTrack(depth + 1, i + 1, n);
    }
  }
}