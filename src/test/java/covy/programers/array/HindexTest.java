package covy.programers.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HindexTest {

  @Test
  void test() {
    int[] citations = {3, 0, 6, 1, 5};

    solution(citations);

  }

  public int solution(int[] citations) {
    int answer = 0;
    int maxNum = 0;

    for (int i=0; i<citations.length; i++) {
      if (citations[i] > maxNum) {
        answer = i + 1;
        maxNum = citations[i];
      }
    }

    System.out.println("결과값 -> " + answer);
    return answer;
  }

}