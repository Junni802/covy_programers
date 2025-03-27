package covy.programers.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class KNumberTest {

  @Test
  void solution1() {
    int[] array = { 1, 5, 2, 6, 3, 7, 4 };
    int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
    solution(array, commands);
  }

  public int[] solution(int[] array, int[][] commands) {

    int[] answer = new int[commands.length];

    for (int i=0; i<commands.length; i++) {

      int[] list = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
      Arrays.sort(list);
      answer[i] = list[commands[i][2] - 1];
    }

    return answer;
  }
}