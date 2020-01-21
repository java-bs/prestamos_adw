package com.prestamosapi.prestamosapi.dominio;

public class Banco {
    // Atributos
    private static Banco instancia;
    private String codigo;

    private Banco(String codigo) {
        this.codigo = codigo;
    }
   
    //Funciones
    public static Banco obtenerBanco() {
        if(instancia == null) {
            instancia = new Banco("SNZ");
        }
        return instancia;
    }
    
    //metódo perteneciente al objeto creado (la instancia)
    public String toString() {
        return "Banco{" + "codigo=" + codigo + '}';
    }
}
