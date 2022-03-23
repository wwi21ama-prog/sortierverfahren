
 /* Hier sind Tests implementiert, die die anderen Funktionen testen.
 * Die Tests werden aus main() heraus aufgerufen und geben Fehlermeldungen aus,
 * falls die jeweils getestete Funktion nicht korrekt arbeitet.
 * Sie sollten diese Tests nutzen, um zu prüfen, ob alles funktioniert.
 * Zusätzlich können Sie Debug-Ausgaben oder weitere Testfälle hinzufügen.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

 /**
  * Prüft, ob smallestElement() korrekt funktioniert.
  */
  public static void testSmallestElement() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(5,2,7,1,3));
    List<Integer> l2 = new ArrayList<>(Arrays.asList(1,30,4,5,2));
    List<Integer> l3 = new ArrayList<>();
    
    if (SortHelpers.smallestElement(l1,0) != 3) {
        System.out.println("Fehler: Kleinstes Element in l1 nicht korrekt bestimmt.");
    }
    if (SortHelpers.smallestElement(l2,1) != 4) {
        System.out.println("Fehler: Kleinstes Element in l2 nicht korrekt bestimmt.");
    }
    if (SortHelpers.smallestElement(l3,3) != -1) {
        System.out.println("Fehler: Kleinstes Element in l3 nicht korrekt bestimmt.");
    }
  }

 /**
  * Prüft, ob Swap korrekt funktioniert.
  */
  public static void testSwap() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    List<Integer> l1AfterSwap = new ArrayList<>(Arrays.asList(1,4,3,2,5));
    SortHelpers.swap(l1, 1,3);
    assertListsAreEqual(l1,l1AfterSwap);
  }

 /**
  * Prüft, ob BubbleUp korrekt funktioniert.
  */
  public static void testBubbleUp() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(5,1,2,3,4));
    List<Integer> l1AfterOneBubbleUp = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    SortHelpers.bubbleUp(l1);
    assertListsAreEqual(l1, l1AfterOneBubbleUp);
    
    List<Integer> l2 = new ArrayList<>(Arrays.asList(5,1,2,3,4,6,1,2));
    List<Integer> l2AfterOneBubbleUp = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,6));
    SortHelpers.bubbleUp(l2);
    assertListsAreEqual(l2, l2AfterOneBubbleUp); 
  }

 /**
  * Prüft, ob die Version von BubbleUp korrekt funktioniert, die erst ab einer
  * Position startet und aufhört, sobald nicht mehr getauscht wurde.
  */
  public static void testBubbleUpV2() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(5,1,2,6,3));
    List<Integer> l1AfterOneBubbleUp = new ArrayList<>(Arrays.asList(1,2,5,6,3));
    SortHelpers.bubbleUp(l1,0);
    assertListsAreEqual(l1, l1AfterOneBubbleUp);

    List<Integer> l2 = new ArrayList<>(Arrays.asList(5,1,2,6,3));
    List<Integer> l2AfterOneBubbleUp = new ArrayList<>(Arrays.asList(5,1,2,3,6));
    SortHelpers.bubbleUp(l2,3);
    assertListsAreEqual(l2, l2AfterOneBubbleUp);
  }

 /**
  * Prüft, ob BubbleDown korrekt funktioniert.
  */
  public static void testBubbleDown() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(2,3,4,5,1));
    List<Integer> l1AfterOneBubbleDown = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    SortHelpers.bubbleDown(l1);
    assertListsAreEqual(l1, l1AfterOneBubbleDown);
    
    List<Integer> l2 = new ArrayList<>(Arrays.asList(2,3,4,5,1,6,7,8,2));
    List<Integer> l2AfterOneBubbleDown = new ArrayList<>(Arrays.asList(1,2,3,4,5,2,6,7,8));
    SortHelpers.bubbleDown(l2);
    assertListsAreEqual(l2, l2AfterOneBubbleDown); 
  }

 /**
  * Prüft, ob die Version von BubbleUp korrekt funktioniert, die erst ab einer
  * Position startet und aufhört, sobald nicht mehr getauscht wurde.
  */
  public static void testBubbleDownV2() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(1,3,4,5,2));
    List<Integer> l1AfterOneBubbleDown = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    SortHelpers.bubbleDown(l1,4);
    assertListsAreEqual(l1, l1AfterOneBubbleDown);

    List<Integer> l2 = new ArrayList<>(Arrays.asList(1,3,4,5,2,8,9,7));
    List<Integer> l2AfterOneBubbleDown = new ArrayList<>(Arrays.asList(1,2,3,4,5,8,9,7));
    SortHelpers.bubbleDown(l2,4);
    assertListsAreEqual(l2, l2AfterOneBubbleDown);
  }

 /**
  * Prüft, ob BubbleSort korrekt funktioniert.
  */
  public static void testBubbleSort() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(15,2,34,25,77,23));
    List<Integer> l1Sorted = new ArrayList<>(Arrays.asList(2,15,23,25,34,77));
    
    Sorting.bubbleSort(l1);
    assertListsAreEqual(l1, l1Sorted);
  }

 /**
  * Prüft, ob InsertionSort korrekt funktioniert.
  */

  public static void testInsertionSort() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(15,2,34,25,77,23));
    List<Integer> l1Sorted = new ArrayList<>(Arrays.asList(2,15,23,25,34,77));
    
    Sorting.insertionSort(l1);
    assertListsAreEqual(l1, l1Sorted);
  }

 /**
  * Prüft, ob SelectionSort korrekt funktioniert.
  */
  public static void testSelectionSort() {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(15,2,34,25,77,23));
    List<Integer> l1Sorted = new ArrayList<>(Arrays.asList(2,15,23,25,34,77));
    
    Sorting.selectionSort(l1);
    assertListsAreEqual(l1, l1Sorted);
  }

 /**
  * Prüft, ob die beiden Listen gleich sind.
  * Gibt eine Fehlermeldung aus, falls sie es nicht sind.
  */
  public static void assertListsAreEqual(List<Integer> l1, List<Integer> l2) {
    if (!l1.equals(l2)) {
      System.out.println("Fehler, Listen sollten gleich sein, sind es aber nicht.");
      System.out.println("l1: " + l1.toString());
      System.out.println("l2: " + l2.toString());
      System.out.println();
    }
  }
}
