package br.com.fiap.tds;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private int idade;
    public void setIdade(int idade){
        this.idade= idade;
    }
    public int getIdade(){
        return idade;
    }
    private static final  long serialVersionUID= 1L;
    private String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome= nome;
    }
}
