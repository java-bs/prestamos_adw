package com.prestamosapi.prestamosapi.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Clientes implements ImprimirDatos {
    // Atributos
    private String dni;
    private String nombreApellido;
    private Domicilio domicilio;
    private BigDecimal ingresos;
    private DocumentoDigital dniDigitalizado;
    private Prestamo[] prestamos;
//    private CuentaBancaria cuentaBancaria;

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

    @Override
    public void imprimirDatos(){
        System.out.println("Cliente: Nombre= " + this.getNombreApellido() + ", dni= " + this.getDni() + 
                ", ingresos= " + this.getIngresos() + " domicilio: " + this.getDomicilio() 
                + ". Color de impresión:" + COLORSECUNDARIO);

// imprimo sin ordenamiento        
//                for(Prestamo prestamo : this.prestamos){
//                    prestamo.imprimirDatos();
//                }

// imprimo ordenando por fechaAcreditacion
                List<Prestamo> lista = Arrays.asList(prestamos);

// con Arrays de listas                
//                lista.sort(Comparator.comparing(Prestamo::getFechaAcreditacion));
//
//                for(Prestamo prestamo : lista){
//                    prestamo.imprimirDatos();
//                }

// con streams                
                lista
                        .stream()
                        .filter(pre -> pre.getFechaAcreditacion() != null) //acreditacion = null
                        .filter(pre -> pre.getFechaAcreditacion().compareTo(LocalDate.now()) < 0) // acreditacion < hoy
                        .sorted(Comparator.comparing(Prestamo::getFechaAcreditacion)) //ordena x acreditacion (asc).. .reversed() para desc.
                        .forEach(pre -> pre.imprimirDatos());
    }
        
}