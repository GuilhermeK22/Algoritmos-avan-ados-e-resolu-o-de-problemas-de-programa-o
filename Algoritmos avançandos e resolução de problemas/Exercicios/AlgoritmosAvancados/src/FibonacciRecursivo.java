//Complexidade de Tempo:
//A complexidade de tempo desta abordagem é O(2^n).
//Isso ocorre porque cada chamada da função fibonacci resulta em duas chamadas adicionais, levando a um crescimento exponencial.
public class FibonacciRecursivo {
    public static void main(String[] args) {
        int n = 10; // Você pode mudar este valor para testar com outros números
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}