import java.util.*;

public class maxequuilibrium {
  public static void max_equilibrium(int arr[]) {
    
    int res=Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int ps = 0;
      int ss = 0;
      for (int j = 0; j < i; j++) {
        ps += arr[j];
      }
      for (int k = i + 1; k < arr.length; k++) {
        ss += arr[k];
      }
      if (ss == ps) {
        res = Math.max(res, ps);
      }
    }
    System.out.println("result="+res);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();// number of elemnets in an array
    int arr[] = new int[n];// array declaration
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt(); //taking input
    }
    max_equilibrium(arr);
  }
}
