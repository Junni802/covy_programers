package covy.programers.greedy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarpetTest {

  @Test
  void test() {

  }

  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];

    int carpetSize = brown + yellow; // 카펫 사이즈

    for(int i=3; i<carpetSize; i++) { // 카펫 사이즈는 3부터 시작
      int col = i;  // 세로 사이즈
      int row = carpetSize / col; // 가로 사이즈

      if (row < 3) {
        continue;
      }

      if (row >= col) {
        if ((row - 2) * (col - 2) == yellow) {
          answer[0] = row;
          answer[1] = col;
          break;
        }
      }
    }

    return answer;
  }

}