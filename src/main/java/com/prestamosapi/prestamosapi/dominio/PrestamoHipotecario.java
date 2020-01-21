package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;

public class PrestamoHipotecario extends Prestamo {
    
    // Atributos
    private String garantia;
    
    // Constructores
    public PrestamoHipotecario(Banco banco, BigDecimal monto, Integer cuotas, String garantia) {
        super(banco, monto, cuotas);
        this.garantia = garantia;
    }    

    // Getters & Setters
    public String getGarantia() {
        return garantia;
    }
    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    // Funciones
    @Override
    public String toString() {
//        return "PrestamoHipotecario{" + "garantia= " + garantia + '}';
        return ", garantia= " + garantia;
    }

//    @Override ESTO SOBREESCRIBE el de Prestamo
//    public void imprimirDatos() {
//        super.imprimirDatos();
//    }     
}
