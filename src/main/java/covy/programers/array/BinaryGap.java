package covy.programers.array;

public class BinaryGap {
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
