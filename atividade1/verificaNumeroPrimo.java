package atividade1;

public class verificaNumeroPrimo {

    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0; // Números menores ou iguais a 1 não são primos
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; // Número divisível por outro valor além de 1 e ele mesmo, não é primo
            }
        }
        
        return 1; // O número é primo
    }
    
    public static void main(String[] args) {
        Integer numero = 17; // Coloque o número que deseja verificar aqui
        
        int resultado = verificaNumeroPrimo(numero);
        
        if (resultado == 1) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
