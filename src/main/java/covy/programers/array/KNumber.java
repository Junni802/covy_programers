package covy.programers.array;

import java.util.Arrays;

public class KNumber {

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for(int h=0; h<commands.length; h++) {
      int i=commands[h][0];
      int j=commands[h][1];
      int k=commands[h][2];

      int[] arr = Arrays.copyOfRange(array, i-1, j);
      Arrays.sort(arr);

      answer[h] = arr[k-1];
    }

    return answer;
  }

}
