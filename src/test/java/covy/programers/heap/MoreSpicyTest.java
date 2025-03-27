package covy.programers.heap;

import static org.junit.jupiter.api.Assertions.*;

import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;

class MoreSpicyTest {

  @Test
  void solution1() {
    int[] scoville = {10, 12, 3, 4, 13, 12};
    solution(scoville, 2);
  }

  public int solution(int[] scoville, int K) {
    int answer = 0;

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int is : scoville) {
      minHeap.offer(is);
    }

    boolean resultYn = true;
    while (resultYn) {
      System.out.println("");
      if (minHeap.peek() >= K) {
        break;
      }
      answer++;
      if (minHeap.size() < 2) {
        answer = -1;
        break;
      }
      int num = minHeap.poll() + (minHeap.poll() * 2);
      minHeap.add(num);
    }

    System.out.println("값 보자 -> " + answer);
    return answer;
  }
}