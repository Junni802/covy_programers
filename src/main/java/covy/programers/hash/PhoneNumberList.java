package covy.programers.hash;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PhoneNumberList {

  public boolean solution(String[] phone_book) {
    boolean answer = true;

    List<String> phoneBookList = Arrays.asList(phone_book);

    phoneBookList.sort(Comparator.comparingInt(String::length));

    for (int i=0; i<phoneBookList.size(); i++) {
      String phoneNumber = phoneBookList.get(i);
      phoneBookList.remove(i);

      if (phoneBookList.contains(phoneNumber)) {
        return false;
      }

      // 다시 추가한다
      phoneBookList.add(i, phoneNumber);
    }

    return answer;
  }

}
