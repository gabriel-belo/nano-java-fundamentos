package br.com.fiap.tds;

public class ArrayObjetos {
    public static void main(String[] args){
        ContaCorrente[] contas= new ContaCorrente[5];

        ContaCorrente conta1= new ContaCorrente("Corrente");

        contas[0]= conta1;

    }
}
