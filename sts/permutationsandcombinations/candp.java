package permutationsandcombinations;

public class candp {
  static int count = 0;
  public static void combinations(int arr[], int n, int r, int ind, int data[], int i) {
    if (ind == r) {
      System.out.println(count);
      for (int k = 0; k < r; k++) {
        System.out.print(data[k] + " ");
      }
      System.out.println();
      count++;
      return;
    }
    if (i >= n) {
      return;
    }
    data[ind] = arr[i];
    combinations(arr, n, r, ind + 1, data, i + 1);
    combinations(arr, n, r, ind, data, i+1);
  }
  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 5, 6 };
    int r = 3;
    int data[] = new int[r];
    combinations(arr, arr.length, r, 0, data, 0);
  }
}
