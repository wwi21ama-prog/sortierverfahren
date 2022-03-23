/*
 * In dieser Datei sind die Funktionen für die tatsächlichen Sortierverfahren
 * vorgegeben. Implementieren Sie jeweils vorher die nötigen Hilfsfunktionen.
 */

import java.util.List;

public class Sorting {
 /**
  * Sortiert die Liste mit dem Verfahren BubbleSort.
  */
  public static void bubbleSort(List<Integer> list) {
    // TODO

    // Benötigte Hilfsfunktion: SortHelpers.bubbleUp(List).

    // Rufen Sie in einer Schleife list.size() mal bubbleUp() auf.
  }

 /**
  * Sortiert die Liste mit dem Verfahren InsertionSort.
  */
  public static void insertionSort(List<Integer> list) {
    // TODO

    // Benötigte Hilfsfunktion: SortHelpers.bubbleDown(List, int).

    // Gehen Sie einmal durch die Liste und lassen Sie das jeweilige
    // Element mittels bubbleDown() absinken, bis es an der richtigen
    // Stelle steht.
  }

 /**
  * Sortiert die Liste mit dem Verfahren SelectionSort.
  */
  public static void selectionSort(List<Integer> list) {
    for (int i=0; i<list.size()-1; i++) {
      int smallestPos = SortHelpers.smallestElement(list, i);
      SortHelpers.swap(list,i,smallestPos);
    }

    // Benötigte Hilfsfunktionen: SortHelpers.smallestElement(List, int) 
    // und SortHelpers.swap(List,int,int).

    // Gehen Sie durch die Liste. In jedem Schritt suchen Sie mittels
    // smallestElement() das kleinste Element in der Rest-Liste.
    // Tauschen Sie dieses kleinste Element mit dem aktuellen.
  }
}
