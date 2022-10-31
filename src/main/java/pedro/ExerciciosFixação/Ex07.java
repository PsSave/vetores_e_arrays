package pedro.ExerciciosFixação;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */
public class Ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();            
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        double mv = soma / n;
        System.out.printf("Média dos vetores: %.3f%n", mv );

        System.out.printf("Elementos abaixo da nedia: \n");
        for (int i = 0; i < n; i++) {
            if(vect[i] < mv){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
