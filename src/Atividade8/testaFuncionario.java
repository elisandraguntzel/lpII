package Atividade8;

public class testaFuncionario {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.nome  = "Hugo";
        f1.salario = 100;
        f1.recebeAumento(50);
        f1.dataEntrada ="12/07/2015";
        f1.rg = "123456789";

        Funcionario f2 = new Funcionario();

        f1.nome  = "Danilo";
        f1.salario = 150;
        f1.recebeAumento(50);
        f1.dataEntrada ="05/05/2015";
        f1.rg = "987654321";


        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        f1.ver();
    }
}
