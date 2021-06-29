package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

        ArrayList <String> pessoas = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);
        String s;


            System.out.println("Informe um nome: ");
            s = ler.nextLine();

            while(! s.equals("vazio")){

            if (pessoas.contains(s)) {


                System.out.println("Nome já esta na lista, favor inserir outro nome");
                s = ler.nextLine();

            }

            pessoas.add(s);
            System.out.println("Informe outro nome: ");
            s = ler.nextLine();

        }

        for(String p : pessoas){
            System.out.println("Nome: " +p+ " Posição " +pessoas.indexOf(p));
        }

        ler.close();


    }

}
