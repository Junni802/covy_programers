package covy.programers.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;
import org.junit.jupiter.api.Test;

class NotLikeSameNumberTest {

  @Test
  void test() {
    int[] testData = {1,1,3,3,0,1,1};
    solution(testData);
  }

  public int[] solution(int []arr) {
    Stack<Integer> stack = new Stack<>();


    int beforeNum = -1;
    for(int i=0; i<arr.length; i++) {
      if (beforeNum != arr[i]) {
        beforeNum = arr[i];
        stack.add(arr[i]);
      }
    }

    int[] answer = new int[stack.size()];

    for (int j=0; j<stack.size(); j++) {
      answer[j] = stack.get(j);
    }

    return answer;
  }
}