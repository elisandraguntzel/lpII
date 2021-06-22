package Atividade2;

import java.util.Scanner;
public class Ex7 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = new int[10];
        int n;
        int aux = 0;
        int pos = 0;
        int i;

        System.out.println("Informe os valores do vetor");

        for (i = 0; i < 10; i++) {
            vet[i] = sc.nextInt();
        }
        System.out.println("Informe o valor de n");
        n = sc.nextInt();

        for (i = 0; i < 10; i++) {
            if (vet[i] == n) {
                aux = 1;
                pos = i;
            }
        }
        if (aux > 0) {
            System.out.printf("Numero encontrado, posicao %d\n", pos);
        } else {
            System.out.println("Numero nao encontrado");
        }


    }
}
