package retorno.java.maratona;

import java.util.Scanner;

public class estudosEstCondicionais {
    static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        // 0 até 30.000 9,70%
        // 30.000 até 70.000 37,35%
        // 70.000 em diante 49,50%

    /*    System.out.println("Qual o valor do seu salario? ");
        double salario = tcl.nextDouble();
        double salario2 = 0;
        if (salario <= 30000) {
            salario2 = salario*0.097;
            salario -= salario*0.097;
        } else if (salario > 30000 && salario <= 70000) {
            salario2 = salario*0.3735;
            salario -= salario*0.3735;
        } else {
            salario2 = salario*0.4950;
            salario -= salario*0.4950;
        }
        System.out.println("O valor restante é: "+ salario);
        System.out.println("O valor do imposto foi: "+ salario2);
        */
        System.out.println("Escreva de 1 a 7 qual dia da semana é: ");
        int dia = tcl.nextInt();

        //PODE SER FEITO ASSIM OU DA SEGUNDA FORMA, A MAIS CORRETA
        /*switch (dia) {
            case 1:
                System.out.println("Domigo ,não é dia util");
                break;
            case 2:
                System.out.println("Segunda é dia util");
                break;
            case 3:
                System.out.println("Terça é dia util");
                break;
            case 4:
                System.out.println("Quarta é dia util");
                break;
            case 5:
                System.out.println("Quinta é dia util");
                break;
            case 6:
                System.out.println("Sexta é dia util");
                break;
            case 7:
                System.out.println("Sabado não é dia util");
                break;
            default:
                System.out.println("Numero invalido!");
        }*/

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção invalida");
        }
        System.out.println(dia);
    }
}
