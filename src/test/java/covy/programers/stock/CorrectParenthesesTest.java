package covy.programers.stock;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CorrectParenthesesTest {

  @Test
  void solution1() {
    solution("(()(");

  }

  public boolean solution(String s) {

    String[] aplhas = s.split("");

    int num = 0;
    for (String aplha : aplhas) {
      if (aplha.equals("(")) {
        num++;
      } else if (aplha.equals(")")) {
        num--;
      }

      if (num < 0) {
        return false;
      }
    }
    return num == 0;
  }
}