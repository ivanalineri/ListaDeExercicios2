package br.com.digitalhouse;

public class Exercicio4 {

    public static void main(String[] args) {

        Tripe tripe = new Tripe(true, 10,20,13);

        tripe.guardar();
        tripe.prontoParaGuardar();
        tripe.usar();
        tripe.prontoParaUsar();
        tripe.dobrar();

        System.out.println(tripe);
    }
}
