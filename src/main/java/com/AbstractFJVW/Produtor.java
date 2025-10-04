package com.AbstractFJVW;

public class Produtor {
    private Iluminacao iluminacao;
    private EstruturaPalco estrutura;

    public Produtor(FabricaProducao fabrica) {
        this.iluminacao = fabrica.criarIluminacao();
        this.estrutura = fabrica.criarEstruturaPalco();
    }

    public String configurarIluminacao() {
        return this.iluminacao.configurarLuzes();
    }

    public String montarEstrutura() {
        return this.estrutura.montar();
    }
}
