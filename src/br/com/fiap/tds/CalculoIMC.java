package br.com.fiap.tds;

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Insira o peso: ");
        float peso= sc.nextFloat();

        System.out.print("Insira a altura: ");
        float altura= sc.nextFloat();

        float imc= peso/ (altura * altura);

        if(imc >= 18.5 && imc <= 25){
            System.out.println("O peso esta ideal");
        }else{
            System.out.println("O peso está fora do ideal");
        }

        sc.close();

    }
}
