package retorno.java.maratona;

import java.util.Scanner;

public class exerviciosTiposPrimitivos {
    static void main() {
        Scanner tcl = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = tcl.nextLine();

        System.out.println("Qual o seu endereço?");
        String endereco = tcl.nextLine();

        System.out.println("Qual o seu salario");
        float salario = tcl.nextFloat();

        System.out.println("Qual a data de hoje?");
        String data = tcl.next();

        System.out.println("Eu "+nome+ " morando no endereço "+endereco+" confirmo o recebimento do salario "+salario+" na data "+data+".");
    }
}
