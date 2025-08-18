package covy.programers.array;

import java.util.Arrays;

public class Hindex {

  public int solution(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);  // 오름차순 정렬

    for (int i=0; i<citations.length; i++) {
      int h = citations.length - i;  // 인용된 논문의 수

      // [조건문] 길이의 총 합보다 큰 값인가?
      if (citations[i] >= h) {
        answer = h;
        break;
      }
    }

    return answer;
  }

}
