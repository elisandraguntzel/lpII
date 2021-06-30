#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vet[20];
    int i, aux;
    int x = 19;

//insere os valores no vetor

    printf("Digite os valores do vetor: \n");

    for(i=0; i<20; i++){
        scanf("%d", &vet[i]);
    }

//mostra vetor

    printf("\n\nVETOR ORIGINAL\n\n");
    for(i=0; i<20; i++){
        printf("%d  ",vet[i]);
    }
//troca valores do vetor

    for(i=0; i<10; i++){
        aux = vet[i];
        vet[i] = vet[x];
        vet[x] = aux;
        x--;
    }
//vetor alterado

    printf("\n\nVETOR ALTERADO\n\n");
    for(i=0; i<20; i++){
        printf("%d  ", vet[i]);
    }
    return 0;
}
