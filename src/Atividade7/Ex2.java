package Atividade7;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> listanumero = new ArrayList<>();
        ArrayList<Integer> excluipar = new ArrayList<>();

        int n;


        while (listanumero.size() < 10) {

            System.out.println("Informe um numero ");
            n = ler.nextInt();
            listanumero.add(n);

        }

        System.out.println("Lista Original:");
        for(Integer lista : listanumero) {
            System.out.print(lista + " ");
        }



        for (Integer lista : listanumero) {
            if (lista % 2 != 0) {
                excluipar.add(lista);

            }
        }

        System.out.println("\n\nLista sem os números pares: ");
        for (Integer lista : excluipar) {
            System.out.print(" " + lista);
        }


    }
}
