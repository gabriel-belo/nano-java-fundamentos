package br.com.fiap.tds;

/**
 * Classe que abstrai uma conta Bancária
 * @author gabrielbelo
 * @version 1.0
 */

public class Conta   {

    /**
     *Saldo da conta
     */
    private double saldo= 100;  //100 é um valor padrão

    /**
     *Número da Agencia
     */
    private int agencia= 10;

    /**
     *Número da Conta
     */
    private int numero= 1;

    public Conta(){

    }

    public Conta(double saldo, int agencia, int numero){
        this.saldo= saldo;
        this.agencia= agencia;
        this.numero= numero;
        System.out.println("Criando uma instância da conta");
    }

    //Métodos

    /**
     * Retira um valor do saldo da conta
     * @param valor Valor a ser retirado
     */
    public void retirar(double valor){
        this.saldo -= valor;
    }

    /**
     * Deposita um valor ao saldo da conta
     * @param valor Valor a ser depositado
     */
    public void depositar(double valor){
        saldo+= valor;
    }

    /**
     * Verifica o saldo da conta
     * @return Valor do saldo da conta
     */
    public double verificarSaldo(){
        return saldo;
    }

    

}

