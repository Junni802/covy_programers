package covy.programers.array;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {

  public String solution(int[] numbers) {
    String answer = "";
    List<String> list = new ArrayList<>();

    for(int num : numbers) {
      list.add(String.valueOf(num));
    }

    list.sort((a,b) -> (b + a).compareTo(a + b));

    for(String li: list) {
      answer+=li;
    }

    if (answer.charAt(0) == '0') {
      return "0";
    }

    return answer;
  }

}
