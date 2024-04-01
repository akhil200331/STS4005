
import java.util.*;

class listt {
  static class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
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
      p.prev = tail;
      tail = p;
    }
  }
  //display
  public void display() {
    Node curr = head;
    System.out.println("Forward Traversing:");
    while (curr != null) {
      System.out.print(curr.data + " ");
      curr = curr.next;
    }
    System.out.println();
    System.out.println("Backward Traversing:");
    Node curr2 = head;
    while (curr2.next != null) {
      curr2 = curr2.next;
    }
    while (curr2 != null) {
      System.out.print(curr2.data + " ");
      curr2 = curr2.prev;
    }
    System.out.println();
  }
public Node mergesort(Node f) {
    if (f == null || f.next == null)
      return f;
    Node s = split(f);
    f = mergesort(f);
    s = mergesort(s);
    return merge(f, s);
  }

  public Node merge(Node first, Node second) {
    if (first == null)
      return second;
    if (second == null)
      return first;
    if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;  
            return second;
        }

  }
  public Node split(Node t) {
    Node s=t;
    Node f=t;
    while (f.next != null && f.next.next != null) {
      s = s.next;
      f = f.next.next;
    }
    Node temp = s.next;
     s.next = null;
    temp.prev = null;
    return temp;
}
  //merge sort
  

  
}

public class mergesortdll {
  public static void main(String[] args) {
    listt l = new listt();
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s[] = s1.split(" ");
    for (int i = 0; i < s.length; i++) {
      l.push(Integer.valueOf(s[i]));
    }
    System.out.println("-------------Original------------");
    l.display();
    l.head = l.mergesort(l.head);
    System.out.println("-------------Sorted------------");
    l.display();
  }
}
