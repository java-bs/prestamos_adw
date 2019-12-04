package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;

public class Clientes {
    // Atributos
//    private CuentaBancaria cuentaBancaria
    private String dni;
    private String nombreApellido;
    private Domicilio domicilio;
    private BigDecimal ingresos;
    private DocumentoDigital dniDigitalizado;
    private Prestamo[] prestamos;

    // Getters & Setters
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }
    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public DocumentoDigital getDniDigitalizado() {
        return dniDigitalizado;
    }
    public void setDniDigitalizado(DocumentoDigital dniDigitalizado) {
        this.dniDigitalizado = dniDigitalizado;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }
    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
    // Funciones
    public void cambiarDomicilio(Domicilio nuevoDomicilio){}
    
    public void actualizarIngresos(DocumentoDigital recibo, BigDecimal monto){}
    
    public String toString(){
        return "Cliente: " + this.getNombreApellido() + " dni: " + this.getDni() + 
                " ingresos: " + this.getIngresos() + " domicilio: " + this.getDomicilio();
    }
    
}