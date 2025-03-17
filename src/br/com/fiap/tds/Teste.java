package br.com.fiap.tds;

public class Teste {
    public static void main(String[] args){
        Conta cc= new Conta();
        cc.depositar(50);
        cc.setAgencia(123);
        cc.setNumero(321);

        cc.depositar(100);
        System.out.println(cc.getSaldo());

        Conta poupanca= new Conta (111, 222, 1000);

        poupanca.retirar(50);

        System.out.println(poupanca.getSaldo());

        Conta aa= new Conta();

        //Verificando existência de uma conta
        if(aa != null){
            System.out.println("Existe uma conta");
        }
    }

}
