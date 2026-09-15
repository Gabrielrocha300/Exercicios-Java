package retorno.java.maratona;

import javax.xml.transform.Source;
import java.util.Scanner;

public class estudoArrays {
    static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        /*int [] numero = {5,15,25,35,45};

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }

        int [] numero = {10,20,30,40,50};
        int soma = 0;
        for (int i = 0; i < numero.length; i++) {
            soma+= numero[i];
        }
        System.out.println(soma);

        int maior = 0;
        int [] num = {15, 8, 42, 23, 4, 31};

        for (int i = 0; i < num.length; i++) {
          if (num[i]>maior)  {
              maior=num[i];
          }
        }
        System.out.println(maior);

        int[] numeros = {2, 7, 10, 15, 20, 23, 30, 41};
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]%2 == 0){
                contador++;
            }
        }
        System.out.println(contador);

        String [] nomes ={"Gabriel","João","Maria","Carlos","Ana"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno "+(i+1)+":"+nomes[i]);
        }*/

        int [] num = {10, 25, 30, 45, 50, 75};
        boolean encontrado = false;
        System.out.println("Digite um numero:");
        int n2 = tcl.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i]==n2){
                encontrado = true;
            }
        }
    }
}
