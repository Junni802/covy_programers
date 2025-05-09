package covy.programers.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class MockTestTest {

  @Test
  void solution1() {
    int[] answer = {1,2,3,4,5};
    solution(answer);
  }

  public int[] solution(int[] answers) {

    int[] firstMan = {1, 2, 3, 4, 5};
    int[] secondMan = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] thirdMan = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int firstCount = 0;
    int secondCount = 0;
    int thirdCount = 0;

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == firstMan[i%firstMan.length]) {
        firstCount++;
      }
      if (answers[i] == secondMan[i%secondMan.length]) {
        secondCount++;
      }
      if (answers[i] == thirdMan[i%thirdMan.length]) {
        thirdCount++;
      }
    }

    List<Integer> list = new ArrayList<>();
    list.add(firstCount);
    list.add(secondCount);
    list.add(thirdCount);
    System.out.println("firstMan: " + firstCount);
    System.out.println("secondMan: " + secondCount);
    System.out.println("thirdMan: " + thirdCount);

    list.sort((a, b) -> b - a);

    long count = list.stream()
        .filter(i -> i == list.get(0))
        .count();


    int[] answer = new int[(int) count];

    for (int i = 0; i < list.size(); i++) {
      if (i == 0 && list.get(i) == list.get(0))
      answer[i] = list.get(i);
    }
    return answer;
  }
}