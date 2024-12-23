import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tos = -1;
        int maxsize = 5;
        int[] stack = new int[maxsize];
        while (true) {
            System.out.println("enter your choise");
            System.out.println("enter 1 to push");
            System.out.println("enter 2 to pop");
            System.out.println("enter 3 to display");
            System.out.println("enter 4 to exit");

            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    if (tos == maxsize - 1) {
                        System.out.println("stack overflow");
                    } else {
                        tos++;
                        System.out.println("enter the data item");
                        int data = sc.nextInt();
                        stack[tos] = data;
                    }
                    System.out.println("push successful");
                    break;
                case 2:
                    if (tos == -1) {
                        System.out.println("stack underflow");
                    } else {
                        System.out.println("enter the data item to delete");
                        int data = sc.nextInt();
                        data = stack[tos];

                        System.out.println("data deleted");
                        tos--;
                    }
                    System.out.println("pop");
                    break;
                case 3:
                    for (int element : stack){
                        System.out.println(element);
                    }
                    System.out.println("desplay");
                    break;
                case 4:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("not in choise");
            }

        }
    }
}
