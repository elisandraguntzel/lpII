#include <stdio.h>
#include <stdlib.h>

int main()
{
    int X[10], Y[10];
    int i;
    int j;
    int elemento;


    printf("Digite os valores do vetor X \n");
    for(i=0; i<10; i++){
        scanf("%d", &X[i]);
    }

    printf("Digite os valores do vetor Y \n");
    for(i=0; i<10; i++){
        scanf("%d", &Y[i]);
    }
//***********************************************************

    printf("***Uniao***\n");

    for(i=0; i<10; i++){
        printf("%d\n", X[i]);


    }
    for(i=0; i<10; i++){
        printf("%d\n", Y[i]);

    }
//*************************************************************

     printf("***Diferenca***\n");

     for(i=0; i<10; i++){
        printf("%d \n", X[i] - Y[i]);
    }
//**************************************************************

     printf("***Soma***\n");

     for(i=0; i<10; i++){
        printf("%d \n", X[i] + Y[i]);
     }

//*************************************************************

     printf("***Produto***\n");

     for(i=0; i<10; i++){
        printf("%d \n", X[i] * Y[i]);
     }

//***********************************************************
    printf("***Interseccao***\n");

    for(i=0; i<10; i++){
         elemento = X[i];
        for(j=0; j<10; j++){
            if(elemento == Y[j]){
                    printf("%d \n", elemento);
                break;
            }

        }
         }




    }











