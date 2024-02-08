import java.io.*;
import java.util.Scanner;

public class combinations {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();
    int arr[] = new int[n];
    int data[] = new int[r];
    for (int i = 0; i < n; i++) {
      arr[i] = i+1;
    }
    CombinationUtil(arr, n, r, 0, data, 0); //index represnts to data i represents to pointer for original array
  }

  private static void CombinationUtil(int[] arr, int n, int r, int index, int[] data, int i) {
    if (index == r) {
      for (int k = 0; k < r; k++) {
        System.out.print(data[k] + " ");
      }
      System.out.println();
      return;
    }
    if (i >= n){
      return;
    }
    data[index] = arr[i]; //store an element
    CombinationUtil(arr, n, r, index + 1, data, i + 1); //pointer to new element and present element included
    CombinationUtil(arr, n, r, index, data, i+1); // searching for new combination with fresh start of the element
  }
}
