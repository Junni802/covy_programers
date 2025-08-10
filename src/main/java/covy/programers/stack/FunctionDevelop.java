package covy.programers.stack;

import java.util.ArrayList;
import java.util.List;

public class FunctionDevelop {

  public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> result = new ArrayList<>();
    int day = 0; // 경과 일수
    int count = 0; // 같은 날 배포할 기능 개수

    for (int i = 0; i < progresses.length; i++) {
      int workDays = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);

      if (day < workDays) {
        // 이전까지 배포할 기능이 있으면 기록
        if (count > 0) result.add(count);

        day = workDays; // 새로운 배포 시작일
        count = 1;
      } else {
        count++;
      }
    }
    result.add(count);

    return result.stream().mapToInt(Integer::intValue).toArray();
  }

}
