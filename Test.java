
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
 /**
  * Prüft, ob BubbleSort korrekt funktioniert.
  */
  public static void testBubbleSort() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(15,2,34,25,77,23));
    List<Integer> l1Sorted = new ArrayList<>(Arrays.asList(2,15,23,25,34,77));
    
    Main.bubbleSort(l1);
    assertListsAreEqual(l1, l1Sorted);
  }

 /**
  * Prüft, ob InsertionSort korrekt funktioniert.
  */

  public static void testInsertionSort() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(15,2,34,25,77,23));
    List<Integer> l1Sorted = new ArrayList<>(Arrays.asList(2,15,23,25,34,77));
    
    Main.insertionSort(l1);
    assertListsAreEqual(l1, l1Sorted);
  }

 /**
  * Prüft, ob SelectionSort korrekt funktioniert.
  */
  public static void testSelectionSort() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(15,2,34,25,77,23));
    List<Integer> l1Sorted = new ArrayList<>(Arrays.asList(2,15,23,25,34,77));
    
    Main.selectionSort(l1);
    assertListsAreEqual(l1, l1Sorted);
  }

 /**
  * Prüft, ob die beiden Listen gleich sind.
  * Gibt eine Fehlermeldung aus, falls sie es nicht sind.
  */
  public static void assertListsAreEqual(List l1, List l2) {
    if (!Main.listsAreEqual(l1, l2)) {
      System.out.println("Fehler, Listen sollten gleich sein, sind es aber nicht.");
      System.out.println("l1: " + l1.toString());
      System.out.println("l2: " + l2.toString());
      System.out.println();
    }
  }
}
