package pedro.ExerciciosFixação;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double alturaTotal, alturaMedia, porcentagem; 

        System.out.print("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura =  new double[n];

        for (int i = 0, a = 1; i < n; i++, a++) {
            System.out.println("Dados da " + a + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }

        nmenores = 0;
        alturaTotal = 0.0;
        for (int i = 0; i < n; i++) {
            if(idade[i] < 16) {
                nmenores++;
            }

            alturaTotal += altura[i];
        }
    
        alturaMedia = alturaTotal / n;
        porcentagem = ((double)nmenores * n) / 100.0;

        System.out.println("Altura média: " + alturaMedia);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem);

        for (int i = 0; i < n; i++) {
            if(idade[i] < 16){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}
