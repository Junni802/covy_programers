package covy.programers.hash;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class PocketMonTest {

  @Test
  void solution() {

    // 테스트 배열
    int[] nums = {3, 1, 2, 3};

    // solution 메소드 호출하고 결과를 저장
    int result = solution(nums);


  }

  public int solution(int[] nums) {
    return Arrays.stream(nums)
        .boxed()
        .collect(Collectors.collectingAndThen(Collectors.toSet(),
            phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
  }

//  public int solution(int[] nums) {
//    int answer = 0;
//    int halfNum = nums.length / 2;
//
//    int[] newArr = Arrays.stream(nums).distinct().toArray();
//    System.out.println(halfNum + "," + newArr.length);
//
//    if (halfNum <= newArr.length) {
//      System.out.println(halfNum);
//      return halfNum;
//    } else {
//      System.out.println(newArr.length);
//      return newArr.length;
//    }
//  }
}