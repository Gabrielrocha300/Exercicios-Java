package retorno.java.maratona;

import java.sql.SQLOutput;
import java.util.Scanner;

public class estudosOpAritmeticos {
    static void main() {
        Scanner tcl = new Scanner(System.in);

/*  EXERCICIO 1

System.out.println("Qual foi a nota 1? ");

        Float n1 = tcl.nextFloat();

        System.out.println("Qual a nota 2? ");
        Float n2 = tcl.nextFloat();

        float med = (n1+n2)/2;

        System.out.println(med);
        boolean res = med>=7 && n1>=5 && n2>=5;
        System.out.println(res);
    */

        /*   EXERCICIO 2

        System.out.println("Quantidade de produtos? ");
        float pro = tcl.nextInt();

        System.out.println("Qual o preço?");
        float preco = tcl.nextFloat();

        float valor = pro*preco;
        float des = 0;

        if (valor>=100){
            des = valor*0.10f;
        }

        float valorfinal = valor;
        valorfinal -= des;

        System.out.println("Valor da compra: "+ valor);
        System.out.println("Desconto: "+ des);
        System.out.println("Valor final: "+ valorfinal);

    */

    /*  EXERCICIO 3

        System.out.println("Qual sua idade?" );
        int idade = tcl.nextInt();

        boolean res = idade >= 18 && idade <= 21;

        System.out.println("Entrada permitida: "+res);


         */

    /*  Exercicio 4

        System.out.println("Digite um numero: ");
        int n1 = tcl.nextInt();

        boolean n = n1>=10 && n1<=50;
        boolean igual = n || n1==100;

        System.out.println("Esta entre 10 e 50: "+ n);
        System.out.println("Esta entre 10 e 50 ou é 100: "+ igual);

        */

        /*

        double salario = 2500;

        salario+= salario * 0.10;
        salario+= 500;
        salario-= 200;

        System.out.println(salario);
         */

        /*
        int saldo = 1000;
        int saque =300;

        if (saque<=0 && saque>saldo){
            System.out.println("Saldo Insuficiente");
        }else{
            System.out.println(saldo-=saque);
        }

         */

        /*String admin = "Admin";
        String senha = "1234";

        System.out.println("Qual o usuario? ");
        String usu = tcl.nextLine();
        System.out.println("Qual a senha?");
        String sen = tcl.nextLine();

        boolean login = admin.equals(usu) && senha.equals(sen);

        System.out.println(login);

         */


       /* int racao = 120;
        int brin = 0;
        int shampoo = 0;

        float total = racao+brin+shampoo;
        boolean cliente = true;
        float des = 0;

        if(total>=150 && cliente){
            total-=total*0.15;
            total-=total*0.05;
            System.out.println(total);
        }if(cliente){
            total-=total*0.05;
            System.out.println(total);
        }

        */

        System.out.println("Digite o seu nome: ");
        String nome = tcl.nextLine();
        System.out.println("Qual a sua idade? ");
        double idade = tcl.nextInt();
        System.out.println("Qual o valor do seu salario? ");
        double salario = tcl.nextDouble();
        System.out.println("Foram quantos produtos? ");
        double prdutos = tcl.nextInt();
        System.out.println("Qual o valor do produto? ");
        double preco = tcl.nextDouble();

        double total = prdutos * preco;
        double desconto = 0;
        boolean cliente = true;
        boolean pagamento = true;
        double totf =0;

        if ((idade >= 18 && total >= 200) || cliente && pagamento) {
            desconto = total *= 0.05;
            double kk = total -= desconto;
        }
        double resal = salario-=totf;

        System.out.println("cliente: " + nome + "\nIdade: " + idade + "\nSalario: " + salario + "\nTotal da compra: " + total + "\nDesconto: " + desconto + "\nValor final: " + totf+ "\nsalario restante: "+resal);
    }
}
