package covy.programers.stock;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class StockPriceTest {

  @Test
  void solution1() {
    int[] price = {3, 2, 3, 2, 3};
    solution(price);
  }

  public int[] solution(int[] prices) {

    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] > prices[j]) {
          list.add(j - i);
          j=prices.length;
        }
        if (j == prices.length - 1 && i != prices.length - 1) {
          list.add((prices.length - 1) - i);
        }
      }
      if (i==prices.length - 1) {
        list.add(0);
      }
    }

    int[] answer = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      answer[i] = list.get(i);
      System.out.println("값 보자 -> " + answer[i]);
    }
    return answer;
  }
}