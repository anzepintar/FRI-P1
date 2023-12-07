
public class Test05 {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(0, -3);
        for (int i = 1;  i <= 25;  i++) {
            System.out.println(fib.naslednji());
        }
    }
}
