package br.com.fiap.tds;

public class InstrucoesCondicionais {
    public static void main(String[] args){
        int x= 10;
        int y= 9;
        if(x > y) {
            System.out.println("O valor de x é maior que o de y");
        }else if(x == y){
            System.out.println("O valor de x é igual ao valor de y");
        }else  {
            System.out.println("O valor de x é menor que o de y");
        }
    }
}
