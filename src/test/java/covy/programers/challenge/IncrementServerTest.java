package covy.programers.challenge;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncrementServerTest {

  @Test
  void solution1() {
    int[] list = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
    solution(list, 3, 5);
  }

  public int solution(int[] players, int m, int k) {
    int cntServerInc = 0;
    int server = 0;
    List<Integer> list = new ArrayList<>();

    for(int i=0; i<players.length; i++) {

      // 시간이 초과 되었으면 제거
      for(int j=0; j<list.size(); j++) {
        list.set(j, list.get(j) - 1);
        if (list.get(j) == 0) {
          server--;
          list.remove(j);
          j--;
        }
      }

      // 플레이어가 서버 증설 회원보다 많은가
      if (players[i] >= m) {
        if (players[i]/m > server) {
          int plusServer = players[i]/m - server;
          cntServerInc = cntServerInc + (plusServer);
          server = players[i]/m;

          for (int j=0; j<plusServer; j++) {
            list.add(k);
          }
        }
      }
    }
    return cntServerInc;
  }
}