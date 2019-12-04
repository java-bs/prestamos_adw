package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;

public class Prestamo {
    // Atributos
    private BigDecimal monto;
    private Integer plazoEnMeses;
    private Integer cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentos;

    // Constructores
    public Prestamo(BigDecimal monto, Integer cuotas){
        this.monto = monto;
        this.cantidadCuotas = cuotas;
    }
    
    // Getters & Setters
    public BigDecimal getMonto() {
        return monto;
    }
//    public void setMonto(BigDecimal monto) {
//        this.monto = monto;
//    }

    public Integer getPlazoEnMeses() {
        return plazoEnMeses;
    }
    public void setPlazoEnMeses(Integer plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }
    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }
    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public DocumentoDigital[] getDocumentos() {
        return documentos;
    }
    public void setDocumentos(DocumentoDigital[] documentos) {
        this.documentos = documentos;
    }
        
    //Funciones
    public boolean cancelarCuotas(Integer cantidad){
        return true;
    }
    
    public void cancelarPrestamo(){}
    
    public String toString(){
        return "Monto: " + this.getMonto() + " Plazo: " + this.getPlazoEnMeses() + 
                " Cant. de cuotas: " + this.getCantidadCuotas() + " Tasa: " + this.getTasa() ;
    }
}
