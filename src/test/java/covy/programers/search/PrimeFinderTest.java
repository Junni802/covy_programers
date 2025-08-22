package covy.programers.search;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class PrimeFinderTest {
  List<Integer> list = new ArrayList<>();
  boolean[] resultYn = new boolean[7];

  public int solution(String numbers) {
    int answer = 0;

    for (int i=0; i<numbers.length(); i++) {
      dfs(numbers, "", i + 1);
    }

    for(int i=0; i<list.size(); i++){
      if(prime(list.get(i))) answer++;
    }

    return answer;
  }

  /**
   * 재귀호출
   *
   * @param str: 문제 안에서의 숫자 문자열
   * @param tmp: 재귀호출로 인하여 만듫어지는 숫자 문자열
   * @param m: 현재 몇번쨰 숫자를 구해야 하는지 알 수 있는 수
   */
  public void dfs(String str, String tmp, int m) {
    // tmp의 사이즈가 원하는 자리수와 같을 경우
    if (tmp.length() == m) {
      int num = Integer.parseInt(tmp);
      // list안에 해당 값이 없을 경우
      if (!list.contains(num)) {
        list.add(num);
      }
    }

    for (int i=0; i<str.length(); i++) {
      // 등록이 안된 번호인 경우
      if (!resultYn[i]) {
        resultYn[i] = true;
        tmp += str.charAt(i);
        dfs(str, tmp, m);
        resultYn[i] = false;
        tmp = tmp.substring(0, tmp.length()-1);
      }
    }
  }

  public boolean prime(int n) {
    if(n<2) return false;

    for(int i=2; i*i<=n; i++) {
      if(n % i == 0) return false;
    }

    return true;
  }

}