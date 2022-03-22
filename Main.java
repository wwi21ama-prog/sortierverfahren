
/*
 * Hier werden alle Tests für die jeweiligen Funktionen aufgerufen.
 * Die Tests sind in Test.java definiert und zeigen, wie die Funktionen
 * gedacht sind.
 * 
 * Wenn Sie an einer Funktion arbeiten, sollten Sie jeweils alle anderen
 * Tests auskommentieren, um sich auf diese eine Funktion konzentrieren
 * zu können. Außerdem können Sie natürlich zusätzliche Testfälle und/oder
 * Ausgaben in den Test-Funktionen oder hier einführen.
 */

class Main {
  public static void main(String[] args) {
    Test.testSwap();
    Test.testBubbleUp();
    Test.testBubbleUpV2();
    Test.testBubbleDown();
    Test.testBubbleDownV2();
    Test.testSmallestElement();

    Test.testBubbleSort();
    Test.testInsertionSort();
    Test.testSelectionSort();
  }
}
