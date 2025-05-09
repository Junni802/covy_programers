package covy.programers.search;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MockTest {

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

    list.sort((a, b) -> b - a);

    List<Integer> filteredList = list.stream()
        .filter(i -> i == list.get(0))
        .collect(Collectors.toList());

    int[] answer = new int[filteredList.size()];

    for (int i = 0; i < filteredList.size(); i++) {
      answer[i] = filteredList.get(i);
    }
    return answer;
  }

}
