package com.AbstractFJVW;

public class FabricaRock {
    public Iluminacao criarIluminacao() {
        return new IluminacaoSpot();
    }

    public EstruturaPalco criarEstrutura() {
        return new EstruturaRobusta();
    }
}
