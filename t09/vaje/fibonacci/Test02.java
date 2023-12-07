
public class Test02 {

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci(0, 1);
        for (int i = 1;  i <= 20;  i++) {
            System.out.println(fib.naslednji());
        }
    }
}
