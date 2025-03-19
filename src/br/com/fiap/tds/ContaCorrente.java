package br.com.fiap.tds;

public class ContaCorrente extends Conta {

    private String tipo;

    private double chequeEspecial;

    public ContaCorrente(String tipo){
        super();
        this.tipo= tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public  void setTipo(String tipo){
        this.tipo= tipo;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial){
        this.chequeEspecial= chequeEspecial;
    }

    public double getSaldoDisponível(){
        return getSaldo() + this.chequeEspecial;
    }

    @Override
    public  void retirar(double valor){
        valor= valor + 10;
        super.retirar(valor);
    }
}
