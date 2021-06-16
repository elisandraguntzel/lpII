package Lista1vetores;

import java.util.Scanner;


public class Ex5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Resultado[] = new int[6];
        int apA[] = new int[6];
        int apB[] = new int[6];
        int apC[] = new int[6];
        int apD[] = new int[6];
        int apE[] = new int[6];
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int countE=0;
        int newVetA[] = new int[7];
        int newVetB[] = new int[7];
        int newVetC[] = new int[7];
        int newVetD[] = new int[7];
        int newVetE[] = new int[7];
        int resultadoAposta[] = new int[6];
        int numero=0;
        int indice=0;


        System.out.println("Insira o resultado ");
        for(int i=0; i<6; i++){
            Resultado[i] = sc.nextInt();
        }



        System.out.println("Resultado: ");
        for(int j=0; j<6; j++){
            System.out.println(Resultado[j] +"  ");
        }


        System.out.println("Apostador A, preencha seu cartao: ");
        for(int k=0; k<6; k++){
            apA[k] = sc.nextInt();
        }

        System.out.println("\n");

        System.out.println("Apostador B,preencha seu cartao: ");
        for(int l=0; l<6; l++){
            apB[l] = sc.nextInt();
        }

        System.out.println("\n");

        System.out.println("Apostador C, por favor preencha seu cartao: ");
        for(int m=0; m<6; m++){
            apC[m] = sc.nextInt();
        }

        System.out.println("\n");

        System.out.println("Apostador D, por favor preencha seu cartao: ");
        for(int n=0; n<6; n++){
            apD[n] = sc.nextInt();
        }

        System.out.println("\n");

        System.out.println("Apostador E, por favor preencha seu cartao: ");
        for(int o=0; o<6; o++){
            apE[o] = sc.nextInt();
        }

        System.out.println("\n");

        for(int p=0; p<6; p++){
            for(int q=0; q<6; q++){
                if(apA[p] == Resultado[q]){
                    countA++;
                    newVetA[countA] = apA[p];
                }
            }
        }

        for(int r=0; r<6; r++){
            for(int s=0; s<6; s++){
                if(apB[r] == Resultado[s]){
                    countB++;
                    newVetB[countB] = apB[r];
                }
            }
        }

        for(int t=0; t<6; t++){
            for(int u=0; u<6; u++){
                if(apC[t] == Resultado[u]){
                    countC++;
                    newVetC[countC] = apC[t];
                }
            }
        }

        for(int v=0; v<6; v++){
            for(int w=0; w<6; w++){
                if(apD[v] == Resultado[w]){
                    countD++;
                    newVetD[countD] = apD[v];
                }
            }
        }

        for(int x=0; x<6; x++){
            for(int y=0; y<6; y++){
                if(apE[x] == Resultado[y]){
                    countE++;
                    newVetE[countE] = apE[x];
                }
            }
        }

        resultadoAposta[0] = countA;
        resultadoAposta[1] = countB;
        resultadoAposta[2] = countC;
        resultadoAposta[3] = countD;
        resultadoAposta[4] = countE;

        for(int z=0; z<5; z++){
            if(resultadoAposta[z] > numero) {
                numero = resultadoAposta[z];
                indice = z;
            }
        }

        if(numero == 0) {
            System.out.println("Nao houveram acertadores! \n \n");
        } else {
            int indexMoreOne = indice+1;

            System.out.println("O apostador "+ indexMoreOne +" obteve "+ resultadoAposta[indice] +" acertos!!! \n");
            System.out.println("Apostador "+ indexMoreOne +": Ganhador");
        }
    }
}

