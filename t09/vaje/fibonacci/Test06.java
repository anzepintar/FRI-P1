
public class Test06 {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(32, 150);
        for (int i = 1;  i <= 4;  i++) {
            System.out.println(fib.naslednji());
        }
    }
}
