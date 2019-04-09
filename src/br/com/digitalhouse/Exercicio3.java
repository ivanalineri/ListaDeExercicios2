package br.com.digitalhouse;

public class Exercicio3 {

    public static void main(String[] args) {


        Atleta atleta1 = new Atleta("Adelbaldo", 5, 5);
        Atleta atleta2 = new Atleta("Maria", 8, 9);

        Prova prova1 = new Prova(2,5);
        Prova prova2 = new Prova(5, 6);
        Prova prova3 = new Prova(9,9);

        prova1.setDificuldade(4);
        prova2.setDificuldade(7);
        prova3.setDificuldade(9);

        prova1.podeRealizar(atleta1);
        prova2.podeRealizar(atleta1);
        prova3.podeRealizar(atleta1);
        prova1.podeRealizar(atleta2);
        prova2.podeRealizar(atleta2);
        prova3.podeRealizar(atleta2);

        System.out.println(prova1.podeRealizar(atleta1));
        System.out.println(prova2.podeRealizar(atleta1));
        System.out.println(prova3.podeRealizar(atleta1));
        System.out.println(prova1.podeRealizar(atleta2));
        System.out.println(prova2.podeRealizar(atleta2));
        System.out.println(prova3.podeRealizar(atleta2));


    }
}
