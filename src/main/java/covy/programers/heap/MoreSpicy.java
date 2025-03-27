package covy.programers.heap;

import java.util.PriorityQueue;

public class MoreSpicy {

  public int solution(int[] scoville, int K) {
    int answer = 0;

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int is : scoville) {
      minHeap.add(is);
    }

    boolean resultYn = true;
    while (resultYn) {
      answer++;
      if (minHeap.size() < 2) {
        resultYn = false;
        answer = -1;
        break;
      }
      int num = minHeap.poll() + (minHeap.poll() * 2);
      if (num >= K) {
        resultYn = false;
      }
      minHeap.add(num);
    }

    return answer;
  }

}
