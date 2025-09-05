package covy.programers.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

  @Test
  void test() {
    int n = solution(15);
    System.out.println("값 -> " + n);
  }

  public int solution(int N) {
    // Implement your solution here
    // 길이 카운트
    int maxNum = 0;
    int addNum = 0; // 연속된 카운트
    boolean resultYn = false;

    while (N > 1) {
      int div = N % 2;
      if (div == 1) {
        resultYn = true;
        if (maxNum < addNum) {
          maxNum = addNum;
        }
        addNum = 0;
      } else if (resultYn && div == 0){
        addNum++;
      }
      N = N / 2;
    }

    if (addNum > 0) {
      maxNum = addNum;
    }

    return maxNum;
  }

}