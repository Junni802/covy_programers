package covy.programers.dfs_bfs;

public class ConverterWord {

  static boolean[] visited;
  static int answer = 1;

  /**
   * 단어변환 Programers
   *
   * @param begin
   * @param target
   * @param words
   * @return
   */
  public int solution(String begin, String target, String[] words) {
    visited = new boolean[words.length];

    dfs(begin, target, words, 0);
    return answer;
  }

  public static void dfs(String begin, String target, String[] words, int cnt) {
    if (begin.equals(target)) {
      answer = cnt;
      return;
    }

    for (int i = 0; i < words.length; i++) {
      if (visited[i]) {
        continue;
      }

      int k = 0;
      for (int j=0; j<begin.length(); j++) {
        if (begin.charAt(j) == words[i].charAt(j)) {
          k++;
        }
      }


      if (k == begin.length() - 1) {
        visited[i] = true;
        dfs(words[i], target, words, cnt + 1);
        visited[i] = false;
      }
    }
  }

}
