package covy.programers.heap;

import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Queue;

public class MoreSpicy {

  public int solution(int[] scoville, int K) {
    int answer = 0;
    Queue<Integer> queue = new PriorityQueue<>();
    Arrays.stream(scoville).forEach(queue::add);

    while (queue.peek() < K) {
      if (queue.size() < 2) {
        return -1;
      }
      int first = queue.poll();
      int second = queue.poll();
      int value = first + (second * 2);
      queue.add(value);
      answer++;
    }

    return answer;
  }

}
