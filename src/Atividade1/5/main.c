#include <stdio.h>
#include <stdlib.h>

int main()
{
    int resultado[6] = {1,15,20,32,51,6};n
    int ganhador = 0;
    int maiorAcertos = 0;
    int i, j, k;
    int cartelas [5][8] = {
        {1000,1,2,4,5,7,8,0},
        {2000,1,15,20,32,51,6,0},
        {3000,4,5,6,7,8,9,0},
        {4000,3,4,5,7,8,9,0},
        {5000,2,4,6,8,10,12,0}
        };


    for(i=0; i<5; i++){
        printf("Cartela numero  %d", cartelas[i][0]);
        for(j=1; j<7; j++){
            int foiSorteado = 0;
            int nCompara = cartelas[i][j];
            for(k=0; k<6; k++){
                if(nCompara == resultado[k]){
                    foiSorteado = 1;
                    break;
                }
            }
            if(foiSorteado == 1){
                cartelas[i][7]++;
            }
        }
        printf("  Acertos %d\n", cartelas[i][7]);

    }
}
