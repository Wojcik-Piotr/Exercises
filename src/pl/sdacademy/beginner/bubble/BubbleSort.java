package pl.sdacademy.beginner.bubble;

public class BubbleSort {

    public int[] sort(int[] elements) {
      while (iterateAndSwap(elements));
      return elements;
    }


    private boolean iterateAndSwap(int[] elements) {
        boolean swapped = false;
        for (int i = 0; i < elements.length - 1; i++)
            if (elements[i] > elements[i + 1]) {
                swap(elements, i, i + 1);
                swapped = true;
            }
            return swapped;
    }

    private void swap(int[] elements, int source, int dest) {
        int temp = elements[source];
        elements[source] = elements[dest];
        elements[dest] = temp;
    }

}
