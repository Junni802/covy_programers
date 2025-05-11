package covy.programers.greedy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class GymUniformTest {

  @Test
  void solution1() {
    int[] lost = {2, 4};
    int[] reserve = {1, 3, 5};
    int n = 5;

    solution(n, lost, reserve);
  }

  public int solution(int n, int[] lost, int[] reserve) {
    Set<Integer> lostSet = new HashSet<>();
    Set<Integer> reserveSet = new HashSet<>();

    for (int l : lost) {
      lostSet.add(l);
    }
    for (int r : reserve) {
      if (lostSet.contains(r)) {
        lostSet.remove(r);
      } else {
        reserveSet.add(r);
      }
    }

    for (int l : new HashSet<>(lostSet)) {
      if (reserveSet.contains(l - 1)) {
        reserveSet.remove(l - 1);
        lostSet.remove(l);
      } else if (reserveSet.contains(l + 1)) {
        reserveSet.remove(l + 1);
        lostSet.remove(l);
      }
    }

    return n - lostSet.size();
  }
}