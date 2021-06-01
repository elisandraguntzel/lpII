import java.util.Scanner;


public class Exercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char c;
        char[] nome = new char[10];
        int numDependentes = 0;
        int numHorasTrabalho = 0;
        float salarioBruto = 0;
        float salarioLiquido = 0;
        float desconto = 0;
        int totalFuncionarios = 0;
        float totalSalarios = 0;
        float totalDescontos = 0;

        do{
            System.out.println("Digite seu nome (ou enter para encerrar) \n");
            nome = sc.nextLine();

            if(nome>1){
                System.out.println("Digite o numero de dependentes: \n");
                numDependentes = sc.nextInt();
                System.out.println("Digite o numero de horas trabalhadas: \n");
                numHorasTrabalho = sc.nextInt();

                salarioBruto = numHorasTrabalho * 100 + numDependentes *125.55;
                desconto = salarioBruto * 0.12;
                salarioLiquido = salarioBruto - desconto;

                System.out.printf("Nome do Funcionario: %s\n", nome);
                System.out.printf("Salario Bruto: R$ %.2f\n", salarioBruto);
                System.out.printf("Salario Liquido: R$ %.2f\n", salarioLiquido);
                System.out.printf("Valor descontado: R$ %.2f", salarioBruto-salarioLiquido);

            }

        }while(nome > 2);
        System.out.printf("\n\n\n");
        System.out.println("RESUMO DO RH\n");
        System.out.printf("Total de funcionar" +
                "" +
                "ios: %d\n", totalFuncionarios);
        System.out.printf("Total gasto em salarios: R$ %.2f\n", totalSalarios);
        System.out.printf("Total de descontos: R$%.2f\n", totalDescontos);



        }

    }


