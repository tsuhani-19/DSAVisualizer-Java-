import java.util.LinkedList;
import java.util.Scanner;

public class QueueDS{
  private LinkedList<Integer> queue = new LinkedList<>();
  private Scanner  sc = new Scanner(System.in);

  public void menu(){

  while(true){
  System.out.println("\n -- Queue Menu -- ");
  System.out.println("1 : Enqueue");  
  System.out.println("2 : Dequeue");
  System.out.println("3 : Display");
  System.out.println("4 : Back");
  System.out.println("Enter your choice : ");

  int ch = sc.nextInt();

  switch(ch){
    case 1:
      System.out.println("Enter the element to enqueue : ");
      int val = sc.nextInt();
      enqueue(val);
      break;


    case 2:
      dequeue();
      break;
    case 3: 
      display();
      break;

    case 4 : 
      return;

      default: System.out.println("Invalid choice !");
      
      
  }
  }
}

  private void enqueue(int val){
    queue.addLast(val);
    System.out.println(val + " enqueued to queue");;
  }

  private void dequeue(){
    if(queue.isEmpty()){
      System.out.println("Queue is empty !");
    }
    else{
      System.out.println(queue.removeFirst() + " dequeued from queue");
    }
  }

  private void display(){
    if(!queue.isEmpty()){
      System.out.println("Queue is empty !");
    }
    else{
      System.out.println("Queue elements are : " + queue);
    }
  }
}

