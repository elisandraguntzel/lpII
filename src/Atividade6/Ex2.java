package Atividade6;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {

    public static void main(String[] args){

        ArrayList <String> pessoas = new ArrayList<String>();

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

        Collections.sort(pessoas);

        System.out.println(pessoas);



    }

}



