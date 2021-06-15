package Lista3;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {

        String frase = "Socorram-me, subi no ônibus em Marrocos";
        String fraseInv = "";

        String palavra[] = frase.split("  ");

        for(int i = palavra.length-1; i>=0; i++){
            fraseInv = fraseInv.concat(palavra[i]+" ");

        }
        fraseInv = fraseInv.substring(0, fraseInv.length()-1);


        System.out.println("Frase: \n" + frase);
        System.out.println("Frase invertida: \n" + fraseInv);


    }
}
