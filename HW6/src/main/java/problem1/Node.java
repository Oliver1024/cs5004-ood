package problem1;

import java.util.Objects;

public class Node {
  private Integer priority;
  private String value;

  public Node(Integer priority, String value) {
    this.priority = priority;
    this.value = value;
  }

  public Integer getPriority() {
    return priority;
  }

  public String getValue() {
    return value;
  }

}
