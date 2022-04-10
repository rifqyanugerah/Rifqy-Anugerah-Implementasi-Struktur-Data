import java.util.Arrays;

public class Insertion {

  void insertionSort(int array[]) {
    int size = array.length;

    for (int step = 1; step < size; step++) {
      int key = array[step];
      int j = step - 1;

      while (j >= 0 && key < array[j]) {
        array[j + 1] = array[j];
        --j;
      }

      array[j + 1] = key;
    }
  }

  public static void main(String args[]) {
    int[] data = { 6, 22, 2, 10, 8, 7, 100, 1, 3,5 };
    insertion1 is = new insertion1();
    is.insertionSort(data);

    System.out.println(Arrays.toString(data));
  }
}
