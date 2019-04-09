package br.com.digitalhouse;

public class JogadorDeFutebol {

    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;


    public JogadorDeFutebol(String nome, int energia, int alegria, int gols, int experiencia) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
        this.gols = gols;
        this.experiencia = experiencia;
    }

    public void fazerGol(int energia, int alegria, int gols){
        energia = energia -5;
        alegria = alegria + 10;
        gols = gols + 1;

        System.out.println("GOOOL");
    }

    public void correr(int energia){
        energia = energia - 10;

        System.out.println("Cansei");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "JogadorDeFutebol{"+ nome +
                '}';
    }
}
