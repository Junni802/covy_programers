package covy.programers.challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class IncrementServer {

  public int solution(int[] players, int m, int k) {
    int cntServerInc = 0;
    int server = 0;
    List<Integer> list = new ArrayList<>();

    for(int i=0; i<players.length; i++) {
      // 플레이어가 서버 증설 회원보다 많은가
      if (players[i] > m) {
        int minusServer = 0;

        // 시간이 초과 되었으면 제거
        for(int j=0; j<list.size(); j++) {
          list.set(j, list.get(j) - 1);
          if (list.get(j) == 0) {
            minusServer++;
            list.remove(j);
          }
        }

        server -= minusServer;
        if (players[i]/m > server) {
          int plusServer = players[i]/m - server;
          cntServerInc = cntServerInc + (plusServer);
          server = players[i]/m;

          for (k=0; k<plusServer; k++) {
            list.add(k);
          }
        }
      }
    }
    return cntServerInc;
  }
}
