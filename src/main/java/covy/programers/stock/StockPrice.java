package covy.programers.stock;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {

  public int[] solution(int[] prices) {

    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] > prices[j]) {
          list.add((prices.length - 1) - j);
          break;
        }
        if (j == prices.length - 1) {
          list.add((prices.length - 1) - j);
        }
      }
    }

    int[] answer = {};
    return answer;
  }

}
