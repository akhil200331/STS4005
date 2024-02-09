import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;
public class permutations {
  public static int factorial(int n) {
    int r = 1;
    for (int i = 2; i <= n; i++) {
      r = r * i;
    }
    return r;
  }

  public static void print(char t[]) {
    for (int i = 0; i < t.length; i++) {
      System.out.print(t[i]);
    }
    System.out.println();
  }
  
  public static int numberofways(char t[]) {
    int f = factorial(t.length);
    HashMap<Character, Integer> hp = new HashMap<>();
    for (int i = 0; i < t.length; i++) {
      if (!hp.containsKey(t[i])) {
        hp.put(t[i], 1);
      } else {
        hp.put(t[i], hp.get(t[i]) + 1);
      }
    }
    for (Map.Entry e : hp.entrySet()) {
      Integer x = (Integer) e.getValue();
      if (x > 1) {
        f = f / factorial(x);
      }
    }
    return f;
  }


  public static void printallpermutations(String s) {
    char t[] = s.toCharArray();
    Arrays.sort(t);
    print(t);
    int total = numberofways(t);
    //System.out.println("t="+total);
    for (int i = 1; i < total; i++) {
      nextpermutation(t);
    }
  }
  
  public static void nextpermutation(char[] t) {
    int i;
    for (i = t.length - 1; i >= 1; i--) {
      if (t[i] > t[i - 1])
        break;
    }
    int j;
    int min = i;
    char x = t[i - 1];
    for (j = i + 1; j < t.length; j++) {
      if (t[j] < t[min] && t[j] > x) {
        min = j;
      }
    }
    char ty = t[i - 1];
    t[i - 1] = t[min];
    t[min] = ty;
    Arrays.sort(t, i, t.length);
    print(t);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    printallpermutations(s);
  }
}
