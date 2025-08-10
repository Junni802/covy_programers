package covy.programers.dfs_bfs;

import java.util.ArrayDeque;
import java.util.Queue;
import org.junit.jupiter.api.Test;

public class TossTest {

  @Test
  void test() {
    int soulution = solution("123");
    Queue queue = new ArrayDeque<>();
    System.out.println(soulution);
  }

  public int solution(String number) {
    int answer = -1;
    char[] chars = number.toCharArray();

    for(int i=0; i<chars.length - 2; i++) {
      if (chars[i] == chars[i+1] && chars[i+1] == chars[i+2]) {
        answer = Math.max(answer, Integer.parseInt((number).substring(i, i+3)));
      }
    }
    return answer;
  }

}
