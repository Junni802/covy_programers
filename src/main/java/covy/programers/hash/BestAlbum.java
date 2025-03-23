package covy.programers.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BestAlbum {

  public int[] solution(String[] genres, int[] plays) {

    Map<String, Integer> popularGeners = new HashMap<>();

    for(int i=0; i<genres.length; i++) {
      popularGeners.put(genres[i], popularGeners.getOrDefault(genres[i], 0) + plays[i]);
    }

    List<Entry<String, Integer>> entryList = new ArrayList<>(popularGeners.entrySet());
    entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
    List<Integer> arr = new ArrayList<>();

    for (int i=0; i<entryList.size(); i++) {
      Map<Integer, Integer> num = new HashMap<>();
      for (int j=0; j<plays.length; j++) {

        if (genres[j].equals(entryList.get(i).getKey())) {
          num.put(j, plays[j]);
        }
      }
      if (num.size() == 1) {
        for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
          arr.add(entry.getKey());
          break;  // 첫 번째 항목만 가져오고 루프 종료
        }
      } else {
        List<Map.Entry<Integer, Integer>> entryList1 = new ArrayList<>(num.entrySet());
        entryList1.sort((a, b) -> {
          int keyComparison = b.getValue().compareTo(a.getValue());
          if (keyComparison == 0) {
            return a.getKey().compareTo(b.getKey());
          }
          return keyComparison;
        });
        arr.add(entryList1.get(0).getKey());
        arr.add(entryList1.get(1).getKey());
      }
    }

    int[] answer = new int[arr.size()];
    for (int i=0; i<arr.size(); i++) {
      answer[i] = arr.get(i);
      System.out.println(arr.get(i));
    }

    return answer;
  }

}
