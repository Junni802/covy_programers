package covy.programers.heap;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class DiskControllerTest {

  @Test
  void test() {
    int[][] num = {{0, 3}, {1, 9}, {3, 5}};
    solution(num);
  }

  public int solution(int[][] jobs) {
    int answer = 0;
    Queue<Map<Integer, Integer>> queue =
        new PriorityQueue<>(
            Comparator.
                comparing((Map<Integer, Integer> m) -> m.values().iterator().next())
                .thenComparingInt(m -> m.keySet().iterator().next()));
    for(int i=0; i<jobs.length; i++) {
      Map<Integer, Integer> map = Map.of(jobs[i][0], jobs[i][1]);
      System.out.println("rd-> " + map.toString());
      queue.add(map);
    }

    while (!queue.isEmpty()){
      System.out.println(queue.poll());
    }

    return answer;
  }

}