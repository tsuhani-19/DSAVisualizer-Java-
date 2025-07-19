import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}

  public class LinkedListDS{
    private Node head = null;
    private Scanner sc = new Scanner(System.in);


    public void menu() {
        while (true) {
            System.out.println("\n-- Linked List Menu --");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Delete a Node (by value)");
            System.out.println("4. Display List");
            System.out.println("5. Back");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    int val1 = sc.nextInt();
                    insertAtBeginning(val1); break;
                case 2:
                    System.out.print("Enter value: ");
                    int val2 = sc.nextInt();
                    insertAtEnd(val2); break;
                case 3:
                    System.out.print("Enter value to delete: ");
                    int delVal = sc.nextInt();
                    deleteNode(delVal); break;
                case 4: display(); break;
                case 5: return;
                default: System.out.println("Invalid choice");
            }
        }
    }


    private  void insertAtBeginning(int val){
      Node newNode = new Node(val);
      newNode.next = head;
      head = newNode;
      System.out.println(val + " inserted at beginning");
    }

    private void insertAtEnd(int val){
      Node newnode  = new Node(val);
      if(head == null){
        head = newnode;
        
      }
      else{
        Node temp = head;
        while(temp.next!=null) temp =temp.next;
        temp.next = newnode;
      }
    }
    private void deleteNode(int val){
      if(head == null){
        System.out.println("List is empty !");
        return;
      }
      if(head.data == val){
        head =head.next;
        System.out.println(val + " deleted from list");
        return;
      }

      Node temp = head;
      while(temp.next!=null && temp.next.data!=val){
        temp =temp.next;
      }
      if(temp.next == null){
        System.out.println(val + " not found in list");
        return;
      }

      else{
        temp.next = temp.next.next;
        System.out.println(val + " deleted from list");
      }
    }
    private void display(){
      if(head == null){
        System.out.println("List is empty !");
        return;
      }
      Node temp = head;
      while(temp!=null){
        System.out.print(temp.data + " -> ");
        temp = temp.next;
      }
      System.out.println("null");
      
    }

  }