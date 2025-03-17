package br.com.fiap.tds;

public class Telefone {
    private String ddd;
    private String numero;

    //métodos gets e sets

    public String getTelefoneeFormatado(){
        return formatarTelefone(ddd, numero);
    }

    private String formatarTelefone(String ddd, String numero){
        return "(" + ddd + ") " + numero;
    }
}
