package com.dcc.ufjf;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void testDistanciaPercorridaEmMetrosComMedidorQuilometros() throws Exception {
        float distanciaPercorrida = 5.0f; // 5 quilômetros
        IMedidorDistanciaEmMetros medidorQuilometros = new MedidorQuilometrosPraMetros();
        MedidorDistanciaAdapter adaptador = new MedidorDistanciaAdapter(medidorQuilometros);
        Carro carro = new Carro(distanciaPercorrida, adaptador);

        float distanciaEmMetros = carro.getDistanciaPercorridaEmMetros();

        assertEquals(5000.0f, distanciaEmMetros, 0.01); // 5 quilômetros = 5000 metros
    }

    @Test
    public void testDistanciaPercorridaEmMetrosComMedidorMilhas() throws Exception {
        float distanciaPercorrida = 3.0f; // 3 milhas
        IMedidorDistanciaEmMetros medidorMilhas = new MedidorMilhasPraMetros();
        MedidorDistanciaAdapter adaptador = new MedidorDistanciaAdapter(medidorMilhas);
        Carro carro = new Carro(distanciaPercorrida, adaptador);

        float distanciaEmMetros = carro.getDistanciaPercorridaEmMetros();

        assertEquals(4828.03f, distanciaEmMetros, 0.01); // 3 milhas ≈ 4828.03 metros
    }

    @Test
    public void testMedidorDistanciaInvalido() {
        float distanciaPercorrida = 5.0f;
        MedidorDistanciaAdapter adaptador = new MedidorDistanciaAdapter(null);
        Carro carro = new Carro(distanciaPercorrida, adaptador);

        assertThrows(Exception.class, () -> {
            carro.getDistanciaPercorridaEmMetros();
        });
    }
}
