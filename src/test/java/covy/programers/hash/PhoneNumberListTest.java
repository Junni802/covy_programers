package covy.programers.hash;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class PhoneNumberListTest {

  @Test
  void solution() {
    String[] arr = {"12","123","1235","567","88"};
    solution(arr);
  }

  public boolean solution(String[] phone_book) {
    boolean answer = true;

    Map<String, Integer> map = new HashMap<>();

    for (int i=0; i<phone_book.length; i++) {
      map.put(phone_book[i], i);
    }

    for (int i=0; i<phone_book.length; i++) {
      for (int j=0; j<phone_book[i].length(); j++) {
        if (map.containsKey(phone_book[i].substring(0, j))) return false;
      }
    }
    return true;
  }

//  public boolean solution(String[] phone_book) {
//    boolean answer = true;
//
//    List<String> phoneBookList = new ArrayList<>(Arrays.asList(phone_book));
//
//    phoneBookList.sort(Comparator.comparingInt(String::length));
//
//    for (int i = 0; i < phoneBookList.size(); i++) {
//      String phoneNumber = phoneBookList.get(i);
//      phoneBookList.remove(i);
//
//      for (String s : phoneBookList) {
//        if (s.contains(phoneNumber)) {
//          return false;
//        }
//      }
//
//      // 다시 추가한다
//      phoneBookList.add(i, phoneNumber);
//    }
//
//    System.out.println("true");
//    return answer;
//  }
}