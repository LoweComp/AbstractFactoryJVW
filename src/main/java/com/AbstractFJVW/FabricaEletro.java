package com.AbstractFJVW;

public class FabricaEletro {
    public Iluminacao criarIluminacao() {
        return new IluminacaoLaser();
    }

    public EstruturaPalco criarEstrutura() {
        return new EstruturaTech();
    }
}
