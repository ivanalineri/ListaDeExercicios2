package br.com.digitalhouse;

public class ClienteCarro {
    private String nome;
    private String sobrenome;
    private float contato;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getContato() {
        return contato;
    }

    public void setContato(float contato) {
        this.contato = contato;
    }

    public ClienteCarro(String nome, String sobrenome, float contato) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contato = contato;
    }
}
