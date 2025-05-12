package covy.programers.greedy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JoystickTest {

  @Test
  void solution1() {
    solution("JAZ");
  }

  public int solution(String name) {

    String first = "ABCDEFGHIJKLMN";
    String last = "OPQRSTUVWXYZ";
    int answer = 0;

    String[] splitName = name.split("");

    int number = 1;
    int num = 1;
    for (String s : splitName) {
      if (last.contains(s)) {
        char ch = 'A';
        boolean resultYn = true;
        while (resultYn) {
          if (s.equals(ch+"")) {
            break;
          }
          if (ch == 'A') {
            ch = 'Z';
          } else {
            ch--;
          }
          answer++;
        }
      } else {
        char ch = 'A';
        boolean resultYn = true;
        while (resultYn) {
          if (s.equals(ch+"")) {
            if ("A".equals(s) && number == 2) {
              answer--;
            }
            break;
          }
          answer++;
          ch++;
        }
      }
      if (num != 1) {
        answer++;
      }
      number++;num++;
    }

    System.out.println("결과값 -> " + answer);
    return answer;
  }
}