#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vet[10];
    int i;
    int posicao = 100000000000000;
    int menor = 100000000000000;

    printf("Digite os valores do vetor \n");

    for(i=0; i<10; i++){
        scanf("%d", &vet[i]);

    }
    for(i=1; i<10; i++){
        if(vet[i] < menor){
            menor = vet[i];
            posicao = i;
        }
    }
    printf("\n Menor elemento vetor = %d\n", menor);
    printf("\n A posicao do vetor eh %d\n", posicao);



}
