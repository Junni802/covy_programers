package covy.programers.array;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class MaxNumberTest {

  @Test
  void solution1() {
    int[] numbers = {3, 30, 34, 5, 9};

    solution(numbers);
  }

  public String solution(int[] numbers) {
    String answer = "";
    List<String> list = new ArrayList<>();
    for (int number : numbers) {
      list.add(number + "");
    }

    list.sort((a,b) ->  (b + a).compareTo(a + b));

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
      answer += list.get(i);
    }

    if(list.size() == 0) {
      return list.get(0);
    }


    return answer;
  }
}