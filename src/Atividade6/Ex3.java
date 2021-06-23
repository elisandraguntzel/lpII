package Atividade6;
import java.util.ArrayList;
import java.util.Scanner;



public class Ex3 {
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


            System.out.println("Informe o nome que deseja excluir: ");
            s = ler.nextLine();
            pessoas.remove(s);
            System.out.println("Nome Removido!");


            System.out.println("Digite clear para limpar a lista ");
            s = ler.nextLine();
            pessoas.clear();



        System.out.print(pessoas);



    }

}
