#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i, vet[20];
    int par=0;
    printf("Informe os valores do vetor: \n");
    for(i=0; i<20; i++){

    scanf("%d", &vet[i]);

    }
    for(i=0; i<20; i++){
        if(vet[i]%2==0){
        par++;

    }

    }

     printf("pares %d",par);
}



