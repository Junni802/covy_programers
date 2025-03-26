package covy.programers.stock;

public class CorrectParentheses {

  boolean solution(String s) {

    String[] aplhas = s.split("");

    int num = 0;
    for (String aplha : aplhas) {
      if (aplha.equals("(")) {
        num++;
      } else if (aplha.equals(")")) {
        num--;
      }
    }

    return num == 0;
  }

}
