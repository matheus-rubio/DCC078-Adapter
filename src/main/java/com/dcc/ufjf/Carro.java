package com.dcc.ufjf;

public class Carro {
    private float distanciaPercorrida;
    private MedidorDistanciaAdapter medidorDistanciaEmMetros;

    public Carro(float distanciaPercorrida, MedidorDistanciaAdapter medidorDistanciaEmMetros) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.medidorDistanciaEmMetros = medidorDistanciaEmMetros;
    }

    public float getDistanciaPercorridaEmMetros() throws Exception {
        float distanciaPercorridaEmMetros = this.medidorDistanciaEmMetros.calcularDistancia(distanciaPercorrida);
        return distanciaPercorridaEmMetros;
    }
}

