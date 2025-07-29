package covy.programers.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;
import org.junit.jupiter.api.Test;

class SecretCodeTest {

  @Test
  void solution1() {
    int[][] nubers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {3, 7, 8, 9, 10}, {2, 5, 7, 9, 10}, {3, 4, 5, 6, 7}};
    int[] answer = {2, 3, 4, 3, 3};

    solution(10, nubers, answer);
  }

  public int solution(int n, int[][] q, int[] ans) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= n; i++) numbers.add(i);

    List<List<Integer>> results = new ArrayList<>();
    backtrack(numbers, new ArrayList<>(), new HashSet<>(), results);

    for (List<Integer> combo : results) {
      System.out.println(combo);
    }

    return 0;
  }


  void backtrack(List<Integer> nums, List<Integer> temp, Set<Character> used, List<List<Integer>> res) {
    if (temp.size() == 5) {
      res.add(new ArrayList<>(temp));
      return;
    }

    for (int i = 0; i < nums.size(); i++) {
      int num = nums.get(i);
      String s = String.valueOf(num);
      Set<Character> currDigits = new HashSet<>();
      boolean isValid = true;

      for (char c : s.toCharArray()) {
        if (!used.add(c)) isValid = false;
        currDigits.add(c);
      }

      if (!isValid) {
        used.removeAll(currDigits);
        continue;
      }

      temp.add(num);
      backtrack(nums, temp, used, res);
      temp.remove(temp.size() - 1);
      used.removeAll(currDigits);
    }
  }

}