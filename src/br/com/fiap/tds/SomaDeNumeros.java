package br.com.fiap.tds;

import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1= sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2= sc.nextInt();

        int soma= num1 + num2;
        System.out.println("A soma dos valores é igual a: " + soma);

        int resto= soma % 2;
        if(resto == 0){
            System.out.println("A soma é par");
        }else{
            System.out.println("A soma é impar");
        }

        sc.close();
    }
}
