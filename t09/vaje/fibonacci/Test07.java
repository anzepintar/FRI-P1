
public class Test07 {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(9, -6);
        for (int i = 1;  i <= 10;  i++) {
            System.out.println(fib.naslednji());
        }
    }
}
