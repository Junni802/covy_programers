package covy.programers.hashset;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;


public class HashSetTest {

  @Test
  public void testHashSet() {
    Set<User> set = new HashSet<>();
    set.add(new User(1));
    set.add(new User(1));

    System.out.println("결과값 -> " + set.size());

  }



}
