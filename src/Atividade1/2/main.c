#include <stdio.h>
#include <stdlib.h>

int main()
{
    int vet1[10], vet2[10], vet3[10];
    int i;


    printf("Vetor 1 =  \n");
    for(i=0; i<10; i++){
        scanf("%i", &vet1[i]);
    }

    printf("Vetor 2 =  \n");
    for(i=0; i<10; i++){
        scanf("%i", &vet2[i]);
    }

    printf("**Resultado Multiplicacao**\n");
    for(i=0; i<10; i++){
        vet3[i] = vet1[i] * vet2[i];

        printf("%i\n",vet3[i]);
    }





}
