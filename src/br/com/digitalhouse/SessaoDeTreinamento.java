package br.com.digitalhouse;

public class SessaoDeTreinamento {
    private int experiencia;

    public SessaoDeTreinamento(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogadorDeFutebol){

        System.out.println(jogadorDeFutebol.getExperiencia());

        jogadorDeFutebol.correr(jogadorDeFutebol.getEnergia());
        jogadorDeFutebol.fazerGol(jogadorDeFutebol.getEnergia(),jogadorDeFutebol.getAlegria(), jogadorDeFutebol.getGols());
        jogadorDeFutebol.correr(jogadorDeFutebol.getEnergia());
        jogadorDeFutebol.setExperiencia(jogadorDeFutebol.getExperiencia() + 1);

        System.out.println(jogadorDeFutebol.getExperiencia());


    }
}
