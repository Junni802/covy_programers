package covy.programers.stock;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class SameNumber {

  public int[] solution(int []arr) {

    List<Integer> numList = new ArrayList<>();
    int beforeNum = -1;
    for (int i=0; i<arr.length; i++) {
      if (arr[i] != beforeNum) {
        numList.add(arr[i]);
      }
      beforeNum = arr[i];
    }

    int[] answer = new int[numList.size()];
    for (int i=0; i<numList.size(); i++) {
      answer[i] = numList.get(i);
    }

    return answer;
  }

}
