package covy.programers.search;

public class MinRectangle {

  public int solution(int[][] sizes) {
    for (int i = 0; i < sizes.length; i++) {
      if (sizes[i][0] < sizes[i][1]) {
        int number = sizes[i][0];
        sizes[i][0] = sizes[i][1];
        sizes[i][1] = number;
      }
    }
    int firstMaxNum = 0;
    int secondMaxNum = 0;
    for (int i = 0; i < sizes.length; i++) {

      if (sizes[i][0] > firstMaxNum) {
        firstMaxNum = sizes[i][0];
      }
      if (sizes[i][1] > secondMaxNum) {
        secondMaxNum = sizes[i][1];
      }

    }

    return firstMaxNum * secondMaxNum;
  }

}
