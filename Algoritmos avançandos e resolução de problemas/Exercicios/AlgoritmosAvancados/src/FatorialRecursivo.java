
// Método calcularFatorial: Este método é recursivo. Ele chama a si mesmo com o valor n-1 até que n seja menor ou igual a 1.
//Caso Base: Quando n é menor ou igual a 1, o método retorna 1.
//Caso Recursivo: Para valores maiores que 1, o método retorna n multiplicado pelo resultado da chamada recursiva calcularFatorial(n - 1).
public class FatorialRecursivo {
    public static void main(String[] args) {
        int numero = 10; // Você pode mudar este valor para testar com outros números
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static long calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
