package covy.programers.array;

import java.util.ArrayList;
import java.util.List;

public class MaxNumber {

  public String solution(int[] numbers) {
    String answer = "";
    List<String> list = new ArrayList<>();

    for(int i=0; i<numbers.length; i++) {
      list.add(String.valueOf(numbers[i]));
    }

    list.sort(String::compareTo);

    for (String s : list) {
      System.out.println("rkqt -> " + s);
    }

    return answer;
  }

}
