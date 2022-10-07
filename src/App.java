import java.util.Scanner;

public class App {

    public static void main(String args[]) {
        // Faça um programa que peça dois números
        // e imprima a soma        
        double numero1;
        double numero2;
        double resultado;
        // 1) Ação do usuário: digitar dois números
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro numero ");
        numero1 = teclado.nextDouble();
        System.out.print("Digite o segundo numero "); 
        numero2 = teclado.nextDouble();            
        teclado.close();
        // 2) Tarefa do programa: calcular a soma
        resultado = numero1 + numero2;
        // 3) Resposta do programa: mostrar o resultado da soma
        System.out.print("O resultado é ");
        System.out.print(resultado);

    }
}
