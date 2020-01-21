package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Prestamo implements ImprimirDatos {
    // Atributos
    private Banco banco;
    private BigDecimal monto;
//    private Integer plazoEnMeses;
    private Integer cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentos;
    private String estado;
    private LocalDate fechaAcreditacion;
    private LocalDate fechaAdjudicacion;

    // Constructores
    public Prestamo(Banco banco, BigDecimal monto, Integer cantidadCuotas){
        this.banco = banco;
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;
        this.estado = "ACTIVO";
    }
    
    // Getters & Setters
    public BigDecimal getMonto() {
        return monto;
    }
//    public void setMonto(BigDecimal monto) {
//        this.monto = monto;
//    }

//    public Integer getPlazoEnMeses() {
//        return plazoEnMeses;
//    }
//    public void setPlazoEnMeses(Integer plazoEnMeses) {
//        this.plazoEnMeses = plazoEnMeses;
//    }

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

    public Banco getBanco() {
        return banco;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaAcreditacion() {
        return fechaAcreditacion;
    }
    public void setFechaAcreditacion(LocalDate fechaAcreditacion) {
        this.fechaAcreditacion = fechaAcreditacion;
    }

    public LocalDate getFechaAdjudicacion() {
        return fechaAdjudicacion;
    }
    public void setFechaAdjudicacion(LocalDate fechaAdjudicacion) {
        this.fechaAdjudicacion = fechaAdjudicacion;
    }
     
    
    //Funciones
    public Boolean cancelarCuotas(Integer cantidadACancelar){
        int diferenciaDeCuotas = cantidadCuotas - cantidadACancelar;
        if(diferenciaDeCuotas >= 0){
            setCantidadCuotas(diferenciaDeCuotas);
            return true;
        }
        else {
            cancelarCuotas(cantidadACancelar - 1); //recursivo
        }
        return false;
    }
    
    public void cancelarPrestamo(){
        this.estado = "CANCELADO";
    }
    
    // toString default
    public String toString(){
        return "Monto: " + this.getMonto() + 
                " Cant. de cuotas: " + this.getCantidadCuotas();
    }

    // Implementación del método imprimirDatos() declarado en la interfaz ImprimirDatos
    @Override
    public void imprimirDatos() {
        System.out.println(this.getClass().getSimpleName() //"Impresión: "
                + " monto del préstamo = " + monto
                + ", cantidad de cuotas = " + cantidadCuotas
                + ", tasa = " + tasa
                + ", fecha de adjudicación = " + fechaAdjudicacion
                + ", fecha de acreditación = " + fechaAcreditacion
                + this.toString() //imprimo campos particulares de cada credito
                + ". Color de impresión: " + COLORDEFAULT);    
    }   
}
