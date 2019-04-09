package br.com.digitalhouse;

public class Tripe {

    private boolean dobrado;
    private int alturaMinima;
    private int alturaMaxima;
    private int alturaAtual;



    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(Integer novaAltura){
        alturaAtual = novaAltura;

    }

    public void dobrar(){


    }

    public void desdobrarTripre(){

    }

    public void guardar(){
    // pronto para guardar, deve estar dobrado e com altura minima possivel.
        setDobrado(true);
        if(alturaMinima < alturaAtual){
            System.out.println("guardado");
        }else {
            System.out.println("não foi possivel guardar");
        }


    }

    public void prontoParaGuardar(){
        // dobrado e com altura minima atual.
        setDobrado(true);
        if(alturaMinima< alturaAtual){
            System.out.println("pronto para guardar");
        }else {
            System.out.println("O tripé ainda não está pronto para guardar");
        }
    }

    public void usar(){
        //possivel quando está desdobrado e com altura superior a metade da altura máxima.
        desdobrarTripre();
        alturaMaxima = alturaMaxima / alturaAtual;
        setDobrado(false);


    }

    public void prontoParaUsar(){
        //possivel quando está desdobrado e com altura superior a metade da altura máxima.
        desdobrarTripre();
        alturaMaxima = alturaMaxima / alturaAtual;
        setDobrado(false);
    }

    public Tripe(boolean dobrado, int alturaMinima, int alturaMaxima, int alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMinima = alturaMinima;
        this.alturaMaxima = alturaMaxima;
        this.alturaAtual = alturaAtual;
    }
}
