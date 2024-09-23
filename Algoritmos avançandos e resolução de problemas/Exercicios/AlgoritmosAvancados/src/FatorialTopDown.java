import java.util.HashMap;
import java.util.Map;
//Abordagem Top-Down (Memorização):
//Utiliza recursão.
//Armazena os resultados intermediários em uma estrutura de dados (como um mapa) para evitar cálculos repetidos.
//Pode ser mais intuitiva para problemas que são naturalmente recursivos.
//Pode levar a um maior uso de memória devido à pilha de chamadas recursivas.
public class FatorialTopDown {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        int numero = 5; // Você pode mudar este valor para testar com outros números
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static long calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long resultado = n * calcularFatorial(n - 1);
        memo.put(n, resultado);
        return resultado;
    }
}
