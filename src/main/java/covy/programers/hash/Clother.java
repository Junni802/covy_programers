package covy.programers.hash;

import java.util.HashMap;
import java.util.Map;

public class Clother {

  public int solution(String[][] clothes) {
    int answer = 1;

    Map<String, Integer> clothList = new HashMap<>();

    for (int i=0; i< clothes.length; i++) {
      if (clothList.containsKey(clothes[i][1])) {
        clothList.put(clothes[i][1], clothList.get(clothes[i][1]) + 1);
      }
      clothList.put(clothes[i][1], 0);
    }

    for (Integer value : clothList.values()) {
      answer = answer * (value + 1);
    }



    return answer - 1;
  }

}
