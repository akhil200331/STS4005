//21BCE9784
//VADDI AKHIL

import java.util.*;

public class combination {
  public static void NumberofWays(int elements[], int r) {
    int res[] = new int[r]; // this for combination purpose
    combinations(elements, res, 0, 0, r);
  }
  //This is for generating all the outputs
  private static void combinations(int el[], int res[], int start, int ind, int r) { // r=Number of positions of the combination number
    if (ind == r) { //for a combination if number of elements is same as pointer then it prints the output
      System.out.println(Arrays.toString(res));
      return;
    }
    for (int i = start; i < el.length; i++) {
      res[ind] = el[i];
      combinations(el, res, i+1, ind+1, r);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in array:");
    int n = sc.nextInt(); //n number of elements
    System.out.println("Positions:");
    int r = sc.nextInt(); // no of positions of number
    int arr[] = new int[n];
    for (int i = 1; i <= n; i++) {
      arr[i-1] = i;
    }
    NumberofWays(arr, r);
  }
}
