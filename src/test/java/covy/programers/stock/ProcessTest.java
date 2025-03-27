package covy.programers.stock;


import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import org.junit.jupiter.api.Test;

class ProcessTest {

  @Test
  void solution1() {
    int [] priorities = {1, 1, 9, 1, 1, 1};
    int location = 0;
    solution(priorities, location);
  }

  public int solution(int[] priorities, int location) {
    Queue<Map<Integer, Integer>> queue = new LinkedList<>();
    for (int i=0; i<priorities.length; i++) {
      Map<Integer, Integer> map = new HashMap<>();
      map.put(i, priorities[i]);
      queue.add(map);
    }

    int[] properties = Arrays.stream(priorities)
        .boxed()
        .sorted((a,b) -> b - a)
        .mapToInt(Integer::intValue)
        .toArray();

    int num = 0;
    int count = 0;

    while (true) {
      Map<Integer, Integer> map = queue.poll();

      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == properties[num]) {
          num++;
          if (entry.getKey() == location) {
            return num;
          }
        }
      }
      queue.add(map);
      count++;
      if (count > 30) {
        return 0;
      }
    }
  }
}