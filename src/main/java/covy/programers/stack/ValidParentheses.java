package covy.programers.stack;

public class ValidParentheses {

  boolean solution(String s) {
    int answer = 0;

    char[] ch = s.toCharArray();

    for(int i=0; i<ch.length; i++) {
      if(ch[i] == '(') {
        answer++;
      } else if(ch[i] == ')') {
        answer--;
      }

      if (answer < 0) {
        return false;
      }
    }

    return answer == 0;
  }

}
