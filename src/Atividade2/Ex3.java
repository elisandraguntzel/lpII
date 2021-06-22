package Atividade2;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int i;
        int posicao = 10000;
        int menor =   10000;

        System.out.println("Informe os valores do vetor: ");
        for (i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();

        }

        for (i = 0; i < 10; i++) {
            if (vet[i] < menor) {
                menor = vet[i];
                posicao = i;
            }
        }
        System.out.printf(" o menor valor eh: %d\n", menor);
        System.out.printf(" a posicao eh: %d\n", posicao);
    }
}
























































