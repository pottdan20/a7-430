import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.omg.IOP.CodecPackage.TypeMismatch;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {

  //List description
  //A List is an ordered and indexed collection of elements. an element can be of any type.


  // ONLY USE THIS FUNCTION TO CONSTRUCT LISTS FOR TESTING...
  public <E> List<E>makeList(E[] array){
    return new ArrayList<E>(Arrays.asList(array));
  }
  

  // the length() method:

  // Specification:

  // This part should be a textual specification of
  // how the length method should behave...

  // Tests:

  @Test
  public void testLength1() {
    Integer[] ar = {3,4,5};
    List<Integer> l = makeList(ar);
    assertEquals(3, l.size());
  }
  @Test
  public void testLength2() {
    Integer[] ar = {};
    List<Integer> l = makeList(ar);
    assertEquals(0, l.size());
  }

  //the add method:
  //specification
  //adds an element of correct type to the end of a list.
  @Test
  public void testAdd1() {
    Integer[] ar = {};
    List<Integer> l = makeList(ar);
    l.add(15);
    assertEquals(1, l.size());
  }
  @Test
  public void testAdd2() {
    Integer[] ar = {12};
    List<Integer> l = makeList(ar);
    l.add(15);
    l.add(0);
    assertEquals(3, l.size());
  }


  //contains
  //specification:
  // contains takes an element of the type in the list. returns true if this element exists in list
  @Test
  public void testContains1() {
    Integer[] ar = {12};
    List<Integer> l = makeList(ar);
    l.add(15);
    l.add(0);
    assertTrue(l.contains(15));
  }

  @Test
  public void testContains2() {
    Integer[] ar = {};
    List<Integer> l = makeList(ar);
    assertFalse(l.contains(105));
  }

  //get
  // returns the element at the index specified in the get function. expects index in range, otherwise throws error

  @Test
  public void testGet1() {
    Integer[] ar = {12, 14, 15};
    List<Integer> l = makeList(ar);
    assertEquals(12, l.get(0));
  }

  @Test
  public void testGet2() {
    Integer[] ar = {11,12};
    List<Integer> l = makeList(ar);
    assertEquals(12, l.get(1));
  }

  @Test
  public void testGet3() {
    Integer[] ar = {12, 14, 15};
    List<Integer> l = makeList(ar);
    assertThrows(IndexOutOfBoundsException.class, () -> l.get(3));
  }

  //indexOf
  //returns first index of a matching element from the argument passed to indexOf func. returns -1 if element not found

  @Test
  public void testIndexOf1() {
    Integer[] ar = {12, 14, 15};
    List<Integer> l = makeList(ar);
    assertEquals(1, l.indexOf(14));
  }
  @Test
  public void testIndexOf2() {
    Integer[] ar = {};
    List<Integer> l = makeList(ar);
    assertEquals(-1, l.indexOf(14));
  }
  @Test
  public void testIndexOf3() {
    Integer[] ar = {11, 12, 14, 14, 14};
    List<Integer> l = makeList(ar);
    assertEquals(2, l.indexOf(14));
  }

  //remove
  //takes an index and removes the element at that index, then decreasing the list size by one. throws an error if
  //index is out of range. returns the removed elemet
  @Test
  public void testRemove1() {
    Integer[] ar = {11, 12, 14, 15, 16};
    List<Integer> l = makeList(ar);
    assertEquals(15, l.remove(3));
  }
  @Test
  public void testrem2() {
    Integer[] ar = {12, 14, 15};
    List<Integer> l = makeList(ar);
    assertThrows(IndexOutOfBoundsException.class, () -> l.remove(9));
  }

  //sublist(a,b)
  //returns a list of elements from index a to index b non-inclusive on b.
  @Test
  public void testsub1() {
    Integer[] ar = {12, 14, 15,16,17};
    List<Integer> l = makeList(ar);
    Integer[] ar2 = {14, 15,16};
    List<Integer> l2 = makeList(ar2);
    assertEquals(l2, l.subList(1,4));
  }

  @Test
  public void testsub2() {
    Integer[] ar = {12, 14, 15,16,17};
    List<Integer> l = makeList(ar);
    assertThrows(IndexOutOfBoundsException.class, () -> l.subList(3,8));
  }
}
