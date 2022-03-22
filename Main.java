import java.util.List;

class Main {
  public static void main(String[] args) {
    Test.testBubbleSort();
  }

 /**
  * Erwartet zwei Listen und prüft, ob sie gleich sind.
  */
  public static boolean listsAreEqual(List l1, List l2) {
    // TODO
    return false;
  }

 /** Erwartet eine Liste und prüft, ob diese sortiert ist. */
  public static boolean isSorted(List list) {
    // TODO
    return false;
  }

 /**
  * Vertauscht die Elemente an den Positionen i und j.
  */
  public static void swap(List list, int i, int j) {
    // TODO
  }

  /**
  * Läuft von links nach rechts durch die Liste und vergleicht dabei jedes Element
  * mit seinem rechten Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  */
  public static void bubbleUp(List list) {
    // TODO
  }

  /**
  * Läuft von links nach rechts durch die Liste und vergleicht dabei jedes Element
  * mit seinem rechten Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  * Startet bei Position start und stoppt, sobald einmal nicht vertauscht wurde.
  */
  public static void bubbleUp(List list, int start) {
    // TODO
  }

  /**
  * Läuft von rechts nach links durch die Liste und vergleicht dabei jedes Element
  * mit seinem linken Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  */
  public static void bubbleDown(List list) {
    // TODO
  }

 /**
  * Läuft von rechts nach links durch die Liste und vergleicht dabei jedes Element
  * mit seinem linken Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  * Startet bei Position start und stoppt, sobald einmal nicht vertauscht wurde.
  */
  public static void bubbleDown(List list, int start) {
    // TODO
  }

 /**
  * Sucht das kleinste Element in der Liste und gibt dessen Position
  * zurück. Startet erst ab Position start.
  */
  public static int smallestElement(List list) {
    // TODO
    return -1;
  }

 /**
  * Sortiert die Liste mit dem Verfahren BubbleSort.
  */
  public static void bubbleSort(List list) {
    // TODO
    // In einer Schleife so oft bubbleUp() aufrufen, wie nötig.
    // list.size() mal.
    // Evtl. Optimierungen einbauen.
  }

 /**
  * Sortiert die Liste mit dem Verfahren InsertionSort.
  */
  public static void insertionSort(List list) {
    // TODO
  }

 /**
  * Sortiert die Liste mit dem Verfahren SelectionSort.
  */
  public static void selectionSort(List list) {
    // TODO
  }
}
