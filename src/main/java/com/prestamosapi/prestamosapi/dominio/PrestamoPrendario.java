package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;

public class PrestamoPrendario extends Prestamo {
//    private Garantia garantia;

    public PrestamoPrendario(BigDecimal monto, Integer cuotas) {
        super(monto, cuotas);
    }
}
