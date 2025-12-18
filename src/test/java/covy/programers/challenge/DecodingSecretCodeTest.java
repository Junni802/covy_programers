package covy.programers.challenge;


import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class DecodingSecretCodeTest {

  @Test
  void test() {
    int n = 10;
    int[][] q = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {3, 7, 8, 9, 10}, {2, 5, 7, 9, 10}, {3, 4, 5, 6, 7}};
    int[] ans = {2,3,4,3,3};

    solution(n, q, ans);
  }

  int[] arr = new int[5];
  Set<Integer>[] set;
  int answer = 0;

  public int solution(int n, int[][] q, int[] ans) {
    set = new Set[q.length];
    for (int i=0; i<q.length; i++) {
      set[i] = new HashSet<>();
      for (int j=0; j<5; j++) {
        set[i].add(q[i][j]);
      }
    }

    backTracking(0, 1, n, q, ans);

    System.out.println("결과값 -> " + answer);
    return answer;
  }

  public void backTracking(int depth, int cur, int n, int[][] q, int[] ans){
    if (depth == 5) {
      if (isValid(q, ans)) {
        answer++;
      }
      return;
    }

    for (int i=cur; i<=n; i++) {
      arr[depth] = i;
      backTracking(depth+1, i+1, n, q, ans);
    }
  }

  public boolean isValid(int[][] q, int[]ans) {
    for (int i=0; i<q.length; i++) {
      int sum = 0;
      for (int j=0; j<5; j++) {
        if (set[i].contains(arr[j])) {
          sum++;
        }
      }
      if (ans[i] != sum) return false;
    }

    return true;
  }
}