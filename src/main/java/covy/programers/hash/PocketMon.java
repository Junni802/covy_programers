package covy.programers.hash;

import java.util.Arrays;

public class PocketMon {

  public int solution(int[] nums) {
    int answer = 0;
    int halfNum = nums.length / 2;

    int [] newArr = Arrays.stream(nums).distinct().toArray();

    if (halfNum >= newArr.length) {
      return halfNum;
    } else {
      return newArr.length;
    }
  }
}
