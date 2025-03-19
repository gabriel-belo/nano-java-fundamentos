package br.com.fiap.tds;

public class Program {
    public static void main(String[] args){
        Conta c1= new Conta();
        if(c1 instanceof Conta){
            System.out.println("c1 é do tipo Conta");
        }else{
            System.out.println("c1 não é do tipo Conta");
        }

        Conta c2= new ContaCorrente();
        if(c2 instanceof Conta){
            System.out.println("c2 é do tipo Conta");
        }else {
            System.out.println("c2 não é do tipo Conta");
        }

        Conta c3= new Conta();
        if(c3 instanceof ContaCorrente){
            System.out.println("c3 é do tipo ContaCorrente");
        }else {
            System.out.println("c3 não é do tipo ContaCorrente");
        }

    }
}
