import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

  @Test
  public void testLength() {
    List<Integer> myList = new ArrayList<>();
    assertEquals(0, myList.size());
  }
}
