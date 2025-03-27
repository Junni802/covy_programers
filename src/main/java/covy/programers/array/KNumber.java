package covy.programers.array;

import java.util.Arrays;

public class KNumber {

  public int[] solution(int[] array, int[][] commands) {

    int[] answer = new int[commands.length];

    for (int i=0; i<commands.length; i++) {

      int[] list = Arrays.copyOfRange(array, commands[i][0], commands[i][1]);
      list = Arrays.stream(list)            // 스트림을 생성하고
          .sorted()                // 정렬
          .toArray();              // 정렬된 배열을 다시 배열로 변환
      answer[i] = list[commands[i][2]];
    }

    return answer;
  }

}
