package covy.programers.hashset;

import java.util.Objects;

public class User {

  int id;

  public User(int i) {}

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return false;
    if (! (o instanceof User)) return false;
    return this.id == ((User) o).id;
  }

}
