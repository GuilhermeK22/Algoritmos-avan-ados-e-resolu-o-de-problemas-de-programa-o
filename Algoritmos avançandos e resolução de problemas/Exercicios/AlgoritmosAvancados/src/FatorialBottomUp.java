//Abordagem Bottom-Up (Iterativa):
//Utiliza iteração.
//Constrói a solução a partir dos casos base, iterando até o valor desejado.
//Geralmente mais eficiente em termos de uso de memória, pois evita a sobrecarga da pilha de chamadas recursivas.
//Pode ser menos intuitiva para problemas que são naturalmente recursivos, mas é mais eficiente em termos de tempo e espaço.
public class FatorialBottomUp {
    public static void main(String[] args) {
        int numero = 20; // Você pode mudar este valor para testar com outros números
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    public static long calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        long[] fatorial = new long[n + 1];
        fatorial[0] = 1;
        fatorial[1] = 1;
        for (int i = 2; i <= n; i++) {
            fatorial[i] = i * fatorial[i - 1];
        }
        return fatorial[n];
    }
}
