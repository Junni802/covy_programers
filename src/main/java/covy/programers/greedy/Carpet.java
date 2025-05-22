package covy.programers.greedy;

public class Carpet {

  /**
   * Yello의 크기를 구하는 공식
   * (가로 사이즈 - 2) * (세로사이즈 - 2) = Yello의 크기
   *
   * @param brown
   * @param yellow
   * @return
   */
  public int[] solution(int brown, int yellow) {
    int[] answer = new int[2];

    int carpetSize = brown + yellow;

    // yellow가 존재하기 위해서는 가로와 세로의 길이가 3이상이여야 한다.
    for (int i = 3; i <= carpetSize; i++) {
      int col = i; // 세로
      int row = carpetSize / col; // 가로

      // 가로의 갯수가 3 이하라면 다음 인덱스
      if (row < 3) {
        continue;
      }

      // "가로는 세로의 길이보다 크거나 같다" 조건
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
