package covy.programers.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class LifeBoatTest {

  @Test
  void solution1() {
    int[] people = {70, 80, 50};
    int limit = 100;

    solution(people, limit);
  }

  public int solution(int[] people, int limit) {
    int answer = 0;

    // 오름차순 정렬
    Arrays.sort(people);

    int idx = 0;
    for (int i=people.length - 1; i>=idx; i--) {
      if (people[i] + people[idx] <= limit) {
        idx++;
        answer++;
      } else {
        answer++;
      }
    }

    return answer;
  }
}