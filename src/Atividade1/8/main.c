#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vet[15];
    int i;

    printf("Digite os valores do vetor\n\n");

    for (i=0; i<15; i++){
        scanf("%d", &vet[i]);
    }

    printf("VETOR INVERSO \n\n");

    for(i=14; i>=0; i--){
        printf("%d  ", vet[i]);
    }

}
