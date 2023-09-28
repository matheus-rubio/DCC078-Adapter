package com.dcc.ufjf;

public class MedidorMilhasPraMetros implements IMedidorDistanciaEmMetros {
    @Override
    public float obterDistanciaEmMetros(float distancia) {
        return distancia * 1609.34f;
    }
}
