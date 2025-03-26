package br.com.fiap.tds;

public class Strings {
    public static void main(String[] args){
        String nome= new String();
        System.out.print(nome.length());

        nome= "FIAP";
        System.out.println(nome.length());

        nome= "FIAP \nA melhor faculdade de tecnologia";
        System.out.println(nome);

        String faculdade= "FIAP";

        String slogan= " A melhor faculdade de tecnologia";

        String faculSlogan= faculdade + slogan;
        System.out.println(faculSlogan);

        nome= "FIAP";
        faculSlogan= nome;
        faculSlogan+= "-";
        faculSlogan+= slogan;
        System.out.println(faculSlogan);


        nome= "FIAP";
        slogan= " A melhor faculdade de tecnologia";
        faculSlogan= nome.concat(" - ").concat(slogan);
        System.out.println(faculSlogan);
    }
}
