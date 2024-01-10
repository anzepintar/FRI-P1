
public class Test03 {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(0, 0);
        for (int i = 1;  i <= 5;  i++) {
            System.out.println(fib.naslednji());
        }
    }
}
