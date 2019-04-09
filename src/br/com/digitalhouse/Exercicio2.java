package br.com.digitalhouse;

public class Exercicio2 {

    public static void main(String[] args) {

        JogadorDeFutebol jogadorDeFutebol = new JogadorDeFutebol("Edivaldo", 100, 60, 5, 3);
        JogadorDeFutebol jogadorDeFutebol1 = new JogadorDeFutebol("Rai", 80, 75, 8, 8);

       SessaoDeTreinamento sessaoDeTreinamento = new SessaoDeTreinamento(4);

       sessaoDeTreinamento.treinarA(jogadorDeFutebol);
       sessaoDeTreinamento.treinarA(jogadorDeFutebol1);
        System.out.println(jogadorDeFutebol.toString());



    }
}
