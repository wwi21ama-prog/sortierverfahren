# Sortierverfahren

Dieses Repo enthält Beispiele/Aufgaben für die Implementierung verschiedener Sortierverfahren in Java.

## Aufgaben

### InsertionSort

1. Implementieren Sie die Funktion `bubbleDown(List, int)`.
   Diese Funktion läuft von rechts nach links durch die Liste und vergleicht jedes Element
   mit seinem linken Nachbarn. Wenn diese beiden in der falschen Reihenfolge sind, werden
   sie vertauscht.
   Die Funktion startet an der angegebenen Position und stoppt, sobald einmal nicht getauscht wurde.

2. Implementieren Sie die Funktion `insertionSort(List)`.
   Diese Funktion wendet auf jedes Element einmal `bubbleDown()` an.

### SelectionSort

1. Implementieren Sie die Funktion `smallesElement(List, int)`.
   Diese Funktion sucht in der Liste ab der angegebenen Position nach
   dem kleinsten Element und liefert dessen Position zurück.

2. Implementieren Sie die Funktion `selectionSort(List)`.
   Diese Funktion tauscht nacheinander jedes Element mit dem kleinsten
   in der Liste, die ab diesem Element startet.

### BubbleSort

1. Implementieren Sie die Funktion `bubbleUp(List)`.
   Diese Funktion läuft von links nach rechts durch die Liste und vergleicht jedes Element mit seinem rechten
   Nachbarn. Wenn diese beiden in der falschen Reihenfolge sind, werden sie vertauscht.

2. Implementieren Sie die Funktion `bubbleSort(List)`.
   Diese Funktion wendet (bis zu) list.size() mal `bubbleUp()` an, am Ende ist die Liste
   sortiert.

### MergeSort

Implementieren Sie den Sortieralgorithmus *MergeSort*.
Dieser Algorithmus zerlegt die zu sortierende Liste in zwei gleich große Teillisten.
Diese sortiert er rekursiv und führt die Teillisten anschließend zusammen.

Implementieren Sie zu diesem Zweck Hilfsfunktionen, die die Liste zerlegen und wieder zusammenführen können.

### QuickSort

Implementieren Sie den Sortieralgorithmus *QuickSort*.
Dieser Algorithmus teilt die zu sortierende Liste in zwei Teillisten auf.
Die eine enthält alle Elemente, die kleiner sind als das erste Element,
die andere alle übrigen. Das erste Element ist in keiner der Listen enthalten.
Die Teillisten werden rekursiv sortiert und wieder aneinandergehängt.

Implementieren Sie zu diesem Zweck Hilfsfunktionen, die die Liste zerlegen und wieder zusammenführen können.
