package pedro.ExerciciosFixação;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n, nhomens, nmulheres;
        double amenor, amaior, alturaMulher, totalMulher;

        System.out.printf("Quantas pessoas serao digitadas? ");
        n = sc.nextInt();

        double[] altura = new double[n];
        char[] generos = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa (M/F): ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        amenor = altura[0];
        amaior = altura[0];

        for (int i = 0; i < n; i++) {
            if(altura[i] > amaior){
                amaior = altura[i];
            } 
            if (altura[i] < amenor){
                amenor = altura[i];
            }
        }
        nhomens = 0;
        nmulheres = 0;
        alturaMulher = 0;
        for (int i = 0; i < n; i++) {
            if(generos[i] == 'M'){
                nhomens++;
            } else {
                nmulheres++;
                alturaMulher += altura[i];
            }
        }

        totalMulher = alturaMulher / nmulheres;

        System.out.printf("Altura menor = %.2f%n", amenor);
        System.out.printf("Altura menor = %.2f%n", amaior);
        System.out.printf("Media das alturas das mulheres = %.2f%n", totalMulher);
        System.out.printf("total de homens = %d%n", nhomens);

        sc.close();
    }
}
