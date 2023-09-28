package com.dcc.ufjf;

public class MedidorQuilometrosPraMetros implements IMedidorDistanciaEmMetros {
	@Override
	public float obterDistanciaEmMetros(float distancia) {
		return distancia * 1000.0f;
	}
}
