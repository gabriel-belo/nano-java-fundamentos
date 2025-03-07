package br.com.fiap.tds;

public class Teste {
    public static void main(String[] args){
        Conta cc= new Conta();
        cc.saldo= 50;
        cc.agencia= 123;
        cc.numero= 321;

        cc.depositar(100);
        System.out.println(cc.verificarSaldo());

        Conta poupanca= new Conta (1000, 222, 111);
        poupanca.retirar(50);
        System.out.println(poupanca.verificarSaldo());

        Conta aa= new Conta();

        //Verificando existência de uma conta
        if(aa != null){
            System.out.println("Existe uma conta");
        }
    }

}
