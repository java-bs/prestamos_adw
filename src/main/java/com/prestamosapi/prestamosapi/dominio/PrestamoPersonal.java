package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;

public class PrestamoPersonal extends Prestamo {
    // Atributos
    private String situacionVeraz;

    public PrestamoPersonal(BigDecimal monto, Integer cuotas) {
        super(monto, cuotas);
    }

    //Getters & Setters
    public String getSituacionVeraz() {
        return situacionVeraz;
    }
    public void setSituacionVeraz(String situacionVeraz) {
        this.situacionVeraz = situacionVeraz;
    }
        
}
