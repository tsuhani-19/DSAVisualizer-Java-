import java.util.ArrayList;
import java.util.Scanner;

public class StackDS {
    private ArrayList<Integer> stack = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void menu() {
        while (true) {
            System.out.println("\n-- Stack Menu -- ");
            System.out.println("1 : Push");
            System.out.println("2 : Pop");
            System.out.println("3 : Display");
            System.out.println("4 : Back");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the element to push : ");
                    int val = sc.nextInt();
                    push(val);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid choice !");
            }
        }
    }

    private void push(int val) {
        stack.add(val);
        System.out.println(val + " pushed to stack");
    }

    private void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty !");
        } else {
            System.out.println(stack.remove(stack.size() - 1) + " popped from stack");
        }
    }

    private void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty !");
        } else {
            System.out.println("Stack elements are : " + stack);
        }
    }
}
