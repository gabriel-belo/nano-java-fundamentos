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

    private boolean especial;

    public Conta(){

    }

    public Conta(double saldo, int agencia, int numero){
        this.setSaldo(saldo);
        this.setAgencia(agencia);
        this.setNumero(numero);
        System.out.println("Criando uma instância da conta");
    }

    //Métodos

    /**
     *Deposita um valor ao saldo da conta
     * @param valor valor a ser depositiado
     */
    public void depositar(double valor){
        saldo+= valor;
    }

    /**
     * Retira um valor do saldo da conta
     * @param valor Valor a ser retirado
     */
    public void retirar(double valor){
        saldo -= valor;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero= numero;
    }

    public int getAgencia(){
        return agencia;
    }

    public void setAgencia(int agencia){
        this.agencia= agencia;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo= saldo;
    }

}

