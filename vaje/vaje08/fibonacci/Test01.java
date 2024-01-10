
public class Test01 {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(5, 2);
        for (int i = 1;  i <= 10;  i++) {
            System.out.println(fib.naslednji());
        }
    }
}
