package br.com.digitalhouse;

public class Cliente {

    private String nomeCliente;
    private String sobrenomeCliente;


    public Cliente(String nome, String sobrenome){
        nomeCliente = nome;
        sobrenomeCliente = sobrenome;

    }

    @Override
    public String toString() {
        return "Cliente{" +
                  nomeCliente + " " +sobrenomeCliente +
                '}';
    }
}

