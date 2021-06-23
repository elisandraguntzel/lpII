package Atividade6;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);

        String s;

        pessoas.add("Joao");
        pessoas.add("Maria");
        pessoas.add("Jose");
        pessoas.add("Joana");
        pessoas.add("Ana");
        pessoas.add("Paula");
        pessoas.add("Jorge");
        pessoas.add("Junior");
        pessoas.add("Silvio");
        pessoas.add("Angelica");

        System.out.println("Informe o nome que vc deseja buscar:");
        s = ler.nextLine();

        if (pessoas.contains(s)) {
            System.out.println("Possui o nome na lista");
        } else {
            System.out.println("Não possui o nome na lista");
        }
    }
}




