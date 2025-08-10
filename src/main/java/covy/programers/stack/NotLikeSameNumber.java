package covy.programers.stack;

import java.util.ArrayList;
import java.util.List;

public class NotLikeSameNumber {

  public int[] solution(int []arr) {
    List<Integer> list = new ArrayList<>();

    int beforeNum = -1;
    for(int i=0; i<arr.length; i++) {
      if (beforeNum != arr[i]) {
        beforeNum = arr[i];
        list.add(arr[i]);
      }
    }

    return list.stream().mapToInt(Integer::valueOf).toArray();
  }

}
