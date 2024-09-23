//Complexidade de Tempo:
//A complexidade de tempo desta abordagem é O(n).
//Assim como na abordagem top-down, cada valor de Fibonacci é calculado apenas uma vez, resultando em um crescimento linear.
public class FibonacciBottomUp {
    public static void main(String[] args) {
        int n = 10; // Você pode mudar este valor para testar com outros números
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}
