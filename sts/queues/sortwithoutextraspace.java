package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class sortwithoutextraspace {
  public static int getMinIndex(Queue<Integer> q, int sortindex) {
    int minind = -1;
    int minval = Integer.MAX_VALUE;
    int s = q.size();
    for (int i = 0; i < s; i++) {
      int curr = q.poll();
      if (i <= sortindex && curr <= minval) {
        minval = curr;
        minind = i;
      }
      q.offer(curr);
    }
    return minind;
  }

  public static void insertatend(Queue<Integer> q, int minind) {
    int s = q.size();
    int val = -1;
    for (int i = 0; i < s; i++) {
      int c = q.poll();
      if (i == minind) {
        val = c;
      }
      else {
        q.offer(c);
      }
    }
    q.offer(val);
  }
  public static void sortt(Queue<Integer> q) {
    int s=q.size();
    for (int i = 0; i <s ; i++) {
      int minind = getMinIndex(q, s - i-1);
      System.out.println("Mindind"+minind);
      insertatend(q, minind);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<Integer> ip = new LinkedList<>();
    String s1 = sc.nextLine();
    String a1[] = s1.split(" ");
    for (int i = 0; i < a1.length; i++) {
      ip.add(Integer.valueOf(a1[i]));
    }
    sortt(ip);
    while (!ip.isEmpty()) {
      System.out.print(ip.poll()+" ");
    }
  }
}
