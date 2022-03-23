/*
 * Hier sind Vorgaben für Hilfsfunktionen, die zunm Sortieren hilfreich sind.
 * 
 * Implementieren Sie auf jeden Fall zuerst swap(), da diese in den meisten
 * anderen Funktionen gebraucht wird oder zumindest sinnvoll ist.
 */

import java.util.List;

class SortHelpers {

 /**
  * Vertauscht die Elemente an den Positionen i und j.
  */
  public static void swap(List<Integer> list, int i, int j) {
    int h = list.get(i);
    list.set(i,list.get(j));
    list.set(j,h);
  }

 /**
  * Läuft von links nach rechts durch die Liste und vergleicht dabei jedes Element
  * mit seinem rechten Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  */
  public static void bubbleUp(List<Integer> list) {
    // TODO
  }

  /**
  * Läuft von links nach rechts durch die Liste und vergleicht dabei jedes Element
  * mit seinem rechten Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  * Startet bei Position start und stoppt, sobald einmal nicht vertauscht wurde.
  */
  public static void bubbleUp(List<Integer> list, int start) {
    // TODO
  }

  /**
  * Läuft von rechts nach links durch die Liste und vergleicht dabei jedes Element
  * mit seinem linken Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  */
  public static void bubbleDown(List<Integer> list) {
    // TODO
  }

 /**
  * Läuft von rechts nach links durch die Liste und vergleicht dabei jedes Element
  * mit seinem linken Nachbarn.
  * Wenn die beiden Elemente falsch sortiert sind, werden sie vertauscht.
  * Startet bei Position start und stoppt, sobald einmal nicht vertauscht wurde.
  */
  public static void bubbleDown(List<Integer> list, int start) {
    // TODO
  }
  
  /**
   * Sucht das kleinste Element in der Liste und gibt dessen Position
   * zurück. Startet erst ab Position start.
   */
  public static int smallestElement(List<Integer> list, int start) {
    if (start >= list.size() || start < 0) {
      return -1;
    }
    
    int smallestPos = start;
    for (int i=start+1; i<list.size(); i++) {
      if (list.get(i) < list.get(smallestPos)) {
        smallestPos = i;
      }
      
    }
    return smallestPos;
  }
}
