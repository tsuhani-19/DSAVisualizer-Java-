import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackDS stack = new StackDS();
        QueueDS queue = new QueueDS();
        LinkedListDS list = new LinkedListDS();

        while (true) {
            System.out.println("\n==== Data Structure Visualizer ====");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: stack.menu(); break;
                case 2: queue.menu(); break;
                case 3: list.menu(); break;
                case 4: 
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                default: 
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
