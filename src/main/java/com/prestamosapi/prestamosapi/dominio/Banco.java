package com.prestamosapi.prestamosapi.dominio;

public class Banco {
    // Atributos
    private static Banco instancia;
    private String codigo;

    private Banco(String codigo) {
        this.codigo = codigo;
    }

    // Getters & Setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    //Funciones
    public static Banco obtenerBanco() {
        if(instancia == null) {
            instancia = new Banco("SAENZ");
        }
        return instancia;
    }

    public String toString() {
        return "Banco{" + "codigo=" + codigo + '}';
    }
}
