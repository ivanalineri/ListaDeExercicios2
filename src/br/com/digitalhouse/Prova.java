package br.com.digitalhouse;

public class Prova {
    private int dificuldade;
    private int energiaNecessaria;

    public Prova(int dificuldade, int energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public Prova setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
        return null;
    }

    public int getErnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setErnergiaNecessaria(int ernergiaNecessaria) {
        this.energiaNecessaria = ernergiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta){
        // nivel >= dificuldade da prova, alem de energia suficiente.
       if(atleta.getNivel() >= getDificuldade() && atleta.getEnergia() > energiaNecessaria){
           return true;
       }else {
           return false;
       }
    }
}
