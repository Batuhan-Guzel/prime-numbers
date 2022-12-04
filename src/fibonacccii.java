import java.util.Scanner;
public class fibonacccii {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of term:");
        int select = input.nextInt();



        System.out.println(fib(select));

    }


}

