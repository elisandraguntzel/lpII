#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(void){
    char nome[10];
    int numDependentes = 0;
    int numHorasTrabalho = 0;
    float salarioBruto = 0;
    float salarioLiquido = 0;
    float desconto = 0;
    int totalFuncionarios = 0;
    float totalSalarios = 0;
    float totalDescontos = 0;


    do{
        printf("Digite seu nome ( ou enter para encerrar o programa) \n");
        setbuf(stdin, NULL);
        scanf("%s", &nome);

        if(strlen(nome)> 2){
            printf("Digite o numero de dependentes: ");
            scanf("%d", &numDependentes);
            printf("Digite o numero de horas trabalhadas: ");
            scanf("%d", &numHorasTrabalho);

            salarioBruto = numHorasTrabalho * 100 + numDependentes *125,55;
            desconto = salarioBruto * 0.12;
            salarioLiquido = salarioBruto - desconto;

            printf("Nome do Funcionario: %s\n", nome);
            printf("Salario Bruto: R$ %.2f\n", salarioBruto);
            printf("Salario Liquido: R$ %.2f\n", salarioLiquido);
            printf("Valor descontado: R$ %.2f", salarioBruto-salarioLiquido);

        }

    }while(strlen (nome) > 2);

    printf("\n\n\n");
    printf("RESUMO DO RH\n");
    printf("Total de funcionarios: %d\n", totalFuncionarios);
    printf("Total gasto em salarios: R$ %.2f\n", totalSalarios);
    printf("Total de descontos: R$%.2f\n", totalDescontos);

    return EXIT_SUCCESS;




}
