package pedro.ExerciciosFixação;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares.  */
public class Ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int qntpares = 0;      
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if(vect[i]%2 == 0 ){
                System.out.print(vect[i] + " ");
                qntpares++;
                
            }
        }

        System.out.println();
        System.out.print("Quantidade de pares = " + qntpares);


        sc.close();
    }
}
