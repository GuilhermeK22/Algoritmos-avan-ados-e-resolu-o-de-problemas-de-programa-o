import java.util.HashMap;
import java.util.Map;

//Complexidade de Tempo:
//A complexidade de tempo desta abordagem é O(n).
//Cada valor de Fibonacci é calculado apenas uma vez e armazenado, resultando em um crescimento linear.
public class FibonacciTopDown {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10; // Você pode mudar este valor para testar com outros números
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int resultado = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, resultado);
        return resultado;
    }
}
