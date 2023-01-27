package sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sort.Sort.Person;

public class SortTest {

  /**
   * This is a sample test. Edit this one and add others to test your implementation.
   */
  @Test
  public void testSample() {
    Person[] people = { 
      new Person("Rupinder", 28, 172),
      new Person("Xinjiang", 29, 182),
      new Person("Bob", 28, 171)
    };
    
    Person[] expected = { 
      new Person("Rupinder", 28, 172),
      new Person("Bob", 28, 171),
      new Person("Xinjiang", 29, 182)
    };

    assertArrayEquals(expected, Sort.sort(people)); // This test will fail
  } 
}
