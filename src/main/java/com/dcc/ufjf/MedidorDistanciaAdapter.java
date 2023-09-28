package com.dcc.ufjf;

public class MedidorDistanciaAdapter {
    private IMedidorDistanciaEmMetros medidorDistanciaEmMetros;

    public MedidorDistanciaAdapter(IMedidorDistanciaEmMetros medidorDistanciaEmMetros) {
        this.medidorDistanciaEmMetros = medidorDistanciaEmMetros;
    }

    public float calcularDistancia(float distancia) throws Exception {
        if (medidorDistanciaEmMetros instanceof MedidorMilhasPraMetros) {
            return medidorDistanciaEmMetros.obterDistanciaEmMetros(distancia);
        } else if (medidorDistanciaEmMetros instanceof MedidorQuilometrosPraMetros) {
            return medidorDistanciaEmMetros.obterDistanciaEmMetros(distancia);
        } else {
            throw new Exception("Medidor de distância inválido");
        }
    }
}
