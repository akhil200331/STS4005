package stacks;

import java.util.Scanner;
import java.util.Stack;

class listt {
  Stack<Integer> s = new Stack<>();
  int minel;

  public void peek() {
    if (s.isEmpty()) {
      System.out.println("Not peek");
      return;
    }
    if (s.peek() < minel) {
      System.out.println(minel);
    }
    else {
      System.out.println("Peek="+s.peek());
    }
}
  public void getMin() {
    if (s.isEmpty()) {
      System.out.println("No Minimum Element");
    }
    else {
      System.out.println("Minimum Element: "+minel);
    }
}
  public void pop() {
    if (s.isEmpty()) {
      System.out.println("Not possible");
      return;
    }
    int top = s.pop();
    if (top < minel) {
      System.out.println("Popped elemnt:" + minel);
      minel = 2 * minel - top;
    }
    else {
      System.out.println("Popped elemnt:" + top);
    }
}
  public void push(int data) {
    if (s.isEmpty()) {
      minel = data;
      s.push(data);
      return;
    }
    if (data < minel) { //inserted data is minimum now then we do a operation
      s.push(2 * data - minel);
      minel = data;
    }
    else {
      s.push(data);
    }
  }
}
public class minstack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    listt s = new listt();
    //  s.push(3);
    //     s.push(5);
    //     s.getMin();
    //     s.push(2);
    //     s.push(1);
    //     s.getMin();
    //     s.pop();
    //     s.getMin();
    //     s.pop();
    //     s.peek();
    while (true) {
      System.out.println("Option:");
      int op = sc.nextInt();
      if (op == 1) {
        s.push(sc.nextInt());
      }
      else if (op == 2) {
        s.pop();
      }
      else if (op == 3) {
        s.peek();
      }
      else if (op == 4) {
        s.getMin();
      }
      else {
        break;
      }
    }
  }
}
