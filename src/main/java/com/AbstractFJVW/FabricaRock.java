package com.AbstractFJVW;

public class FabricaRock implements FabricaProducao {
    public Iluminacao criarIluminacao() {
        return new IluminacaoSpot();
    }
    public EstruturaPalco criarEstruturaPalco() {
        return new EstruturaRobusta();
    }
}
