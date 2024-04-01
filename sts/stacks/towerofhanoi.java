package stacks;

import java.util.*;

public class towerofhanoi {
  public static void solve(int mov, Stack<Integer> src, Stack<Integer> des, Stack<Integer> aux) {
    for (int i = 1; i <= mov; i++) {
      if (i % 3 == 1) {
        if (!src.isEmpty() && (des.isEmpty() || des.peek() > src.peek())) {
          des.push(src.pop());
          System.out.println("Move-" + i + "Source to Destination");
        }
        else {
          src.push(des.pop());
          System.out.println("Move-" + i + "Destination to Source");
        }
      } //1
      else if (i % 3 == 2) {
        if (!src.isEmpty() && (aux.isEmpty() || aux.peek() > src.peek())) {
          aux.push(src.pop());
          System.out.println("Move-" + i + "Source to Auxilary");
        }
        else {
          src.push(aux.pop());
          System.out.println("Move-" + i + "Auxilary to Source");
        }
      } //2
      else {
        if (!aux.isEmpty() && (des.isEmpty() || des.peek() > aux.peek())) {
          des.push(aux.pop());
          System.out.println("Move-" + i + "Auxilary to Destination");
        }
        else {
          aux.push(des.pop());
          System.out.println("Move-" + i + "Destination to Auxilary");
        }
      }//3
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> src = new Stack<>();
    Stack<Integer> des = new Stack<>();
    Stack<Integer> aux = new Stack<>();
    int n = sc.nextInt();
    for (int i = n; i >= 1; i--) {
      src.push(i);
    }
    int totalmoves = (int) Math.pow(2, n) - 1;
    solve(totalmoves, src, des, aux);
    if (n % 2 == 0) {
      while (!aux.isEmpty()) {
        src.push(aux.pop());
      }
    }
    else {
      while (!des.isEmpty()) {
        src.push(des.pop());
      }
    }
    //print
    System.out.println("Elements");
    while (!src.isEmpty()) {
        System.out.print(src.pop()+" ");
      }
  }
}
