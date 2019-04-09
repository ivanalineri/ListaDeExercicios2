package br.com.digitalhouse;

public class Conta {
    private float numeroDeConta;
    private float saldo;
    private Cliente titular;

    public Conta(float numeroDeConta, float saldo, Cliente titular) {


    }

    public float getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(float numeroDeConta) {
        this.numeroDeConta = numeroDeConta;




    }

    public float getSaldo() {

        return saldo;
    }

    public void setSaldo(float saldo) {


        this.saldo = saldo;
    }

    public Cliente getTitular() {


        return titular;
    }

    public void setTitular(Cliente titular, Cliente titular2) {

        this.titular = titular;


    }


    public void deposito(float quantiaDeDinheiro) {
        saldo = quantiaDeDinheiro + saldo;
        if (quantiaDeDinheiro >= 0) {
            System.out.println("Transação realizada com sucesso, seu novo saldo é: " + saldo);
        }


    }

    public void saque(float quantidadeDeDinheiro) {
        saldo = quantidadeDeDinheiro - saldo;
        if (saldo < 0 && quantidadeDeDinheiro > 0) {
            System.out.println("Saldo Insulficiente");
        } else {
            System.out.println("Saque realizado com sucesso, seu novo saldo é " + saldo);
        }
    }


}
