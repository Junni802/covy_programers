package covy.programers.search;

public class MinRectangle {

  public int solution(int[][] sizes) {
    for (int i=0; i<sizes.length; i++) {
      if (sizes[i][0] < sizes[i][1]) {
        int tmp = sizes[i][0];
        sizes[i][0] = sizes[i][1];
        sizes[i][1] = tmp;
      }
    }

    int first = 0;
    int second = 0;

    for (int i=0; i<sizes.length; i++) {
      if (sizes[i][0] > first) {
        first = sizes[i][0];
      }
      if (sizes[i][1] > second) {
        second = sizes[i][1];
      }
    }
    return first * second;
  }

}
