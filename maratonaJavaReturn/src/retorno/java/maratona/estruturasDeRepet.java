package retorno.java.maratona;

import java.util.Scanner;

public class estruturasDeRepet {
    static void main(String[] args) {

/*        for (int n=0; n<=100;n++){
            if (n % 2 == 0){
                System.out.println(n);

        Scanner tcl = new Scanner(System.in);
        int contador = 10;
        while (contador>=0){
            System.out.println(contador); i= i+1*2
            contador--;
        }
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
        }
        for (int i = 1; i <= 30; i += 2) {
            System.out.println(i);
        }*/
        Scanner tcl = new Scanner(System.in);
       /* System.out.println("Digite a tabuada:");
        int tab = tcl.nextInt();

        for (int i = 1; i <= 10; i++) {
            tab=tab*i;
            System.out.println(tab);
        }
        int soma =0;
        for (int i = 0; i <= 100; i+=2) {
            soma += i;
        }
        System.out.println(soma);

        int contn = 0;
        int contp = 0;
        int conto = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero:");
            int n = tcl.nextInt();

            if (n>0){
                contp++;
            } else if (n<0) {
                contn++;
            }else{
                conto++;
            }

        }
        System.out.println(contp);
        System.out.println(contn);
        System.out.println(conto);

        int maior = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero:");
            int n = tcl.nextInt();
            if (n>maior) {
                maior=n;
            }
        }
        System.out.println(maior);

        float soma = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Me entregue sua nota:");
            float nota = tcl.nextFloat();
            soma += nota;
        }
        soma/=5;
        if (soma >=7){
            System.out.println("Aprovado, media: "+soma);
        }else {
            System.out.println("reprovado, media: "+soma);
        }

        int senha1 = 1234;
        System.out.println("Digite sua senha: ");
        int senha2 = tcl.nextInt();

        while (senha1!=senha2){
            System.out.println("Senha incorreta.");
            System.out.println("Digite novamente: ");
            senha2 = tcl.nextInt();

        }
        System.out.println("Acesso permitido");

        int soma = 0;
        System.out.println("Digite um numero: ");
        int n = tcl.nextInt();

        while (n != 0){
            soma = soma+n;
            System.out.println("Digite um numero: ");
            n = tcl.nextInt();

        }
        System.out.println(soma);


        int soma = 0;
        System.out.println("Digite um numero:");
        int num = tcl.nextInt();

        while (num != 0){
            System.out.println("Digite um numero:");
            num = tcl.nextInt();
            soma++;
        }
        System.out.println(soma);*/

        int num = 0;
        int saldo = 1000;
        while (num != 4){
        System.out.println("===== BANCO =====\n" +
                "1 - Consultar saldo\n" +
                "2 - Depositar\n" +
                "3 - Sacar\n" +
                "4 - Sair\n" +
                "Escolha:");
        num = tcl.nextInt();

        switch (num) {
            case 1:
                System.out.println("Seu saldo é: " + saldo);
                break;
            case 2:
                System.out.println("Qual o valor do deposito? ");
                int valor = tcl.nextInt();
                saldo += valor;
                System.out.println("Saldo atual: "+saldo);
                break;
            case 3:
                System.out.println("Qual o valor de saque: ");
                int saque = tcl.nextInt();
                if (saque>saldo){
                    System.out.println("Saldo insuficiente");
                }else {
                    saldo-=saque;
                }
                System.out.println("O seu saldo é: "+ saldo);
                break;
            case 4:
                System.out.println("Sessão encerrada.");
                break;
            default:
                System.out.println("Numero digitado invalido.");
            }
        }
    }
}