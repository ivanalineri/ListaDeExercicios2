package br.com.digitalhouse;

public class Exercicio1 {


    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Adolfo", "Bastos");
        Cliente cliente2 = new Cliente("Maria", "Antunes");

        Conta conta1 = new Conta(12345, 1231, cliente1);
        Conta conta2 = new Conta(12245,1500, cliente2 );

        conta1.saque(150);
        conta2.saque(180);
        conta1.deposito(1000);
        conta2.deposito(670);

            System.out.println(cliente1.toString());
    }
}
