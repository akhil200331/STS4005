package linkedlists;
import java.util.*;
class listt{
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static Node head;
  static Node tail;

  public void push(int d) {
    Node p = new Node(d);
    if (head == null) {
      head = p;
      tail = head;
    } else {
      tail.next = p;
      tail = p;
    }
  }
  //display
  public void display() {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
  }
  //segregate
  public void segregate() {
    Node curr = head;
    Node et = null;
    Node eh = null;
    Node ot = null;
    Node oh = null;
    while (curr != null) {
      int d = curr.data;
      if (d % 2 == 0) {
        if (eh == null) {
          eh = new Node(d);
          et = eh;
        } else {
          et.next = new Node(d);
          et = et.next;
        }
      }
      //odd
      else {
        if (oh == null) {
          oh = new Node(d);
          ot = oh;
        } else {
          ot.next = new Node(d);
          ot = ot.next;
        }
      }
      curr = curr.next;
    } //while
    /*if (eh == null)
      return oh;
    else if (oh == null) {
      return eh;
    }
    et.next = oh;
    ot.next=null;
    return eh; */
    if (eh == null || oh == null)
      return;
    et.next = oh;
    ot.next=null;
    head = eh;
  }
}
public class segregation{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    listt l = new listt();
    System.out.println("ENter:");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      l.push(sc.nextInt());
    }
    l.display();
    l.segregate();
    l.display();
  }
}