package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;

public class PrestamoPersonal extends Prestamo {
    // Atributos
    private String situacionVeraz;

    //Constructores
    public PrestamoPersonal(Banco banco, BigDecimal monto, Integer cuotas, String situacionVeraz) {
        super(banco, monto, cuotas);
        this.situacionVeraz = situacionVeraz;
    }

    //Getters & Setters
    public String getSituacionVeraz() {
        return situacionVeraz;
    }
    public void setSituacionVeraz(String situacionVeraz) {
        this.situacionVeraz = situacionVeraz;
    }
        
    //Funciones
    @Override
    public String toString() {
//        return "PrestamoPersonal{" + "situacionVeraz= " + situacionVeraz + '}';
        return ", situacionVeraz= " + situacionVeraz;
    }
    
//    @Override ESTO SOBREESCRIBE el de Prestamo
//    public void imprimirDatos() {
//        super.imprimirDatos();
//    } 
}
