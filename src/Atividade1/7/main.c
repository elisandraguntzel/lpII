#include <stdio.h>
#include <stdlib.h>

int main()
{
    int V[10];
    int i,pos, N;
    int aux = 0;



    printf("Digite os valores do vetor V \n\n");
    for(i=0; i<10; i++){
        scanf("%d", &V[i]);
    }

    printf("Informe o valor de N \n");
    scanf("%d", &N);

        for(i=0; i<10; i++){
            if(V[i]== N){
                aux = 1;
                pos = i;

        }
    }
    if(aux>0){

        printf("Numero encontrado, posicao %d\n",pos );

    }else{

        printf("Numero nao encontrado");

    }


}
