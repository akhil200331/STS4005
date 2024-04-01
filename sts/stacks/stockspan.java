package stacks;
import java.util.*;
public class stockspan {
  public static int[] solve(int arr[],int n) {
    int res[] = new int[n];
    res[0] = 1;
    Stack<Integer> s = new Stack<>();
    s.push(0);
    for (int i = 1; i < n; i++) {
      while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
        s.pop();
      }
      res[i] = s.isEmpty() ? (i + 1) : (i - s.peek());
      s.push(i);
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    String se[] = s.split(" ");
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.valueOf(se[i]);
    }
    int res[] = solve(arr, n);
    for (int i : res) {
      System.out.print(i+" ");
    }
  }
}