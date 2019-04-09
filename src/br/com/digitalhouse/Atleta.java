package br.com.digitalhouse;

public class Atleta {
    private String nome;
    private  int nivel;
    private int energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Atleta(String nome, int nivel, int energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", energia=" + energia +
                '}';
    }
}
