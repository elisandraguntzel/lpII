package ListaIIString;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);


        System.out.println("Escreva uma frase: ");

        String palavras = frase.nextLine();

        palavras = palavras.trim().replaceAll("\\s+", " ");

        System.out.println("Frase escrita sem espacos desnecessarios: \n"+ palavras);

    }
}




