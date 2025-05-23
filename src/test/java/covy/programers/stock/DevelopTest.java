package covy.programers.stock;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class DevelopTest {

  @Test
  void solution() {
    int[] progresses = {95, 90, 99, 99, 80, 99};
    int[] speeds = {1, 1, 1, 1, 1, 1};
    solution1(progresses, speeds);
  }

  public int[] solution1(int[] progresses, int[] speeds) {
    boolean resultYn = true;

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < progresses.length;) {
      resultYn = true;
      int num = 1;
      int count = 0;
      while (resultYn) {
        if (progresses[i] + (speeds[i] * num) >= 100) {
          resultYn = false;
        } else {
          num++;
        }
      }
      for (int j = i; j < progresses.length; j++) {
        if (progresses[j] + (speeds[j] * num) >= 100) {
          count++;
        } else {
          j=progresses.length;
        }
      }
      if (i == progresses.length - 1) {
        i++;
      }
      i += count;
      list.add(count);
    }
    int[] answer = new int[list.size()];
    for (int i=0; i<list.size(); i++) {
      answer[i] = list.get(i);
    }
    return answer;
  }
}