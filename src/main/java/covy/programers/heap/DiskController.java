package covy.programers.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DiskController {

  public int solution(int[][] jobs) {
    Arrays.sort(jobs, Comparator.comparingInt(a -> a[0])); // 요청 시간 기준 정렬

    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
    int time = 0, index = 0, count = 0;
    int totalWait = 0;

    while (count < jobs.length) {
      // 현재 시간까지 요청된 작업 후보 넣기
      while (index < jobs.length && jobs[index][0] <= time) {
        pq.offer(jobs[index++]);
      }

      if (pq.isEmpty()) {
        time = jobs[index][0]; // 다음 작업 요청 시간으로 점프
      } else {
        int[] job = pq.poll();
        time += job[1]; // 작업 시간 더하기
        totalWait += time - job[0]; // 완료 시간 - 요청 시간 = 대기 + 처리 시간
        count++;
      }
    }

    return totalWait / jobs.length;
  }
}


