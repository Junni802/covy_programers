package covy.programers.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecretCode {

  public int solution(int n, int[][] q, int[] ans) {
    List<List<Integer>> res = new ArrayList<>();
    backtrack(new ArrayList<>(), new HashSet<>(), 1, n, res);
    for (List<Integer> r : res) System.out.println(r);
    return 0;
  }

  void backtrack(List<Integer> temp, Set<Character> used, int cur, int n, List<List<Integer>> res) {
    if (temp.size() == 5) {
      res.add(new ArrayList<>(temp));
      return;
    }
    for (int i = cur; i <= n; i++) {
      String s = String.valueOf(i);
      Set<Character> set = new HashSet<>();
      boolean valid = true;
      for (char c : s.toCharArray()) {
        if (!used.add(c)) valid = false;
        set.add(c);
      }
      if (!valid) {
        used.removeAll(set);
        continue;
      }
      temp.add(i);
      backtrack(temp, used, i + 1, n, res);
      temp.remove(temp.size() - 1);
      used.removeAll(set);
    }
  }


}
