package covy.programers.array;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {

  public String solution(int[] numbers) {

    List<String> list = new ArrayList<>();
    for (int number : numbers) {
      list.add(number + "");
    }

    list.sort(String::compareTo);

    for (String s : list) {
      System.out.println(s);
    }

    String answer = "";
    return answer;
  }

}
