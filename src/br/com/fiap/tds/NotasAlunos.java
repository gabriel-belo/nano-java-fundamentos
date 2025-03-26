package br.com.fiap.tds;

import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        float notas[]= new float[10];

        for(int i=0; i < notas.length; i++){
            System.out.println("Insira a nota: ");
            notas[i]= sc.nextFloat();

        }
        float totalNotas=0;
        for(int j=0; j < notas.length; j++){
            totalNotas+= notas[j];
        }
        float media= totalNotas / notas.length;

        System.out.println("A média dos alunos é " + media);

        System.out.println(notas);
        sc.close();
    }
}
