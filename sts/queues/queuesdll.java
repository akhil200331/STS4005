package queues;

import java.util.*;

class listt {
  class Node {
    int priority;
    char data;
    Node next, prev;

    Node(char data, int priority) {
      this.data = data;
      this.priority = priority;
      this.next = null;
      this.prev = null;
    }
  }

  Node head, tail;

  public boolean isEmpty() {
    return head == null;
  }

  public void display() {
    if (head == null) {
      System.out.println("Not possible");
      return;
    }
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data);
      curr = curr.next;
    }
  }
  //pop
  public char pop() {
    if (isEmpty()) {
      System.out.println("Not possible to pop");
    }
    Node temp = head;
    char p = temp.data;
    head = head.next;
    if (isEmpty()) {
      tail = null;
    }
    return p;
  }

  public char peek() {
    return head.data;
  }
  //push
  public void push(char c, int pr) {
    Node temp=new Node(c,pr);
    if (head == null) {
      head = new Node(c, pr);
      tail = head;
      return;
    }
    if (pr <= head.priority) {
      temp.next = head;
      head.prev = temp;
      head = temp;
    }
    else if (pr >= tail.priority) {
      tail.next = temp;
      temp.prev = tail;
      tail = temp;
    }
    else {
      Node start = head.next;
      while (start.priority < pr) {
        start = start.next;
      }
      start.prev.next = temp;
      temp.prev = start.prev;
      temp.next = start;
      start.prev = temp;
    }
  }
}
public class queuesdll {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    listt l = new listt();
    l.push('b', 3);
    l.push('c', 4);
    l.push('e', 6);
    l.push( 'f', 7);
    l.push( 'a', 2);
    l.push( 'd', 5);
    l.display();
    System.out.println();
    System.out.println(l.peek());
    System.out.println(l.pop());
System.out.println(l.peek());
  }  
}
