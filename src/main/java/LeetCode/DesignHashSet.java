package LeetCode;

//https://leetcode.com/problems/design-hashset/
class MyHashSet {
  static class Node
    {
      public int value;
      public Node next;
      public Node(int value) {
          this.value = value;
      }
    }

    public static final int size=10000;
    Node[] hashset=new Node[size];

    public MyHashSet() {

    }
    public void add(int key) {
      Node allow=hashset[key%size];
      if (allow==null)
        hashset[key%size]=new Node(key);
      else
      {
        Node current=allow;
        Node previous=current;
        while (current!=null)
        {
          if (current.value==key) return;
          previous=current;
          current=current.next;
        }
        previous.next=new Node(key);
      }

    }
    public void remove(int key) {
      Node current = hashset[key % size];
      while (current != null) {
        if (current.value == key)
          current.value = -1;
        current = current.next;
      }
    }
    public boolean contains(int key) {
       Node current = hashset[key % size];
       while (current != null) {
        if (current.value == key) return true;
        current = current.next;
       }
        return false;
    }
}
/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
public class DesignHashSet {
    public static void main(String[] args) {
      var obj=new MyHashSet();
      obj.add(10);
      obj.add(20);
      obj.add(30);
      System.out.println(obj.contains(10));
    }
}
